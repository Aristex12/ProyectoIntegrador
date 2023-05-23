package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Consulta {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	private String nombre;
	private String apellidos;
	private String matricula;
	private String idProyectoAlumno;

	private String nombreProyecto;
	private String año;
	private String area;
	private int nota;
	private int idProyecto;
	private String github;
	private String integrantes = "";
	
	private String nombreArea;
	private String descripcion;

	Connection con = null;

	public Connection getConexion() {

		try {

			// Le añadimos el driver a la clase y añadimos los datos de acceso al objeto con

			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, pw);

			// Pillamos las excepciones sql

		} catch (SQLException a) {
			System.out.println("Algo falla en la base de datos");
		}

		// Pillamos cualquier excepcion por si acaso

		catch (Exception e) {

			System.out.println("Problema que no se que es");
			

		}

		return con;

	}

	public void datosAlumno() {

		try {

			Consulta acceso = new Consulta();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombre = resultados.getString("nombre");
			apellidos = resultados.getString("apellidos");
			idProyectoAlumno = resultados.getString("idProyectoFK");
			

		} catch (SQLException a) {
		
		} catch (Exception b) {
		
		}

	}

	public void buscarIntegrantes() {
		
		try {

			Consulta acceso = new Consulta();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE idProyectoFK='" + idProyecto + "';";
			ResultSet resultados = statement.executeQuery(query);

			while(resultados.next()) {
				
				integrantes += resultados.getString("nombre") + " / ";
				
			}
			
		} catch (SQLException a) {
			
		} catch (Exception b) {
			
		}
		
	}
	
	public void datosProyecto() {

		try {

			Consulta acceso = new Consulta();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			año = resultados.getString("ano");
			area = resultados.getString("codAreaFK");
			nota = resultados.getInt("notaObtenida");
			idProyecto = resultados.getInt("idProyecto");
			github = resultados.getString("github");
			
		} catch (SQLException a) {
			
		} catch (Exception b) {
			
		}

	}
	
	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public void datosArea() {
		
		try {

			Consulta acceso = new Consulta();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM areas WHERE nombre='" + nombreArea.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			descripcion = resultados.getString("descripcion");
			
		} catch (SQLException a) {
			
		} catch (Exception b) {
			
		}
		
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public void setNombreArea(String nombreArea) {
		this.nombreArea = nombreArea;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getIdProyectoAlumno() {
		return idProyectoAlumno;
	}

	public void setIdProyectoAlumno(String idProyectoAlumno) {
		this.idProyectoAlumno = idProyectoAlumno;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}

}
