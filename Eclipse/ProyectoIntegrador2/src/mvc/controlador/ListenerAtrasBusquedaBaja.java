package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaDarBaja;
import mvc.vista.VistaBaja;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasBusquedaBaja</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasBusquedaBaja es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de búsqueda para dar de baja un elemento.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasBusquedaBaja implements ActionListener {

	BusquedaDarBaja v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasBusquedaBaja</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasBusquedaBaja.</p>
	 * 
	 *     @param vista La vista de búsqueda asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasBusquedaBaja(BusquedaDarBaja vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de búsqueda para dar de baja un elemento.</p>
	 *     <p>Despliega la vista de baja de elementos.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaBaja ventana = new VistaBaja();
		ventana.hacerVisible();

	}

}
