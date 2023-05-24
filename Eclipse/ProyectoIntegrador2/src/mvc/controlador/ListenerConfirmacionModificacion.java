package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConfirmacionModificacion;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerConfirmacionModificacion</h3>
 *   <div class="card-body">
 *     <p>El ListenerConfirmacionModificacion es un controlador que maneja las acciones realizadas al confirmar una modificación en la vista de confirmación de modificación.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerConfirmacionModificacion implements ActionListener {

	public ConfirmacionModificacion v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerConfirmacionModificacion</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerConfirmacionModificacion.</p>
	 *
	 *     @param vista La vista de confirmación de modificación asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerConfirmacionModificacion(ConfirmacionModificacion vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al confirmar una modificación en la vista de confirmación de modificación.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}

