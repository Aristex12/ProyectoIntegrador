package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Baja;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerSeguroBaja</h3>
 *   <div class="card-body">
 *     <p>El ListenerSeguroBaja es un controlador que maneja las acciones realizadas al confirmar la baja de un elemento en la vista de confirmación de baja.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */

public class ListenerSeguroBaja implements ActionListener {

	SeguroBaja v;
	BusquedaDarBaja vistaBaja;

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerSeguroBaja</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerSeguroBaja.</p>
	 *
	 *     @param vista La vista de confirmación de baja asociada a este controlador.
	 *     @param vistaBaja La vista de búsqueda y baja asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	
	public ListenerSeguroBaja(SeguroBaja vista, BusquedaDarBaja vistaBaja) {
		v = vista;
		this.vistaBaja = vistaBaja;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al confirmar la baja de un elemento en la vista de confirmación de baja.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {

		v.dispose();
		vistaBaja.dispose();

		VistaConfirmacionBaja ventana = new VistaConfirmacionBaja();
		ventana.hacerVisible();

		String seleccion = vistaBaja.getResultList().getSelectedValue();
		
		Baja acceso = new Baja();
		
		if (seleccion.contains(":")) {
			String texto = seleccion.substring(seleccion.length() - 8);
			acceso.setMatricula(texto);
			acceso.borrarAlumno();
		} else {
			String texto2 = seleccion.substring(0, seleccion.indexOf("/") - 1).trim();
			acceso.setNombreProyecto(texto2);
			acceso.borrarProyecto();
		}

	}

}
