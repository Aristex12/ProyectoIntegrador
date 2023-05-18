package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.AltaArea;
import mvc.vista.VistaDarAlta;
import mvc.vista.VistaMenuPrincipal;

public class ListenerAtrasDarAlta implements ActionListener {

	VistaDarAlta v;
	
	public ListenerAtrasDarAlta(VistaDarAlta vistaDarAlta) {
		v = vistaDarAlta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
