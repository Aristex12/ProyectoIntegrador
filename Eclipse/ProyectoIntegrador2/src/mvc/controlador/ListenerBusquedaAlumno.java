package mvc.controlador;
import mvc.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBusquedaAlumno implements ActionListener {

	public BusquedaAlumno v;
	
	public ListenerBusquedaAlumno(BusquedaAlumno vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
