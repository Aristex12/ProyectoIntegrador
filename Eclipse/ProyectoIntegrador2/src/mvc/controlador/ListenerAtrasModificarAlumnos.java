package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ModificacionAlumnos;
import mvc.vista.VistaModificacion;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasModificarAlumnos</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasModificarAlumnos es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de modificación de alumnos.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasModificarAlumnos implements ActionListener {

	ModificacionAlumnos v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasModificarAlumnos</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasModificarAlumnos.</p>
	 * 
	 *     @param vista La vista de modificación de alumnos asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasModificarAlumnos(ModificacionAlumnos vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de modificación de alumnos.</p>
	 *     <p>Despliega la vista de modificación principal.</p>
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


