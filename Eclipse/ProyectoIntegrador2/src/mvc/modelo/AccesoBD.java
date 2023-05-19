package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBD {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

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

	public ArrayList<Alumno> añadirAlumnoALista(String buscarPor) {

		ArrayList<Alumno> alumnos = new ArrayList<>();

		try {

			AccesoBD acceso = new AccesoBD();
			Statement statement = acceso.getConexion().createStatement();
			String query = buscarPor;
			ResultSet resultados = statement.executeQuery(query);

			while (resultados.next()) {
				String nombre = resultados.getString("nombre");
				String apellidos = resultados.getString("apellidos");
				String matricula = resultados.getString("numExpediente");
				Alumno alumno = new Alumno(nombre, apellidos, matricula);
				alumnos.add(alumno);
			}

		} catch (SQLException a) {

		} catch (Exception e) {

		}

		return alumnos;
	}

	public ArrayList<Proyectos> añadirProyectoALista(String buscarPor) {

		ArrayList<Proyectos> proyectos = new ArrayList<>();

		try {

			AccesoBD acceso = new AccesoBD();
			Statement statement = acceso.getConexion().createStatement();
			String query = buscarPor;
			ResultSet resultados = statement.executeQuery(query);

			while (resultados.next()) {
				String nombre = resultados.getString("nombreProyecto");
				String idProyecto = resultados.getString("idProyecto");
				String curso = resultados.getString("curso");
				int nota = resultados.getInt("notaObtenida");
				Proyectos proyecto = new Proyectos(nombre, idProyecto, nota, curso);
				proyectos.add(proyecto);
			}

		} catch (SQLException a) {

		} catch (Exception e) {

		}

		return proyectos;
	}
	
	public ArrayList<Area> añadirAreaALista(String buscarPor) {

		ArrayList<Area> areas = new ArrayList<>();

		try {

			AccesoBD acceso = new AccesoBD();
			Statement statement = acceso.getConexion().createStatement();
			String query = buscarPor;
			ResultSet resultados = statement.executeQuery(query);

			while (resultados.next()) {
				String nombre = resultados.getString("nombre");
				String descripcion = resultados.getString("descripcion");
				Area area = new Area(nombre, descripcion);
				areas.add(area);
			}

		} catch (SQLException a) {

		} catch (Exception e) {

		}

		return areas;
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

}
