package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.AccesoBD;
import mvc.modelo.Alumno;
import mvc.vista.*;

public class ListenerConsulta implements ActionListener {

	public VistaConsulta v;

	public ListenerConsulta(VistaConsulta vista) {
		v = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int num = 0;

		if (v.getRadioAlumno().isSelected()) {
			num = 1;
		} else {
			num = 0;
		}

		switch (num) {

		case 1:

			opcionAlumno();

		case 2:

			opcionProyecto();

		}

	}

	public void opcionAlumno() {

		AccesoBD acceso = new AccesoBD();
		BusquedaConsulta busqueda = new BusquedaConsulta();
		
		String query = "";
		String seleccion = (String) v.getLista().getSelectedItem();
		
		if(v.getCampoNombre().getText().equals("") && 
				seleccion.equals("")) {
			
			v.getError().setText("Tienes que introducir algun dato!");
			
		} else if(v.getCampoNombre().getText().equals("")) {
			
			query = "SELECT * FROM proyectos WHERE proyectos='" + seleccion + "';";
			
		} else {
			
			query = "SELECT * FROM proyectos WHERE nombre='" + seleccion + "';";
			
		}
		
		
		
	}

	public void opcionProyecto() {

		v.dispose();
		BusquedaConsulta busqueda = new BusquedaConsulta();
		busqueda.hacerVisible();
		
	}

}
