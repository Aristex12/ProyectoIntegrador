package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alumno;
import mvc.modelo.Proyectos;
import mvc.vista.BusquedaDarBaja;
import mvc.vista.VistaBaja;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerBajaEnviar</h3>
 *   <div class="card-body">
 *     <p>El ListenerBajaEnviar es un controlador que maneja las acciones realizadas al presionar el botón "Enviar" en la vista de baja.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerBajaEnviar implements ActionListener {

	VistaBaja v;
	public AccesoBD accesobd;

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerBajaEnviar</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerBajaEnviar.</p>
	 *
	 *     @param vista La vista de baja asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerBajaEnviar(VistaBaja vista) {

		v = vista;

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Enviar" en la vista de baja.</p>
	 *     <p>Despliega la vista de búsqueda de baja correspondiente según la opción seleccionada (alumno o proyecto).</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (comprobarInputs()) {

			v.dispose();

			if (v.getAlumnoRadioButton().isSelected()) {
				ArrayList<Alumno> a = opcionAlumno();
				BusquedaDarBaja bc = new BusquedaDarBaja();
				bc.rellenarListaAlumnos(a);
				bc.setVisible(true);
			} else if (v.getProyectoRadioButton().isSelected()) {
				ArrayList<Proyectos> b = opcionProyecto();
				BusquedaDarBaja bc = new BusquedaDarBaja();
				bc.rellenarListaProyectos(b);
				bc.setVisible(true);
			}

		}

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">opcionAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Realiza una consulta en la base de datos para obtener la lista de alumnos que coinciden con el nombre ingresado en la vista de baja.</p>
	 *     <p>Si no se ingresa ningún nombre, se obtienen todos los alumnos.</p>
	 *
	 *     @return La lista de alumnos obtenida de la base de datos.
	 *   </div>
	 * </div>
	 */
	public ArrayList<Alumno> opcionAlumno() {

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String nombre = v.getInputNombre().getText().trim();

		if (nombre.equals("")) {

			query = "SELECT * FROM alumnos";

		} else {

			query = "SELECT * FROM alumnos WHERE nombre='" + nombre + "';";

		}

		return acceso.añadirAlumnoALista(query);
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">opcionProyecto</h3>
	 *   <div class="card-body">
	 *     <p>Realiza una consulta en la base de datos para obtener la lista de proyectos que coinciden con el nombre ingresado en la vista de baja.</p>
	 *     <p>Si no se ingresa ningún nombre, se obtienen todos los proyectos.</p>
	 *
	 *     @return La lista de proyectos obtenida de la base de datos.
	 *   </div>
	 * </div>
	 */
	public ArrayList<Proyectos> opcionProyecto() {

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String nombre = v.getInputNombre().getText().trim();

		if (nombre.equals("")) {

			query = "SELECT * FROM proyectos";

		} else {

			query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombre + "';";

		}

		return acceso.añadirProyectoALista(query);

	}

	public boolean comprobarInputs() {

		boolean flag = true;

		if (v.getInputNombre().getText().matches(".*\\d+.*")) {
			v.getLabelError().setText("Error nombre!");
			flag = false;
		}

		return flag;

	}

}
