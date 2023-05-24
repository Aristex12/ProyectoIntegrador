package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerVistaDarAltaEnviar</h3>
 *   <div class="card-body">
 *     <p>El ListenerVistaDarAltaEnviar es un controlador que maneja las acciones realizadas en la vista de dar de alta y enviar.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */

public class ListenerVistaDarAltaEnviar implements ActionListener {

	public VistaDarAlta v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerVistaDarAltaEnviar</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerVistaDarAltaEnviar.</p>
	 *
	 *     @param vista La vista de dar de alta asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	
	public ListenerVistaDarAltaEnviar(VistaDarAlta vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados en la vista de dar de alta y enviar.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		
		if(v.getOpcionAlumno().isSelected()) {
			VistaAltaAlumno ventana = new VistaAltaAlumno();
			ventana.hacerVisible();
		} else if(v.getOpcionProyecto().isSelected()){
			AltaProyecto ventana = new AltaProyecto();
			ventana.hacerVisible();
		}
		
	}
	
}
