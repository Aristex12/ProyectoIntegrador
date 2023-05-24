package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.BusquedaConsulta;
import mvc.vista.VistaAltaAlumno;
import mvc.vista.VistaConsulta;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasBusquedaConsulta</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasBusquedaConsulta es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de búsqueda para realizar una consulta.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasBusquedaConsulta implements ActionListener {

	BusquedaConsulta v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasBusquedaConsulta</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasBusquedaConsulta.</p>
	 * 
	 *     @param vista La vista de búsqueda asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasBusquedaConsulta(BusquedaConsulta vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de búsqueda para realizar una consulta.</p>
	 *     <p>Despliega la vista de consulta.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaConsulta ventana = new VistaConsulta();
		ventana.hacerVisible();

	}

}
