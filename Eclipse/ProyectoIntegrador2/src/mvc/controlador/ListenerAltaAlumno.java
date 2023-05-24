package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Alta;
import mvc.vista.VistaAltaAlumno;
import mvc.vista.VistaConfirmacionAlta;

/**
 * <h1>ListenerAltaAlumno</h1>
 * <p>La clase ListenerAltaAlumno implementa la interfaz ActionListener, proporcionando funcionalidad a los botones de la interfaz gráfica de usuario VistaAltaAlumno.</p>
 */

public class ListenerAltaAlumno implements ActionListener {

	VistaAltaAlumno v;

	/**
     * <p>El constructor de la clase ListenerAltaAlumno.</p>
     *
     * @param vista Es un objeto de tipo VistaAltaAlumno que representa la vista que utiliza este Listener.
     */
	
	public ListenerAltaAlumno(VistaAltaAlumno vista) {
		v = vista;
	}

	/**
     * <p>Este método se activa cuando el usuario interactúa con el elemento de la interfaz de usuario que tiene asignado este Listener.</p>
     * <p>Se encarga de recoger los datos del formulario de la vista y comprobarlos para luego realizar el alta de un alumno.</p>
     *
     * @param e Es el evento que se genera cuando se interactúa con el elemento de la interfaz de usuario.
     */
	
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
	
	/**
     * <p>El método comprobarInputs() comprueba la validez de los datos introducidos en los campos del formulario de alta de alumno.</p>
     *
     * @param acceso Es un objeto de tipo Alta que representa la operación de alta que se va a realizar.
     * @return Devuelve verdadero si los datos son válidos y falso en caso contrario.
     */

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

	/**
     * <p>El método comprobarId() se utiliza para verificar si el ID del proyecto ingresado en el formulario existe en la base de datos.</p>
     *
     * @param acceso Es un objeto de tipo Alta que representa la operación de alta que se va a realizar.
     * @return Devuelve verdadero si el ID del proyecto existe y falso en caso contrario.
     */
	
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
