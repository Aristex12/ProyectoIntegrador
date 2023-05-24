package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConsultaAlumno;
import mvc.vista.VistaMenuPrincipal;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerVolverAlMenuAlumno</h3>
 *   <div class="card-body">
 *     <p>El ListenerVolverAlMenuAlumno es un controlador que maneja las acciones realizadas en la vista de consulta de alumno al seleccionar la opción de volver al menú principal.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerVolverAlMenuAlumno implements ActionListener {

	ConsultaAlumno v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerVolverAlMenuAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerVolverAlMenuAlumno.</p>
	 *
	 *     @param vista La vista de consulta de alumno asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerVolverAlMenuAlumno(ConsultaAlumno vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados en la vista de consulta de alumno al seleccionar la opción de volver al menú principal.</p>
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

