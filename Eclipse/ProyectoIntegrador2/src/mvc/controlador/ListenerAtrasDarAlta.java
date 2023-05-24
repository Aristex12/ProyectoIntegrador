package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.VistaDarAlta;
import mvc.vista.VistaMenuPrincipal;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAtrasDarAlta</h3>
 *   <div class="card-body">
 *     <p>El ListenerAtrasDarAlta es un controlador que maneja las acciones realizadas al presionar el botón "Atrás" en la vista de dar de alta.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: Aris, Josep, Dani y Miguel</p>
 *     <p>Versión: 1.0</p>
 *   </div>
 * </div>
 */
public class ListenerAtrasDarAlta implements ActionListener {

	VistaDarAlta v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAtrasDarAlta</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAtrasDarAlta.</p>
	 * 
	 *     @param vistaDarAlta La vista de dar de alta asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAtrasDarAlta(VistaDarAlta vistaDarAlta) {
		v = vistaDarAlta;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al presionar el botón "Atrás" en la vista de dar de alta.</p>
	 *     <p>Despliega la vista del menú principal.</p>
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

