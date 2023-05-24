package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConfirmacionAlta;
import mvc.vista.VistaMenuPrincipal;

/**
 * <p><b>ListenerVolverMenuConfirmacionAlumno</b> es el controlador para la vista de confirmación de alta de alumno.
 * Implementa la interfaz ActionListener para responder a los eventos de acción.</p>
 */
public class ListenerVolverMenuConfirmacionAlumno implements ActionListener {

	/**
	 * La vista de confirmación de alta asociada con este controlador.
	 */
	private VistaConfirmacionAlta v;
	
	/**
	 * <p>Construye un nuevo controlador para la vista de confirmación de alta de alumno.</p>
	 *
	 * @param vista la vista de confirmación de alta de alumno a la que este controlador está asociado.
	 */
	public ListenerVolverMenuConfirmacionAlumno(VistaConfirmacionAlta vista) {
		v = vista;
	}
	
	/**
	 * <p>Este método se invoca cuando ocurre una acción en la vista de confirmación de alta de alumno.</p>
	 *
	 * @param e el evento de acción que ocurrió.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Cierra la vista de confirmación de alta
		v.dispose();

		// Crea y muestra la vista del menú principal
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
