package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ModificacionProyecto;
import mvc.vista.VistaMenuPrincipal;

public class ListenerAtrasModificacionProyecto implements ActionListener {

	ModificacionProyecto v;
	
	public ListenerAtrasModificacionProyecto(ModificacionProyecto vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
