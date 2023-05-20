package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.SeguroBaja;
import mvc.vista.VistaMenuPrincipal;

public class ListenerVolverAlMenuSeguroBaja implements ActionListener {

	SeguroBaja v;
	
	public ListenerVolverAlMenuSeguroBaja(SeguroBaja vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();

	}

}
