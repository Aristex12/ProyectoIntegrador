package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConfirmacionBaja;
import mvc.vista.VistaMenuPrincipal;

/**
 * <p><b>ListenerVolverAlMenuConfirmacionBaja</b> es el controlador para la vista de confirmación de baja.
 * Implementa la interfaz ActionListener para responder a los eventos de acción.</p>
 */
public class ListenerVolverAlMenuConfirmacionBaja implements ActionListener {

	/**
	 * La vista de confirmación de baja asociada con este controlador.
	 */
	private VistaConfirmacionBaja v;
	
	/**
	 * <p>Construye un nuevo controlador para la vista de confirmación de baja.</p>
	 *
	 * @param vista la vista de confirmación de baja a la que este controlador está asociado.
	 */
	public ListenerVolverAlMenuConfirmacionBaja(VistaConfirmacionBaja vista) {
		v = vista;
	}
	
	/**
	 * <p>Este método se invoca cuando ocurre una acción en la vista de confirmación de baja.</p>
	 *
	 * @param e el evento de acción que ocurrió.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Cierra la vista de confirmación de baja
		v.dispose();

		// Crea y muestra la vista del menú principal
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
