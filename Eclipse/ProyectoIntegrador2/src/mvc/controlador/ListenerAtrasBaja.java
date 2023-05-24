package mvc.controlador;

import mvc.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasBaja</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasBaja es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de baja de un elemento.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasBaja implements ActionListener {

	public VistaBaja v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasBaja</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasBaja.</p>
	 * 
	 *     @param vista La vista de baja asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasBaja(VistaBaja vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de baja de un elemento.</p>
	 *     <p>Despliega la vista principal del menú principal.</p>
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
