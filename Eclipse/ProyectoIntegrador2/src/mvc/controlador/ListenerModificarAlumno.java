package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import mvc.vista.ModificacionAlumnos;

public class ListenerModificarAlumno implements DocumentListener {

	ModificacionAlumnos v;
	private boolean flag = false;
	
	public ListenerModificarAlumno(ModificacionAlumnos vista) {
		
		v = vista;
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		
		setFlag(true);
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		
		setFlag(true);
		
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		
		setFlag(true);
		
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public class ListenerModificacionAlumnoEnviar implements ActionListener {

		ModificacionAlumnos v;
		
		public ListenerModificacionAlumnoEnviar(ModificacionAlumnos vista) {
			v = vista;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			

		}
		
		
		

	}
	
}
