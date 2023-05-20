package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

public class ListenerVistaDarAltaEnviar implements ActionListener {

	public VistaDarAlta v;
	
	public ListenerVistaDarAltaEnviar(VistaDarAlta vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		
		if(v.getOpcionAlumno().isSelected()) {
			VistaAltaAlumno ventana = new VistaAltaAlumno();
			ventana.hacerVisible();
		} else if(v.getOpcionProyecto().isSelected()){
			AltaProyecto ventana = new AltaProyecto();
			ventana.hacerVisible();
		}
		
	}
	
}
