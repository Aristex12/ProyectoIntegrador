package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaMenuPrincipal;
import mvc.vista.VistaModificacion;

public class ListenerMenuPrincipalModificacion implements ActionListener {

	public VistaMenuPrincipal v;
	
	public ListenerMenuPrincipalModificacion(VistaMenuPrincipal vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaModificacion ventana = new VistaModificacion();
		ventana.hacerVisible();

	}

}
