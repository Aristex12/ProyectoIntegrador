package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import mvc.modelo.Modificacion;
import mvc.vista.ModificacionAlumnos;

public class ListenerModificarAlumno implements ActionListener {

	ModificacionAlumnos v;
	Modificacion acceso = new Modificacion();
	
	public ListenerModificarAlumno(ModificacionAlumnos vista) {
		
		v = vista;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(comprobarCampos()) {
			
			cambiarValoresAlumno();
			
		} else {
			
			
			
		}
		
	}
	
	public boolean comprobarCampos() {
		
		boolean flag = false;
		

		acceso.comprobarCambiosAlumno();
		
		if(acceso.getNombre() != v.getNombreTextField().getText()) {
			flag = true;
		} else if(acceso.getApellidos() != v.getApellidosTextField().getText()) {
			flag = true;
		}
		
		return flag;
		
	}
	
	public void cambiarValoresAlumno() {
		
		acceso.setMatricula(v.getMatriculaTextField().getText());
		acceso.setNombre(v.getNombreTextField().getText());
		acceso.setApellidos(v.getApellidosTextField().getText());
		
	}
	
}
