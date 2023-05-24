package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <h1>Baja</h1>
 * <p>La clase Baja se encarga de las operaciones de eliminación en la base de datos. Esta clase tiene métodos para eliminar alumnos y proyectos, así como para obtener información de la base de datos.</p>
 *	@author Aris, Josep, Miguel y Dani
 */

public class Baja {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	private String nombreProyecto;
	private String matricula;
	private int resultados;

	Connection con = null;

	/**
     * <p>El método getConexion() se utiliza para establecer la conexión con la base de datos.</p>
     * 
     * @return Una conexión a la base de datos.
     * @throws SQLException Si ocurre un error al conectar a la base de datos.
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
     * <p>El método borrarAlumno() se utiliza para eliminar un alumno específico de la base de datos.</p>
     * <p>El número de expediente se utiliza para identificar al alumno que se quiere eliminar.</p>
     */
	
	public void borrarAlumno() {

		Statement statement = null;
		
		try {

			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "DELETE FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			resultados = statement.executeUpdate(query);

		} catch (SQLException a) {

		} catch (Exception b) {

		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
	}
	
	/**
     * <p>El método borrarProyecto() se utiliza para eliminar un proyecto específico de la base de datos.</p>
     * <p>El nombre del proyecto se utiliza para identificar el proyecto que se quiere eliminar.</p>
     */
	
	public void borrarProyecto() {
		
		Statement statement = null;
		
		try {
			
			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "DELETE FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			resultados = statement.executeUpdate(query);
			
		}catch(SQLException a) {
			
		} catch (Exception b) {
			
		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
		
	}
	
	/**
     * <p>El método devuelveNombreProyecto() se utiliza para obtener el nombre de un proyecto específico de la base de datos.</p>
     * <p>El nombre del proyecto se utiliza para identificar el proyecto cuyo nombre se quiere obtener.</p>
     *
     * @return El nombre del proyecto. Retorna una cadena vacía si no se encuentra el proyecto.
     */
	
	public String devuelveNombreProyecto() {
		
		String nombre = "";
		
		Statement statement = null;
		
		try {
			
			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			
			if(resultados.next()) {
				nombre = resultados.getString("nombreProyecto");
			}
			
		}catch(SQLException a) {
			
		} catch (Exception b) {
			
		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
		
		return nombre;
		
	}

	/**
	 * <p>Este método cierra la conexión con la base de datos y las instancias de Statement.</p>
	 * @param stmt El objeto Statement que se desea cerrar. Puede ser null si no hay un objeto Statement para cerrar.
	 * @throws SQLException Si ocurre un error al cerrar los recursos de la base de datos.
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
	 * Aqui se encuentrna todos los getters y los setters
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
