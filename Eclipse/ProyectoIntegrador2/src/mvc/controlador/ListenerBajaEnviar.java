package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

public class ListenerBajaEnviar implements ActionListener {

	Baja v;
	
	public ListenerBajaEnviar(Baja vista) {
		
		v = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		BusquedaDarBaja ventana = new BusquedaDarBaja();
		ventana.hacerVisible();

	}

}
