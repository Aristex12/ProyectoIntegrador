package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaConsulta;
import mvc.vista.VistaMenuPrincipal;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerMenuPrincipalConsulta</h3>
 *   <div class="card-body">
 *     <p>El ListenerMenuPrincipalConsulta es un controlador que maneja las acciones realizadas al seleccionar la opción de consulta en el menú principal.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerMenuPrincipalConsulta implements ActionListener {

	public VistaMenuPrincipal v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerMenuPrincipalConsulta</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerMenuPrincipalConsulta.</p>
	 *
	 *     @param vista La vista del menú principal asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerMenuPrincipalConsulta(VistaMenuPrincipal vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar la opción de consulta en el menú principal.</p>
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

