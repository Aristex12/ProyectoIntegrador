package mvc.controlador;

import mvc.modelo.Alta;
import mvc.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerAltaProyecto</h3>
 *   <div class="card-body">
 *     <p>El ListenerAltaProyecto es un controlador que maneja las acciones realizadas en la vista de alta de un proyecto.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *   </div>
 * </div>
 */
public class ListenerAltaProyecto implements ActionListener {
	
	public AltaProyecto v;
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerAltaProyecto</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerAltaProyecto.</p>
	 * 
	 *     @param vista La vista de alta de proyecto asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	public ListenerAltaProyecto(AltaProyecto vista) {
		v = vista;
	}
	
	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados en la vista de alta de proyecto.</p>
	 *     <p>Realiza la validación del nombre del proyecto y realiza la inserción en la base de datos en caso de ser válido.</p>
	 *     <p>Abre una ventana de confirmación de alta en caso de éxito, o muestra un mensaje de error en caso de que el proyecto ya exista.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	public void actionPerformed(ActionEvent e) {
		
		Alta acceso = new Alta();
		acceso.getConexion();

		if(comprobarInputs(acceso)) {
			
			String nombre = v.getInputNombre().getText();
			acceso.setNombreProyecto(nombre);
			
			if(acceso.comprobarNombreProyecto()) {
				
				v.dispose();
				
				acceso.setNombreProyecto(v.getInputNombre().getText());
				acceso.setAno((String) v.getCursoComboBox().getSelectedItem());
				acceso.setArea((String) v.getAreaComboBox().getSelectedItem());
				acceso.setNota((int) v.getNotasSpinner().getValue());
				acceso.setGithub(v.getInputUrl().getText());
				acceso.insertarProyecto();
				
				VistaConfirmacionAlta ventana = new VistaConfirmacionAlta();
				ventana.hacerVisible();
				
			} else {
				
				v.getLabelError().setText("Proyecto ya existe!");
				
			}
			
		}
		
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">comprobarInputs</h3>
	 *   <div class="card-body">
	 *     <p>Comprueba si las entradas de usuario son válidas.</p>
	 *     <p>Si el nombre del proyecto contiene algún dígito o está vacío, o si la URL de Github está vacía, retorna false.</p>
	 *
	 *     @param acceso El objeto Alta que se utiliza para acceder a la base de datos.
	 *     @return true si las entradas son válidas, false en caso contrario.
	 *   </div>
	 * </div>
	 */
	public boolean comprobarInputs(Alta acceso) {

		boolean flag = true;

		if (v.getInputNombre().getText().matches(".*\\d+.*") || v.getInputNombre().getText().equals("")) {
			v.getLabelError().setText("Error nombre!");
			flag = false;
		} else if(v.getInputUrl().getText().equals("")) {
			v.getLabelError().setText("Error github!");
			flag = false;
		}

		return flag;

	}
	
}
