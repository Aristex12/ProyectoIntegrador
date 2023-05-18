package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Consulta;
import mvc.vista.*;

public class ListenerSeleccionBusquedaConsulta implements ActionListener {

	BusquedaConsulta v;
	String matricula;
	Consulta con = new Consulta();
	boolean flag = false;
	String texto = "";

	public ListenerSeleccionBusquedaConsulta(BusquedaConsulta busquedaConsulta) {
		v = busquedaConsulta;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		texto = v.getResultList().getSelectedValue();
		
		if(texto.contains("/")) {
			flag = true;
		} else {
			flag = false;
		}
		
		if(flag == true) {
			mostrarInfoProyectos();
		} else {
			mostrarInfoAlumno();
		}

	}

	public void mostrarInfoAlumno() {
		
		texto = v.getResultList().getSelectedValue();
		
		v.dispose();
		
		matricula = texto.substring(texto.length() - 8);
		
		String nombre;
		String apellidos;
		
		con.setMatricula(matricula);
		con.datosAlumno();
		
		nombre = con.getNombre();
		apellidos = con.getApellidos();
		
		ConsultaAlumno ventana = new ConsultaAlumno();
		ventana.getNombreLabel().setText(nombre);
		ventana.getApellidosLabel().setText(apellidos);
		ventana.getMatriculaLabel().setText(matricula);
		
		ventana.hacerVisible();
	}
	
	public void mostrarInfoProyectos() {
		
		texto = v.getResultList().getSelectedValue();
	    
		v.dispose();
	    
	    String nombreProyecto = texto.split(" ")[0];
	    String area = "";
	    String curso = "";
	    int nota = 0;
	    int idProyecto = 0;
	    
	    con.setNombreProyecto(nombreProyecto);
	    con.datosProyecto();
	    area = con.getArea();
	    curso = con.getCurso();
	    nota = con.getNota();
	    idProyecto = con.getIdProyecto();
	    
	    ConsultaProyecto ventana = new ConsultaProyecto();
	    ventana.getNombreLabel().setText(nombreProyecto);
	    ventana.getCursoLabel().setText(curso);
	    ventana.getAreaLabel().setText(area);
	    ventana.getNotaLabel().setText(String.valueOf(nota));
	    ventana.getIdProyectoLabel().setText(String.valueOf(idProyecto));
	    ventana.hacerVisible();
		
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
