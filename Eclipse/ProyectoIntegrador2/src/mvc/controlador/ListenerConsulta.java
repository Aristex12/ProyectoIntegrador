package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alumno;
import mvc.modelo.Area;
import mvc.modelo.Proyectos;
import mvc.vista.BusquedaConsulta;
import mvc.vista.VistaConsulta;

/**
 * <div class="card">
 * <h3 class="card-title">ListenerConsulta</h3> <div class="card-body">
 * <p>
 * El ListenerConsulta es un controlador que maneja las acciones realizadas al
 * realizar una consulta en la vista de consulta.
 * </p>
 * <p>
 * Implementa la interfaz ActionListener para poder capturar y manejar eventos
 * de acción.
 * </p>
 * <p>
 * Autor: Aris, Josep, Dani y Miguel
 * </p>
 * <p>
 * Versión: 1.0
 * </p>
 * </div> </div>
 */
public class ListenerConsulta implements ActionListener {

	public VistaConsulta v;
	public AccesoBD accesobd;

	/**
	 * <div class="card">
	 * <h3 class="card-title">Constructor de la clase ListenerConsulta</h3>
	 * <div class="card-body">
	 * <p>
	 * Construye una instancia de ListenerConsulta.
	 * </p>
	 *
	 * @param vista La vista de consulta asociada a este controlador. </div> </div>
	 */
	public ListenerConsulta(VistaConsulta vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 * <h3 class="card-title">actionPerformed</h3> <div class="card-body">
	 * <p>
	 * Maneja los eventos de acción generados al realizar una consulta en la vista
	 * de consulta.
	 * </p>
	 *
	 * @param e El evento de acción. </div> </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		accesobd = new AccesoBD();

		if (comprobarInputs(accesobd)) {
			accesobd.getConexion();

			if (v.getRadioAlumno().isSelected()) {
				ArrayList<Alumno> a = opcionAlumno();
				BusquedaConsulta bc = new BusquedaConsulta();
				bc.rellenarListaAlumnos(a);
				bc.setVisible(true);
			} else if (v.getRadioProyecto().isSelected()) {
				ArrayList<Proyectos> b = opcionProyecto();
				BusquedaConsulta bc = new BusquedaConsulta();
				bc.rellenarListaProyectos(b);
				bc.setVisible(true);
			} else {
				ArrayList<Area> c = opcionArea();
				BusquedaConsulta bc = new BusquedaConsulta();
				bc.rellenarListaArea(c);
				bc.setVisible(true);
			}
		}

	}

	/**
	 * <div class="card">
	 * <h3 class="card-title">opcionAlumno</h3> <div class="card-body">
	 * <p>
	 * Realiza una consulta en la base de datos para obtener la lista de alumnos
	 * según los criterios especificados en la vista.
	 * </p>
	 *
	 * @return La lista de alumnos obtenida de la base de datos. </div> </div>
	 */
	public ArrayList<Alumno> opcionAlumno() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String idProyecto = v.getCampoIdProyecto().getText().trim();
		String nombre = v.getCampoNombre().getText().trim();

		if (nombre.equals("") && idProyecto.equals("")) {

			query = "SELECT * FROM alumnos";

		} else if (!(v.getCampoNombre().getText().equals(""))) {

			query = "SELECT * FROM alumnos WHERE nombre='" + nombre + "';";

		} else {

			query = "SELECT * FROM alumnos WHERE idProyectoFK='" + idProyecto + "';";

		}

		return acceso.añadirAlumnoALista(query);
	}

	/**
	 * <div class="card">
	 * <h3 class="card-title">opcionProyecto</h3> <div class="card-body">
	 * <p>
	 * Realiza una consulta en la base de datos para obtener la lista de proyectos
	 * según los criterios especificados en la vista.
	 * </p>
	 *
	 * @return La lista de proyectos obtenida de la base de datos. </div> </div>
	 */
	public ArrayList<Proyectos> opcionProyecto() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String idProyecto = v.getCampoIdProyecto().getText().trim();
		String nombre = v.getCampoNombre().getText().trim();

		if (nombre.equals("") && idProyecto.equals("")) {

			query = "SELECT * FROM proyectos";

		} else if (!(v.getCampoNombre().getText().equals(""))) {

			query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombre + "';";

		} else {

			query = "SELECT * FROM proyectos WHERE idProyecto='" + idProyecto + "';";

		}

		return acceso.añadirProyectoALista(query);

	}

	/**
	 * <div class="card">
	 * <h3 class="card-title">opcionArea</h3> <div class="card-body">
	 * <p>
	 * Realiza una consulta en la base de datos para obtener la lista de áreas según
	 * los criterios especificados en la vista.
	 * </p>
	 *
	 * @return La lista de áreas obtenida de la base de datos. </div> </div>
	 */
	public ArrayList<Area> opcionArea() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String idProyecto = v.getCampoIdProyecto().getText().trim();
		String nombre = v.getCampoNombre().getText().trim();

		if (nombre.equals("") && idProyecto.equals("")) {

			query = "SELECT * FROM areas";

		} else {

			query = "SELECT * FROM areas WHERE nombre='" + nombre + "';";

		}
		;

		return acceso.añadirAreaALista(query);

	}

	public boolean comprobarInputs(AccesoBD acceso) {

		boolean flag = true;

		if (v.getCampoNombre().getText().matches(".*\\d+.*")) {
			v.getError().setText("Error nombre!");
			flag = false;
		} else if (v.getCampoIdProyecto().getText().matches(".*[a-zA-Z].*")) {
			v.getError().setText("Error ID!");
			flag = false;
		}

		return flag;

	}

}
