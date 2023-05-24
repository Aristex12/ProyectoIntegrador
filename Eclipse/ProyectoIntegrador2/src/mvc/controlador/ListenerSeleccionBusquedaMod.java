package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.*;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerSeleccionBusquedaMod</h3>
 *   <div class="card-body">
 *     <p>El ListenerSeleccionBusquedaMod es un controlador que maneja las acciones realizadas al seleccionar una opción de búsqueda en la modificación.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */

public class ListenerSeleccionBusquedaMod implements ActionListener {

	BusquedaModificacion v;
	private String texto;
	private String matricula;
	Modificacion mod = new Modificacion();
	
	String nombre;
	String apellidos;
	String nombreProyecto;
	String area = "";
	String curso = "";

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerSeleccionBusquedaMod</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerSeleccionBusquedaMod.</p>
	 *
	 *     @param vista La vista de búsqueda y modificación asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	
	public ListenerSeleccionBusquedaMod(BusquedaModificacion vista) {
		v = vista;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar una opción de búsqueda en la modificación.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {

		texto = v.getResultList().getSelectedValue();

		if (texto.contains("/")) {
			mostrarInfoProyectos();
		} else {
			mostrarInfoAlumno();
		}
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">mostrarInfoAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Muestra la información de un alumno seleccionado en la modificación.</p>
	 *   </div>
	 * </div>
	 */
	
	public void mostrarInfoAlumno() {

		texto = v.getResultList().getSelectedValue();

		v.dispose();
		matricula = texto.substring(texto.length() - 8);

		mod.setMatricula(matricula);
		mod.datosAlumno();

		nombre = mod.getNombre();
		apellidos = mod.getApellidos();

		ModificacionAlumnos ventana = new ModificacionAlumnos();
		ventana.getNombreTextField().setText(nombre);
		ventana.getApellidosTextField().setText(apellidos);
		ventana.getMatriculaTextField().setText(matricula);

		ventana.hacerVisible();
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">mostrarInfoProyectos</h3>
	 *   <div class="card-body">
	 *     <p>Muestra la información de un proyecto seleccionado en la modificación.</p>
	 *   </div>
	 * </div>
	 */
	
	public void mostrarInfoProyectos() {

		texto = v.getResultList().getSelectedValue();

		v.dispose();

		nombreProyecto = texto.split(" ")[0];
		int nota = 0;

		mod.setNombreProyecto(nombreProyecto);
		mod.datosProyecto();
		area = mod.getArea();
		curso = mod.getCurso();
		nota = mod.getNota();

		ModificacionProyecto ventana = new ModificacionProyecto();
		ventana.getNombreTextField().setText(nombreProyecto);
		ventana.getComboCurso().setSelectedItem(curso);
		ventana.getAreaCombo().setSelectedItem(area);
		ventana.getNotasSpinner().setValue(nota);
		ventana.hacerVisible();

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getV</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve la vista de búsqueda y modificación asociada a este controlador.</p>
	 *
	 *     @return La vista de búsqueda y modificación.
	 *   </div>
	 * </div>
	 */
	
	public BusquedaModificacion getV() {
		return v;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setV</h3>
	 *   <div class="card-body">
	 *     <p>Establece la vista de búsqueda y modificación asociada a este controlador.</p>
	 *
	 *     @param v La vista de búsqueda y modificación.
	 *   </div>
	 * </div>
	 */
	
	public void setV(BusquedaModificacion v) {
		this.v = v;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getTexto</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve el texto seleccionado en la vista de búsqueda y modificación.</p>
	 *
	 *     @return El texto seleccionado.
	 *   </div>
	 * </div>
	 */
	public String getTexto() {
		return texto;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setTexto</h3>
	 *   <div class="card-body">
	 *     <p>Establece el texto seleccionado en la vista de búsqueda y modificación.</p>
	 *
	 *     @param texto El texto seleccionado.
	 *   </div>
	 * </div>
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getMatricula</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve la matrícula del alumno seleccionado.</p>
	 *
	 *     @return La matrícula del alumno.
	 *   </div>
	 * </div>
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setMatricula</h3>
	 *   <div class="card-body">
	 *     <p>Establece la matrícula del alumno seleccionado.</p>
	 *
	 *     @param matricula La matrícula del alumno.
	 *   </div>
	 * </div>
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getMod</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve la instancia de la clase Modificacion utilizada para obtener los datos del alumno o proyecto seleccionado.</p>
	 *
	 *     @return La instancia de Modificacion.
	 *   </div>
	 * </div>
	 */
	public Modificacion getMod() {
		return mod;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setMod</h3>
	 *   <div class="card-body">
	 *     <p>Establece la instancia de la clase Modificacion utilizada para obtener los datos del alumno o proyecto seleccionado.</p>
	 *
	 *     @param mod La instancia de Modificacion.
	 *   </div>
	 * </div>
	 */
	public void setMod(Modificacion mod) {
		this.mod = mod;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getNombre</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve el nombre del alumno seleccionado.</p>
	 *
	 *     @return El nombre del alumno.
	 *   </div>
	 * </div>
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setNombre</h3>
	 *   <div class="card-body">
	 *     <p>Establece el nombre del alumno seleccionado.</p>
	 *
	 *     @param nombre El nombre del alumno.
	 *   </div>
	 * </div>
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getApellidos</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve los apellidos del alumno seleccionado.</p>
	 *
	 *     @return Los apellidos del alumno.
	 *   </div>
	 * </div>
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setApellidos</h3>
	 *   <div class="card-body">
	 *     <p>Establece los apellidos del alumno seleccionado.</p>
	 *
	 *     @param apellidos Los apellidos del alumno.
	 *   </div>
	 * </div>
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getNombreProyecto</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve el nombre del proyecto seleccionado.</p>
	 *
	 *     @return El nombre del proyecto.
	 *   </div>
	 * </div>
	 */
	public String getNombreProyecto() {
		return nombreProyecto;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setNombreProyecto</h3>
	 *   <div class="card-body">
	 *     <p>Establece el nombre del proyecto seleccionado.</p>
	 *
	 *     @param nombreProyecto El nombre del proyecto.
	 *   </div>
	 * </div>
	 */
	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getArea</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve el área del proyecto seleccionado.</p>
	 *
	 *     @return El área del proyecto.
	 *   </div>
	 * </div>
	 */
	public String getArea() {
		return area;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setArea</h3>
	 *   <div class="card-body">
	 *     <p>Establece el área del proyecto seleccionado.</p>
	 *
	 *     @param area El área del proyecto.
	 *   </div>
	 * </div>
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">getCurso</h3>
	 *   <div class="card-body">
	 *     <p>Devuelve el curso del proyecto seleccionado.</p>
	 *
	 *     @return El curso del proyecto.
	 *   </div>
	 * </div>
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">setCurso</h3>
	 *   <div class="card-body">
	 *     <p>Establece el curso del proyecto seleccionado.</p>
	 *
	 *     @param curso El curso del proyecto.
	 *   </div>
	 * </div>
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

}
