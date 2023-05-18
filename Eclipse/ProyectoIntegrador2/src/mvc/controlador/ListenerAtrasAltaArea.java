package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.vista.*;
import mvc.vista.VistaDarAlta;

public class ListenerAtrasAltaArea implements ActionListener {

	AltaArea v;
	
	public ListenerAtrasAltaArea(AltaArea vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaDarAlta ventana = new VistaDarAlta();
		ventana.hacerVisible();

	}

}
