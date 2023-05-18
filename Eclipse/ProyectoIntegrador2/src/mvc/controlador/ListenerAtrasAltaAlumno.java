package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.vista.*;

public class ListenerAtrasAltaAlumno implements ActionListener {

	VistaAltaAlumno v;
	
	public ListenerAtrasAltaAlumno(VistaAltaAlumno vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaDarAlta ventana = new VistaDarAlta();
		ventana.hacerVisible();

	}

}
