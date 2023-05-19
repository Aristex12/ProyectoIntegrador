package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConsultaAlumno;
import mvc.vista.VistaMenuPrincipal;

public class ListenerVolverAlMenuAlumno implements ActionListener {

	ConsultaAlumno v;
	
	public ListenerVolverAlMenuAlumno(ConsultaAlumno vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
