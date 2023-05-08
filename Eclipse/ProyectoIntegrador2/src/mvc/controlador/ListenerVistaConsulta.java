package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

public class ListenerVistaConsulta implements ActionListener {

	public VistaConsulta v;
	
	public ListenerVistaConsulta(VistaConsulta vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
