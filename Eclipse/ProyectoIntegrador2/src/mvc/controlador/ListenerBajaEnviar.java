package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import mvc.modelo.*;
import mvc.vista.*;

public class ListenerBajaEnviar implements ActionListener {

	VistaBaja v;
	public AccesoBD accesobd;
	
	public ListenerBajaEnviar(VistaBaja vista) {
		
		v = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		
		if(v.getAlumnoRadioButton().isSelected()) {
			ArrayList<Alumno> a = opcionAlumno();
			BusquedaDarBaja bc = new BusquedaDarBaja();
			bc.rellenarListaAlumnos(a);
			bc.setVisible(true);
		} else if(v.getProyectoRadioButton().isSelected()){
			ArrayList<Proyectos> b = opcionProyecto();
			BusquedaDarBaja bc = new BusquedaDarBaja();
			bc.rellenarListaProyectos(b);
			bc.setVisible(true);
		}

	}
	
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
}
