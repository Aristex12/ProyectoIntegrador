package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alumno;
import mvc.modelo.Proyectos;
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
			BusquedaConsulta bc = new BusquedaConsulta();
			bc.rellenarListaAlumnos(a);
			bc.setVisible(true);
		} else {
			ArrayList<Proyectos> b = opcionProyecto();
			BusquedaConsulta bc = new BusquedaConsulta();
			bc.rellenarListaProyectos(b);
			bc.setVisible(true);
		}

	}

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

	public ArrayList<Proyectos> opcionProyecto() {

		v.dispose();

		AccesoBD acceso = new AccesoBD();

		String query = "";
		String idProyecto = v.getCampoIdProyecto().getText().trim();
		String nombre = v.getCampoNombre().getText().trim();

		if (nombre.equals("") && idProyecto.equals("")) {

			query = "SELECT * FROM proyectos";

		} else if (!(v.getCampoNombre().getText().equals(""))) {

			query = "SELECT * FROM proyectos WHERE nombre='" + nombre + "';";

		} else {

			query = "SELECT * FROM proyectos WHERE idProyecto='" + idProyecto + "';";

		}

		return acceso.añadirProyectoALista(query);

	}

}
