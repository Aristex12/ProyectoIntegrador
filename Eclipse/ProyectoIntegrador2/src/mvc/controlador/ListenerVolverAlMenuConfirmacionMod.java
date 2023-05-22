package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConfirmacionModificacion;

public class ListenerVolverAlMenuConfirmacionMod implements ActionListener {

	ConfirmacionModificacion v;
	
	public ListenerVolverAlMenuConfirmacionMod(ConfirmacionModificacion vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();

	}

}
