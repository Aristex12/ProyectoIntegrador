package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerVistaMenuPrincipalDarAlta</h3>
 *   <div class="card-body">
 *     <p>El ListenerVistaMenuPrincipalDarAlta es un controlador que maneja las acciones realizadas en la vista del menú principal al seleccionar la opción de dar de alta.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerVistaMenuPrincipalDarAlta implements ActionListener {

	public VistaMenuPrincipal v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerVistaMenuPrincipalDarAlta</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerVistaMenuPrincipalDarAlta.</p>
	 *
	 *     @param vista La vista del menú principal asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerVistaMenuPrincipalDarAlta(VistaMenuPrincipal vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados en la vista del menú principal al seleccionar la opción de dar de alta.</p>
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

