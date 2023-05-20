package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.*;
import mvc.vista.*;

public class ListenerModificacionEnviar implements ActionListener {

	public VistaModificacion v;

	public ListenerModificacionEnviar(VistaModificacion vista) {
		v = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

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

}
