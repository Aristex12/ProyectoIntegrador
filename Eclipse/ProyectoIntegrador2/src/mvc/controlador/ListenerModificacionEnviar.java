package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.*;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerModificacionEnviar</h3>
 *   <div class="card-body">
 *     <p>El ListenerModificacionEnviar es un controlador que maneja las acciones realizadas al enviar una modificación en la vista de modificación.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerModificacionEnviar implements ActionListener {

	public VistaModificacion v;

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerModificacionEnviar</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerModificacionEnviar.</p>
	 *
	 *     @param vista La vista de modificación asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerModificacionEnviar(VistaModificacion vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al enviar una modificación en la vista de modificación.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if(comprobarInputs()) {
			if (v.getRadioAlumno().isSelected()) {
				ArrayList<Alumno> a = opcionAlumno();
				BusquedaModificacion bc = new BusquedaModificacion();
				bc.rellenarListaAlumnos(a);
				bc.setVisible(true);
			} else {
				ArrayList<Proyectos> c = opcionProyecto();
				BusquedaModificacion bc = new BusquedaModificacion();
				bc.rellenarListaProyectos(c);
				bc.setVisible(true);
			}
		}

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">opcionAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Realiza la opción de búsqueda de alumnos en la base de datos según los parámetros ingresados en la vista de modificación.</p>
	 *
	 *     @return La lista de alumnos encontrados.
	 *   </div>
	 * </div>
	 */
	public ArrayList<Alumno> opcionAlumno() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String nombre = v.getCampoNombre().getText().trim();

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
	 *     <p>Realiza la opción de búsqueda de proyectos en la base de datos según los parámetros ingresados en la vista de modificación.</p>
	 *
	 *     @return La lista de proyectos encontrados.
	 *   </div>
	 * </div>
	 */
	public ArrayList<Proyectos> opcionProyecto() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String nombre = v.getCampoNombre().getText().trim();

		if (nombre.equals("")) {

			query = "SELECT * FROM proyectos";

		} else {

			query = "SELECT * FROM proyectos WHERE nombre='" + nombre + "';";

		}

		return acceso.añadirProyectoALista(query);

	}
	
	public boolean comprobarInputs() {

		boolean flag = true;

		if (v.getCampoNombre().getText().matches(".*\\d+.*")) {
			v.getError().setText("Error nombre!");
			flag = false;
		}

		return flag;

	}

}

