package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaDarBaja;
import mvc.vista.VistaBaja;

public class ListenerAtrasBusquedaBaja implements ActionListener {

	BusquedaDarBaja v;
	
	public ListenerAtrasBusquedaBaja(BusquedaDarBaja vista) {
		v = vista;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaBaja ventana = new VistaBaja();
		ventana.hacerVisible();

	}

}
