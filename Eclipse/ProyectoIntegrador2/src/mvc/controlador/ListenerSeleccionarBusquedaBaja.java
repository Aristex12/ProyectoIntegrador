package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaDarBaja;
import mvc.vista.SeguroBaja;
import mvc.vista.VistaConfirmacionAlta;
import mvc.vista.VistaConfirmacionBaja;

public class ListenerSeleccionarBusquedaBaja implements ActionListener {

	BusquedaDarBaja v;
	
	public ListenerSeleccionarBusquedaBaja(BusquedaDarBaja vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		SeguroBaja ventana = new SeguroBaja(v); // Pasamos la referencia de la vista aquí
		ventana.hacerVisible();
	}

}
