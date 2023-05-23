package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Baja {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	private String nombreProyecto;
	private String matricula;
	private int resultados;

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

	public void borrarAlumno() {

		try {

			con = DriverManager.getConnection(url, usuario, pw);
			Statement statement = con.createStatement();
			String query = "DELETE FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			resultados = statement.executeUpdate(query);

		} catch (SQLException a) {

		} catch (Exception b) {

		}
	}
	
	public void borrarProyecto() {
		
		try {
			
			con = DriverManager.getConnection(url, usuario, pw);
			Statement statement = con.createStatement();
			String query = "DELETE FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			resultados = statement.executeUpdate(query);
			
		}catch(SQLException a) {
			
		} catch (Exception b) {
			
		}
		
	}
	
	public String devuelveNombreProyecto() {
		
		String nombre = "";
		
		try {
			
			con = DriverManager.getConnection(url, usuario, pw);
			Statement statement = con.createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			
			if(resultados.next()) {
				nombre = resultados.getString("nombreProyecto");
			}
			
		}catch(SQLException a) {
			
		} catch (Exception b) {
			
		}
		
		return nombre;
		
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

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getResultados() {
		return resultados;
	}

	public void setResultados(int resultados) {
		this.resultados = resultados;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

}
