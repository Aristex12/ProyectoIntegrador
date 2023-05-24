package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * La clase AccesoBD se encarga de establecer la conexión con la base de datos y realizar consultas.
 * @author Aris, Josep, Dani y Miguel
 */

public class AccesoBD {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	Connection con = null;

	/**
     * Obtiene la conexión a la base de datos.
     *
     * @return La conexión a la base de datos.
     */
	
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

	 /**
     * Añade alumnos a una lista a partir de una consulta específica.
     *
     * @param buscarPor La consulta para buscar alumnos.
     * @return Una lista de alumnos obtenidos de la consulta.
     */
	
	public ArrayList<Alumno> añadirAlumnoALista(String buscarPor) {

		ArrayList<Alumno> alumnos = new ArrayList<>();

		Statement statement = null;
		
		try {

			AccesoBD acceso = new AccesoBD();
			statement = acceso.getConexion().createStatement();
			String query = buscarPor;
			ResultSet resultados = statement.executeQuery(query);

			while (resultados.next()) {
				String nombre = resultados.getString("nombre");
				String apellidos = resultados.getString("apellidos");
				String matricula = resultados.getString("numExpediente");
				String idProyecto = resultados.getString("idProyectoFK");
				Alumno alumno = new Alumno(nombre, apellidos, matricula, idProyecto);
				alumnos.add(alumno);
			}

		} catch (SQLException a) {

		} catch (Exception e) {

		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

		return alumnos;
	}

	/**
     * Añade proyectos a una lista a partir de una consulta específica.
     *
     * @param buscarPor La consulta para buscar proyectos.
     * @return Una lista de proyectos obtenidos de la consulta.
     */
	
	public ArrayList<Proyectos> añadirProyectoALista(String buscarPor) {

		ArrayList<Proyectos> proyectos = new ArrayList<>();

		Statement statement = null;
		
		try {

			AccesoBD acceso = new AccesoBD();
			statement = acceso.getConexion().createStatement();
			String query = buscarPor;
			ResultSet resultados = statement.executeQuery(query);

			while (resultados.next()) {
				String nombre = resultados.getString("nombreProyecto");
				String idProyecto = resultados.getString("idProyecto");
				String ano = resultados.getString("ano");
				String url = resultados.getString("github");
				int nota = resultados.getInt("notaObtenida");
				Proyectos proyecto = new Proyectos(nombre, idProyecto, nota, ano, url);
				proyectos.add(proyecto);
			}

		} catch (SQLException a) {

		} catch (Exception e) {

		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

		return proyectos;
	}
	
	/**
     * Añade áreas a una lista a partir de una consulta específica.
     *
     * @param buscarPor La consulta para buscar áreas.
     * @return Una lista de áreas obtenidas de la consulta.
     */
	
	public ArrayList<Area> añadirAreaALista(String buscarPor) {

		ArrayList<Area> areas = new ArrayList<>();
		Statement statement = null;
		
		try {

			AccesoBD acceso = new AccesoBD();
			statement = acceso.getConexion().createStatement();
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

		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

		return areas;
	}

	/**
     * Cierra el Statement y la conexión a la base de datos.
     *
     * @param stmt El Statement a cerrar.
     * @throws SQLException Si ocurre un error al cerrar el Statement o la conexión.
     */
	
	public void cerrarTodo(Statement stmt) throws SQLException {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar Statement");
				e.printStackTrace();
			}
		}
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Error al cerrar la conexión");
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Todos los getters y los setters
	 */
	
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
