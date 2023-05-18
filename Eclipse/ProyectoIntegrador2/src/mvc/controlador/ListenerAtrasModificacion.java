package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaMenuPrincipal;
import mvc.vista.VistaModificacion;

public class ListenerAtrasModificacion implements ActionListener {

	VistaModificacion v;
	
	public ListenerAtrasModificacion(VistaModificacion vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
