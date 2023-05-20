package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Alta;
import mvc.vista.VistaAltaAlumno;
import mvc.vista.VistaConfirmacionAlta;

public class ListenerAltaAlumno implements ActionListener {

	VistaAltaAlumno v;
	
	public ListenerAltaAlumno(VistaAltaAlumno vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Alta acceso = new Alta();
		acceso.getConexion();
		
		String matricula = v.getTxtNumero().getText();
		acceso.setMatricula(matricula);
		
		if(acceso.comprobarMatriculaAlumno()) {
			
			v.dispose();
			
			acceso.setNombre(v.getTxtNombre().getText().trim());
			acceso.setApellidos(v.getTxtApellido().getText().trim());
			acceso.setMatricula(v.getTxtNumero().getText());
			acceso.setIdProyectoAlumno(v.getTxtId().getText());
			acceso.insertarAlumno();
			
			VistaConfirmacionAlta ventana = new VistaConfirmacionAlta();
			ventana.hacerVisible();
			
		} else {
			
			v.getLabelError().setText("Alumno ya existe!");
			
		}
		

	}

}
