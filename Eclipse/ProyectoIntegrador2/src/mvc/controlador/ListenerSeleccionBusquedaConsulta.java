package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.*;
import mvc.vista.*;

/**
 * <div class="card">
 *   <h3 class="card-title">ListenerSeleccionBusquedaConsulta</h3>
 *   <div class="card-body">
 *     <p>El ListenerSeleccionBusquedaConsulta es un controlador que maneja las acciones realizadas al seleccionar una opción de búsqueda en la consulta.</p>
 *     <p>Implementa la interfaz ActionListener para poder capturar y manejar eventos de acción.</p>
 *     <p>Autor: [Nombre del autor]</p>
 *     <p>Versión: [Número de versión]</p>
 *   </div>
 * </div>
 */

public class ListenerSeleccionBusquedaConsulta implements ActionListener {

	BusquedaConsulta v;
	String matricula;
	Consulta con = new Consulta();
	String texto = "";

	/**
	 * <div class="card">
	 *   <h3 class="card-title">Constructor de la clase ListenerSeleccionBusquedaConsulta</h3>
	 *   <div class="card-body">
	 *     <p>Construye una instancia de ListenerSeleccionBusquedaConsulta.</p>
	 *
	 *     @param busquedaConsulta La vista de búsqueda y consulta asociada a este controlador.
	 *   </div>
	 * </div>
	 */
	
	public ListenerSeleccionBusquedaConsulta(BusquedaConsulta busquedaConsulta) {
		v = busquedaConsulta;
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">actionPerformed</h3>
	 *   <div class="card-body">
	 *     <p>Maneja los eventos de acción generados al seleccionar una opción de búsqueda en la consulta.</p>
	 *
	 *     @param e El evento de acción.
	 *   </div>
	 * </div>
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			texto = v.getResultList().getSelectedValue();

			if (texto.contains("/")) {
				mostrarInfoProyectos();
			} else if (texto.contains(":")) {
				mostrarInfoAlumno();
			} else {
				mostrarInfoAreas();
			}

		} catch (Exception a) {

		}

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">mostrarInfoAlumno</h3>
	 *   <div class="card-body">
	 *     <p>Muestra la información de un alumno seleccionado en la consulta.</p>
	 *   </div>
	 * </div>
	 */
	
	public void mostrarInfoAlumno() {

		texto = v.getResultList().getSelectedValue();

		v.dispose();

		matricula = texto.substring(texto.length() - 8);

		String nombre;
		String apellidos;
		String idProyecto;

		con.setMatricula(matricula);
		con.datosAlumno();

		nombre = con.getNombre();
		apellidos = con.getApellidos();
		idProyecto = con.getIdProyectoAlumno();

		ConsultaAlumno ventana = new ConsultaAlumno();
		ventana.getNombreLabel().setText(nombre);
		ventana.getApellidosLabel().setText(apellidos);
		ventana.getMatriculaLabel().setText(matricula);
		ventana.getIdProyectoLabel().setText(idProyecto);

		ventana.hacerVisible();
	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">mostrarInfoProyectos</h3>
	 *   <div class="card-body">
	 *     <p>Muestra la información de un proyecto seleccionado en la consulta.</p>
	 *   </div>
	 * </div>
	 */
	
	public void mostrarInfoProyectos() {

		texto = v.getResultList().getSelectedValue();

		v.dispose();

		String nombreProyecto = texto.substring(0, texto.indexOf('/')).trim();
		String area = "";
		String curso = "";
		int nota = 0;
		int idProyecto = 0;
		String github = "";
		String integrantes = "";

		con.setNombreProyecto(nombreProyecto);
		con.datosProyecto();
		con.buscarIntegrantes();
		area = con.getArea();
		curso = con.getAño();
		nota = con.getNota();
		idProyecto = con.getIdProyecto();
		github = con.getGithub();
		integrantes = con.getIntegrantes();

		ConsultaProyecto ventana = new ConsultaProyecto();
		ventana.getNombreLabel().setText(nombreProyecto);
		ventana.getCursoLabel().setText(curso);
		ventana.getAreaLabel().setText(area);
		ventana.getNotaLabel().setText(String.valueOf(nota));
		ventana.getGithubLabel().setText(github);
		ventana.getIdProyectoLabel().setText(idProyecto + "");
		ventana.getIntegrantesLabel().setText(integrantes);
		ventana.hacerVisible();

	}

	/**
	 * <div class="card">
	 *   <h3 class="card-title">mostrarInfoAreas</h3>
	 *   <div class="card-body">
	 *     <p>Muestra la información de un área seleccionada en la consulta.</p>
	 *   </div>
	 * </div>
	 */
	
	public void mostrarInfoAreas() {

		texto = v.getResultList().getSelectedValue();
		v.dispose();
		con.setNombreArea(texto);
		con.datosArea();
		String descripcion = con.getDescripcion();
		ConsultaArea ventana = new ConsultaArea();
		ventana.getDescripcionLabel().setText(descripcion);
		ventana.getNombreLabel().setText(texto);
		ventana.hacerVisible();

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

}
