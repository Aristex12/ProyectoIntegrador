package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ModificacionAlumnos;
import mvc.vista.VistaModificacion;

public class ListenerAtrasModificarAlumnos implements ActionListener {

	ModificacionAlumnos v;
	
	public ListenerAtrasModificarAlumnos(ModificacionAlumnos vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaModificacion ventana = new VistaModificacion();
		ventana.hacerVisible();

	}

}
