package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaMenuPrincipal;
import mvc.vista.VistaModificacion;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasModificacion</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasModificacion es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de modificación.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasModificacion implements ActionListener {

	VistaModificacion v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasModificacion</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasModificacion.</p>
	 * 
	 *     @param vista La vista de modificación asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasModificacion(VistaModificacion vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de modificación.</p>
	 *     <p>Despliega la vista del menú principal.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaMenuPrincipal ventana = new VistaMenuPrincipal();
		ventana.hacerVisible();

	}

}

