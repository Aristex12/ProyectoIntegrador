package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaConsulta;
import mvc.vista.VistaAltaAlumno;
import mvc.vista.VistaConsulta;

public class ListenerAtrasBusquedaConsulta implements ActionListener {

	BusquedaConsulta v;
	
	public ListenerAtrasBusquedaConsulta(BusquedaConsulta vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaConsulta ventana = new VistaConsulta();
		ventana.hacerVisible();

	}

}
