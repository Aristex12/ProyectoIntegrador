package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasAltaAlumno</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasAltaAlumno es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de alta de un alumno.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasAltaAlumno implements ActionListener {

	VistaAltaAlumno v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasAltaAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasAltaAlumno.</p>
	 * 
	 *     @param vista La vista de alta de alumno asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasAltaAlumno(VistaAltaAlumno vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de alta de alumno.</p>
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
