package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.*;
import mvc.vista.*;

public class ListenerSeleccionBusquedaConsulta implements ActionListener {

	BusquedaConsulta v;
	String matricula;
	Consulta con = new Consulta();
	String texto = "";

	public ListenerSeleccionBusquedaConsulta(BusquedaConsulta busquedaConsulta) {
		v = busquedaConsulta;
	}

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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
