package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaMenuPrincipal;

public class ListenerVolverAlMenu implements ActionListener {

	VistaMenuPrincipal v;
	
	public ListenerVolverAlMenu(VistaMenuPrincipal vista) {
		
		v = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
