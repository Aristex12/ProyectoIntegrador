package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaMenuPrincipal;
import mvc.vista.VistaModificacion;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerMenuPrincipalModificacion</h3>
 *   <div class="card-body">
 *     <p>El ListenerMenuPrincipalModificacion es un controlador que maneja las acciones realizadas al seleccionar la opción de modificación en el menú principal.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani</p>
 *     <p>Versión: 5.0</p>
 *   </div>
 * </div>
 */
public class ListenerMenuPrincipalModificacion implements ActionListener {

	public VistaMenuPrincipal v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerMenuPrincipalModificacion</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerMenuPrincipalModificacion.</p>
	 *
	 *     @param vista La vista del menú principal asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerMenuPrincipalModificacion(VistaMenuPrincipal vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar la opción de modificación en el menú principal.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaModificacion ventana = new VistaModificacion();
		ventana.hacerVisible();

	}

}

