package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.Baja;
import mvc.vista.VistaMenuPrincipal;

public class ListenerMenuPrincipalDarBaja implements ActionListener {

	public VistaMenuPrincipal v;
	
	public ListenerMenuPrincipalDarBaja(VistaMenuPrincipal vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		Baja ventana = new Baja();
		ventana.hacerVisible();

	}

}
