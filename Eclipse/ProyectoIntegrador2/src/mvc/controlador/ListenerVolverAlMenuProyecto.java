package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

public class ListenerVolverAlMenuProyecto implements ActionListener {

	ConsultaProyecto v;
	
	public ListenerVolverAlMenuProyecto(ConsultaProyecto vista) {
		
		v = vista;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
