package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.*;
import mvc.vista.*;

public class ListenerSeleccionBusquedaMod implements ActionListener {

	BusquedaModificacion v;
	private String texto;
	private String nombreArea;
	private String nombreProyecto;
	private String matricula;
	Modificacion mod = new Modificacion();
	
	
	public ListenerSeleccionBusquedaMod(BusquedaModificacion vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		

	}
	
	public void mostrarInfoAlumno() {
		
		texto = v.getResultList().getSelectedValue();
		
		v.dispose();
		matricula = texto.substring(texto.length() - 8);
		
		String nombre;
		String apellidos;
		
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
	    
	    String nombreProyecto = texto.split(" ")[0];
	    String area = "";
	    String curso = "";
	    int nota = 0;
	    int idProyecto = 0;
	    
	    mod.setNombreProyecto(nombreProyecto);
	    mod.datosProyecto();
	    area = mod.getArea();
	    curso = mod.getCurso();
	    nota = mod.getNota();
	    idProyecto = mod.getIdProyecto();
	    
	    ModificacionProyecto ventana = new ModificacionProyecto();
	    ventana.getNombre().setText(nombreProyecto);
	    ventana.getCursoLabel().setText(curso);
	    ventana.getAreaLabel().setText(area);
	    ventana.getNotaLabel().setText(String.valueOf(nota));
	    ventana.getIdProyectoLabel().setText(String.valueOf(idProyecto));
	    ventana.hacerVisible();
		
	}

}
