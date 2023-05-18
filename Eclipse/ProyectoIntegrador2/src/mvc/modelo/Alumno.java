package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private String apellidos;
	private String matricula;
	
	public Alumno(String nombre, String apellidos, String matricula) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.matricula = matricula;
	}
	
	public Alumno() {
		
	}
	
	
	public String toString() {
		
		return nombre + " " + apellidos + " : " + matricula;
		
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

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	
}
