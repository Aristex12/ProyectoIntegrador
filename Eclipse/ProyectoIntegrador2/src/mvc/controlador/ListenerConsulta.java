package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alumno;
import mvc.vista.*;

public class ListenerConsulta implements ActionListener {

	public VistaConsulta v;
	public AccesoBD accesobd;

	public ListenerConsulta(VistaConsulta vista) {
		v = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		accesobd = new AccesoBD();
		accesobd.getConexion();
		if (v.getRadioAlumno().isSelected()) {
			ArrayList<Alumno> a = opcionAlumno();
			//pasamos este arraylist a la vista
			//y lo mostramos en una lista que tiene que estar creada allí
			BusquedaConsulta bc = new BusquedaConsulta();
			bc.rellenarListaAlumnos(a);
			bc.setVisible(true);
		} else {
			opcionProyecto();
		}

	}

	public ArrayList<Alumno> opcionAlumno() {

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

	public void opcionProyecto() {

		v.dispose();
		BusquedaConsulta busqueda = new BusquedaConsulta();
		busqueda.hacerVisible();

	}

}
