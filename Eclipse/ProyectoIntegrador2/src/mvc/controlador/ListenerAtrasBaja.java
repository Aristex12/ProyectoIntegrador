package mvc.controlador;
import mvc.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerAtrasBaja implements ActionListener {

	public Baja v;
	
	public ListenerAtrasBaja(Baja vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();
		
	}

	
	
}
