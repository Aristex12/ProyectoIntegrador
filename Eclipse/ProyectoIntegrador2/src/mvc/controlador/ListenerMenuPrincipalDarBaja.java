package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaBaja;
import mvc.vista.VistaMenuPrincipal;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerMenuPrincipalDarBaja</h3>
 *   <div class="card-body">
 *     <p>El ListenerMenuPrincipalDarBaja es un controlador que maneja las acciones realizadas al seleccionar la opción de dar de baja en el menú principal.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */
public class ListenerMenuPrincipalDarBaja implements ActionListener {

	public VistaMenuPrincipal v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerMenuPrincipalDarBaja</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerMenuPrincipalDarBaja.</p>
	 *
	 *     @param vista La vista del menú principal asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerMenuPrincipalDarBaja(VistaMenuPrincipal vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar la opción de dar de baja en el menú principal.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaBaja ventana = new VistaBaja();
		ventana.hacerVisible();

	}

}

