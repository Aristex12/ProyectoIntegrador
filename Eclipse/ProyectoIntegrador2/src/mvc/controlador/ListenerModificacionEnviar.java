package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

public class ListenerModificacionEnviar implements ActionListener {

	public VistaModificacion v;
	
	public ListenerModificacionEnviar(VistaModificacion vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		BusquedaModificacion ventana = new BusquedaModificacion();
		ventana.hacerVisible();
		
	}
	
}
