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

		if (comprobarInputs(acceso) && comprobarId(acceso)) {
			String matricula = v.getTxtNumero().getText();
			acceso.setMatricula(matricula);

			if (acceso.comprobarMatriculaAlumno()) {

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

	public boolean comprobarInputs(Alta acceso) {

		boolean flag = true;

		if (v.getTxtNombre().getText().matches(".*\\d+.*") || v.getTxtNombre().getText().equals("")) {
			v.getLabelError().setText("Error nombre!");
			flag = false;
		} else if (v.getTxtApellido().getText().matches(".*\\d+.*") || v.getTxtApellido().getText().equals("")) {
			v.getLabelError().setText("Error apellidos!");
			flag = false;
		} else if (v.getTxtNumero().getText().matches(".*[a-zA-Z].*") || v.getTxtNumero().getText().equals("") || v.getTxtNumero().getText().length() < 8 || v.getTxtNumero().getText().length() < 8) {
			v.getLabelError().setText("Error matricula!");
			flag = false;
		} else if (v.getTxtId().getText().matches(".*[a-zA-Z].*") || v.getTxtId().getText().equals("")) {
			v.getLabelError().setText("Error con ID!");
			flag = false;
		}

		return flag;

	}

	public boolean comprobarId(Alta acceso) {

		boolean flag = false;
		
		acceso.setIdProyectoAlumno(v.getTxtId().getText());

		if (acceso.comprobarIdProyecto()) {
			flag = true;
		} else {
			v.getLabelError().setText("ID no existe!");
		}

		return flag;
	}

}
