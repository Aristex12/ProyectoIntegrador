package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaModificacion;
import mvc.vista.VistaModificacion;

public class ListenerAtrasBusquedaMod implements ActionListener {

	BusquedaModificacion v;
	
	public ListenerAtrasBusquedaMod(BusquedaModificacion vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaModificacion ventana = new VistaModificacion();
		ventana.hacerVisible();

	}

}
