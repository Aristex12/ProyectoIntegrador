package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaDarBaja;
import mvc.vista.SeguroBaja;
import mvc.vista.VistaConfirmacionAlta;
import mvc.vista.VistaConfirmacionBaja;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerSeleccionarBusquedaBaja</h3>
 *   <div class="card-body">
 *     <p>El ListenerSeleccionarBusquedaBaja es un controlador que maneja las acciones realizadas al seleccionar una opción de búsqueda para dar de baja un elemento.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerSeleccionarBusquedaBaja implements ActionListener {

	BusquedaDarBaja v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerSeleccionarBusquedaBaja</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerSeleccionarBusquedaBaja.</p>
	 *
	 *     @param vista La vista de búsqueda y baja asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerSeleccionarBusquedaBaja(BusquedaDarBaja vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar una opción de búsqueda para dar de baja un elemento.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		SeguroBaja ventana = new SeguroBaja(v); // Pasamos la referencia de la vista aquí
		ventana.hacerVisible();
	}

}

