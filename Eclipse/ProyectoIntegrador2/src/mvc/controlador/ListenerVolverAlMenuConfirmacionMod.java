package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConfirmacionModificacion;
import mvc.vista.VistaMenuPrincipal;

/**
 * <p><b>ListenerVolverAlMenuConfirmacionMod</b> es el controlador para la vista de confirmación de modificación.
 * Implementa la interfaz ActionListener para responder a los eventos de acción.</p>
 */
public class ListenerVolverAlMenuConfirmacionMod implements ActionListener {

	/**
	 * La vista de confirmación de modificación asociada con este controlador.
	 */
	private ConfirmacionModificacion v;
	
	/**
	 * <p>Construye un nuevo controlador para la vista de confirmación de modificación.</p>
	 *
	 * @param vista la vista de confirmación de modificación a la que este controlador está asociado.
	 */
	public ListenerVolverAlMenuConfirmacionMod(ConfirmacionModificacion vista) {
		v = vista;
	}
	
	/**
	 * <p>Este método se invoca cuando ocurre una acción en la vista de confirmación de modificación.</p>
	 *
	 * @param e el evento de acción que ocurrió.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// Cierra la vista de confirmación de modificación
		v.dispose();

		// Crea y muestra la vista del menú principal
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}
