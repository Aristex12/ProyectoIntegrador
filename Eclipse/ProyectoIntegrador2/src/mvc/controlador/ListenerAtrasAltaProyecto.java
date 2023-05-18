package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.AltaProyecto;
import mvc.vista.VistaDarAlta;

public class ListenerAtrasAltaProyecto implements ActionListener {

	AltaProyecto v;
	
	public ListenerAtrasAltaProyecto(AltaProyecto vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaDarAlta ventana = new VistaDarAlta();
		ventana.hacerVisible();

	}

}
