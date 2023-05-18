package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConsulta;
import mvc.vista.VistaMenuPrincipal;

public class ListenerMenuPrincipalConsulta implements ActionListener {

	public VistaMenuPrincipal v;
	
	public ListenerMenuPrincipalConsulta(VistaMenuPrincipal vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaConsulta ventana = new VistaConsulta();
		ventana.hacerVisible();

	}

}
