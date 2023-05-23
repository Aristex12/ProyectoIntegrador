package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Modificacion;
import mvc.vista.*;

public class ListenerEnviarModificacionProyecto implements ActionListener {

	ModificacionProyecto v;
	Modificacion acceso = new Modificacion();
	
	public ListenerEnviarModificacionProyecto(ModificacionProyecto vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (comprobarCampos()) {

			cambiarValoresProyecto();

		} else {

			v.getLabelError().setText("No hay modificaciones!");

		}

	}
	
	
	public boolean comprobarCampos() {

		boolean flag = false;

		acceso.comprobarCambiosProyecto();

		
		if (acceso.getNombre() != v.getNombreTextField().getText()) {
			flag = true;
		} else if (acceso.getCurso() != v.getAreaCombo().getSelectedItem()) {
			flag = true;
		} else if(acceso.getNombreArea() != (String)v.getComboCurso().getSelectedItem()) {
			flag = true;
		} else if(acceso.getNota() != (Integer)v.getNotasSpinner().getValue()) {
			flag = true;
		}

		return flag;

	}

	public void cambiarValoresProyecto() {

		acceso.setNombreProyecto(v.getNombreTextField().getText());
		acceso.setNombreArea((String) v.getComboCurso().getSelectedItem());
		acceso.setCurso((String)v.getComboCurso().getSelectedItem());
		acceso.setNota((Integer)v.getNotasSpinner().getValue());
		acceso.insertarNuevosDatosProyecto();

		ConfirmacionModificacion ventana = new ConfirmacionModificacion();
		ventana.hacerVisible();

	}

}
