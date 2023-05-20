package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConfirmacionBaja;
import mvc.vista.VistaMenuPrincipal;

public class ListenerVolverAlMenuConfirmacionBaja implements ActionListener {

	VistaConfirmacionBaja v;
	
	public ListenerVolverAlMenuConfirmacionBaja(VistaConfirmacionBaja vista) {
		
		v = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
