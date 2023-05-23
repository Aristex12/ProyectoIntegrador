package mvc.controlador;
import mvc.modelo.Alta;
import mvc.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerAltaProyecto implements ActionListener {
	
	public AltaProyecto v;
	
	public ListenerAltaProyecto(AltaProyecto vista) {
		v = vista;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Alta acceso = new Alta();
		acceso.getConexion();

		if(comprobarInputs(acceso)) {
			
			String nombre = v.getInputNombre().getText();
			acceso.setNombreProyecto(nombre);
			
			if(acceso.comprobarNombreProyecto()) {
				
				v.dispose();
				
				acceso.setNombreProyecto(v.getInputNombre().getText());
				acceso.setAno((String) v.getCursoComboBox().getSelectedItem());
				acceso.setArea((String) v.getAreaComboBox().getSelectedItem());
				acceso.setNota((int) v.getNotasSpinner().getValue());
				acceso.setGithub(v.getInputUrl().getText());
				acceso.insertarProyecto();
				
				VistaConfirmacionAlta ventana = new VistaConfirmacionAlta();
				ventana.hacerVisible();
				
			} else {
				
				v.getLabelError().setText("Proyecto ya existe!");
				
			}
			
		}
		
	}
	
	public boolean comprobarInputs(Alta acceso) {

		boolean flag = true;

		if (v.getInputNombre().getText().matches(".*\\d+.*") || v.getInputNombre().getText().equals("")) {
			v.getLabelError().setText("Error nombre!");
			flag = false;
		} else if(v.getInputUrl().getText().equals("")) {
			v.getLabelError().setText("Error github!");
			flag = false;
		}

		return flag;

	}
	
}
