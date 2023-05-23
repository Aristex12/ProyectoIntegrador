package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alta;
import mvc.modelo.Alumno;
import mvc.modelo.Area;
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
		
		if(comprobarInputs(accesobd)) {
			accesobd.getConexion();

			if (v.getRadioAlumno().isSelected()) {
				ArrayList<Alumno> a = opcionAlumno();
				BusquedaConsulta bc = new BusquedaConsulta();
				bc.rellenarListaAlumnos(a);
				bc.setVisible(true);
			} else if(v.getRadioProyecto().isSelected()){
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

			query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombre + "';";

		} else {

			query = "SELECT * FROM proyectos WHERE idProyecto='" + idProyecto + "';";

		}

		return acceso.añadirProyectoALista(query);

	}
	
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

		};

		return acceso.añadirAreaALista(query);

	}
	
	public boolean comprobarInputs(AccesoBD acceso) {

		boolean flag = true;

		if (v.getCampoNombre().getText().matches(".*\\d+.*") || v.getCampoNombre().getText().equals("")) {
			v.getError().setText("Error nombre!");
			flag = false;
		} else if(v.getCampoIdProyecto().getText().matches(".*[a-zA-Z].*") || v.getCampoIdProyecto().getText().equals("") || v.getCampoIdProyecto().getText().length() > 8 || v.getCampoIdProyecto().getText().length() < 8){
			v.getError().setText("Error ID!");
			flag = false;
		}

		return flag;

	}

}
