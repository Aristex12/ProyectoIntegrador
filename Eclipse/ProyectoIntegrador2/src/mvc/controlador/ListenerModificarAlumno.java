package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import mvc.modelo.Modificacion;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerModificarAlumno</h3>
 *   <div class="card-body">
 *     <p>El ListenerModificarAlumno es un controlador que maneja las acciones realizadas al modificar un alumno en la vista de modificación de alumnos.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */

public class ListenerModificarAlumno implements ActionListener {

	ModificacionAlumnos v;
	Modificacion acceso = new Modificacion();

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerModificarAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerModificarAlumno.</p>
	 *
	 *     @param vista La vista de modificación de alumnos asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	
	public ListenerModificarAlumno(ModificacionAlumnos vista) {

		v = vista;

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al modificar un alumno en la vista de modificación de alumnos.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (comprobarCampos(acceso)) {
		
			cambiarValoresAlumno();
			v.dispose();
			
		} else {

			v.getLabelError().setText("No hay modificaciones!");

		}

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">comprobarCampos</h3>
	 *   <div class="card-body">
	 *     <p>Comprueba si los campos de modificación de alumno han sido modificados y son válidos.</p>
	 *
	 *     @return true si los campos han sido modificados, false en caso contrario.
	 *   </div>
	 * </div>
	 */
	
	public boolean comprobarCampos(Modificacion acceso) {

		boolean flag = false;

		acceso.comprobarCambiosAlumno();

		if (acceso.getNombre() != v.getNombreTextField().getText()) {
			flag = true;
		} else if (acceso.getApellidos() != v.getApellidosTextField().getText()) {
			flag = true;
		}

		return flag;

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">cambiarValoresAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Cambia los valores del alumno en el modelo de modificación según los campos de la vista.</p>
	 *   </div>
	 * </div>
	 */
	
	public void cambiarValoresAlumno() {

		acceso.setMatricula(v.getMatriculaTextField().getText());
		acceso.setNombre(v.getNombreTextField().getText());
		acceso.setApellidos(v.getApellidosTextField().getText());
		acceso.insertarNuevosDatosAlumno();

		ConfirmacionModificacion ventana = new ConfirmacionModificacion();
		ventana.hacerVisible();

	}

}
