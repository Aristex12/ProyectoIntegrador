package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConfirmacionAlta;
import mvc.vista.VistaMenuPrincipal;

public class ListenerVolverMenuConfirmacionAlumno implements ActionListener {

	VistaConfirmacionAlta v;
	
	public ListenerVolverMenuConfirmacionAlumno(VistaConfirmacionAlta vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
