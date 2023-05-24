package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.AltaProyecto;
import mvc.vista.VistaDarAlta;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasAltaProyecto</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasAltaProyecto es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de alta de un proyecto.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasAltaProyecto implements ActionListener {

	AltaProyecto v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasAltaProyecto</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasAltaProyecto.</p>
	 * 
	 *     @param vista La vista de alta de proyecto asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasAltaProyecto(AltaProyecto vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de alta de proyecto.</p>
	 *     <p>Despliega la vista principal de dar de alta.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaDarAlta ventana = new VistaDarAlta();
		ventana.hacerVisible();

	}

}
