package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.*;
import mvc.vista.*;

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

	public ListenerSeleccionBusquedaMod(BusquedaModificacion vista) {
		v = vista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		texto = v.getResultList().getSelectedValue();

		if (texto.contains("/")) {
			mostrarInfoProyectos();
		} else {
			mostrarInfoAlumno();
		}
	}

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

	public BusquedaModificacion getV() {
		return v;
	}

	public void setV(BusquedaModificacion v) {
		this.v = v;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Modificacion getMod() {
		return mod;
	}

	public void setMod(Modificacion mod) {
		this.mod = mod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
