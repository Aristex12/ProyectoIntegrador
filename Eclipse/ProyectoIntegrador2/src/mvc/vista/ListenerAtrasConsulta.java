package mvc.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerAtrasConsulta implements ActionListener {

	VistaConsulta v;
	
	public ListenerAtrasConsulta(VistaConsulta vistaConsulta) {
		v = vistaConsulta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
