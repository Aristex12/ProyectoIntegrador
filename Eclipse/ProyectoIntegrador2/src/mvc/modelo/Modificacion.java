package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Modificacion {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	private String nombre;
	private String apellidos;
	private String matricula = "";

	private String curso;
	private String area;
	private String nombreProyecto;
	private int nota;
	private int idProyecto;

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

			System.out.println("Problema que no se que verga es");
			e.printStackTrace();

		}

		return con;

	}

	public void datosAlumno() {

		try {

			Modificacion acceso = new Modificacion();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombre = resultados.getString("nombre");
			apellidos = resultados.getString("apellidos");

		} catch (SQLException a) {
			a.printStackTrace();
		} catch (Exception b) {
			b.printStackTrace();
		}

	}

	public void datosProyecto() {

		try {

			Modificacion acceso = new Modificacion();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			curso = resultados.getString("ano");
			area = resultados.getString("codAreaFK");
			nota = resultados.getInt("notaObtenida");
			idProyecto = resultados.getInt("idProyecto");

		} catch (SQLException a) {
			a.printStackTrace();
		} catch (Exception b) {
			b.printStackTrace();
		}

	}

	public void comprobarCambiosAlumno() {

		try {

			Modificacion acceso = new Modificacion();
			Statement statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombre = resultados.getString("nombre");
			apellidos = resultados.getString("apellidos");

		} catch (SQLException a) {
			a.printStackTrace();
		} catch (Exception b) {
			b.printStackTrace();
		}

	}
	
	public void insertarNuevosDatosAlumno() {
		
		try {
			
			Modificacion acceso = new Modificacion();
			Statement statement = acceso.getConexion().createStatement();
			String query = "UPDATE alumnos SET nombre='"+ nombre.trim() +"' WHERE numExpediente='" + matricula.trim() + "';";
			int resultados = statement.executeUpdate(query);
			
			String query2 = "UPDATE alumnos SET apellidos='"+ apellidos.trim() +"' WHERE numExpediente='" + matricula.trim() + "';";
			int resultados2 = statement.executeUpdate(query2);
			
		}catch(SQLException a) {
			
		}catch(Exception b) {
			
		}
		
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
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

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

}
