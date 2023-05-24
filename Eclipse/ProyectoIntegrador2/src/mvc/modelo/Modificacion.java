package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * <p>La clase <b>Modificacion</b> se encarga de la manipulación de la base de datos para los objetos de tipo Alumno y Proyecto.</p>
 * <p>Se encarga de establecer la conexión con la base de datos, recuperar, insertar y modificar datos.</p>
 */

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

	/**
     * <p>Este método establece la conexión con la base de datos MySQL.</p>
     *
     * @return <b>Connection</b> La conexión establecida con la base de datos.
     * */
	
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
     * <p>Este método recupera los datos del alumno de la base de datos.</p>
     *
     * @throws SQLException Si ocurre un error al recuperar los datos de la base de datos.
     */
	
	public void datosAlumno() {

		Statement statement = null;
		
		try {

			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombre = resultados.getString("nombre");
			apellidos = resultados.getString("apellidos");

		} catch (SQLException a) {
			a.printStackTrace();
		} catch (Exception b) {
			b.printStackTrace();
		}finally {
			try {
	            cerrarTodo(statement);
	        } catch (SQLException e) {
	            
	        }
		}

	}

	/**
	 * <p>Este método cierra la conexión con la base de datos y las instancias de Statement.</p>
	 *
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
	 * <p>
	 * Obtiene los datos de un proyecto específico de la base de datos.
	 * </p>
	 * <p>
	 * Utiliza el nombre del proyecto para obtener los detalles, incluyendo el curso, área, nota y ID.
	 * </p>
	 */
	
	public void datosProyecto() {

		Statement statement = null;
		
		try {

			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
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
		} try {
            cerrarTodo(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

	/**
	 * <p>
	 * Comprueba los cambios realizados en los datos de un alumno en la base de datos.
	 * </p>
	 * <p>
	 * Utiliza el número de expediente para obtener el nombre y apellidos del alumno.
	 * </p>
	 */
	
	public void comprobarCambiosAlumno() {

		Statement statement = null;
		
		try {

			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombre = resultados.getString("nombre");
			apellidos = resultados.getString("apellidos");

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
	 * <p>
	 * Inserta nuevos datos de un alumno en la base de datos.
	 * </p>
	 * <p>
	 * Actualiza el nombre y los apellidos del alumno en la base de datos usando el número de expediente.
	 * </p>
	 */
	
	public void insertarNuevosDatosAlumno() {
		
		Statement statement = null;
		
		try {
			
			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "UPDATE alumnos SET nombre='"+ nombre.trim() +"' WHERE numExpediente='" + matricula.trim() + "';";
			int resultados = statement.executeUpdate(query);
			
			String query2 = "UPDATE alumnos SET apellidos='"+ apellidos.trim() +"' WHERE numExpediente='" + matricula.trim() + "';";
			int resultados2 = statement.executeUpdate(query2);
			
		}catch(SQLException a) {
			
		}catch(Exception b) {
			
		} try {
            cerrarTodo(statement);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	
	/**
	 * <p>
	 * Comprueba los cambios realizados en los datos de un proyecto en la base de datos.
	 * </p>
	 * <p>
	 * Utiliza el ID del proyecto para obtener el nombre y área del proyecto.
	 * </p>
	 */
	
	public void comprobarCambiosProyecto() {

		Statement statement = null;
		
		try {

			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM proyectos WHERE idProyecto='" + conseguirIdProyecto() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			nombreProyecto = resultados.getString("nombreProyecto");
			area = resultados.getString("areaFK");
			

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
	 * <p>
	 * Inserta nuevos datos de un proyecto en la base de datos.
	 * </p>
	 * <p>
	 * Actualiza el nombre del proyecto, el curso y la nota obtenida en la base de datos usando el ID del proyecto.
	 * </p>
	 */
	
	public void insertarNuevosDatosProyecto() {
		
		Statement statement = null;
		
		try {
			
			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "UPDATE proyectos SET nombreProyecto='"+ nombreProyecto.trim() +"' WHERE idProyecto='" + conseguirIdProyecto() + "';";
			statement.executeUpdate(query);
			
			String query2 = "UPDATE proyectos SET ano='"+ curso.trim() +"' WHERE idProyecto='" + conseguirIdProyecto() + "';";
			statement.executeUpdate(query2);
			
			String query3 = "UPDATE proyectos SET notaObtenida='"+ nota +"' WHERE idProyecto='" + conseguirIdProyecto() + "';";
			statement.executeUpdate(query3);
			
		}catch(SQLException a) {
			
		}catch(Exception b) {
			
		}finally {
	        try {
	            cerrarTodo(statement);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		
	}
	
	/**
	 * <p>
	 * Obtiene el ID de un proyecto de la base de datos.
	 * </p>
	 * <p>
	 * Utiliza el nombre del proyecto para buscar en la base de datos y obtener su ID.
	 * </p>
	 * 
	 * @return El ID del proyecto. Retorna 0 si no se encuentra el proyecto.
	 */
	
	public int conseguirIdProyecto() {
		
		int num = 0;
		
		Statement statement = null;
		
		try {
			
			Modificacion acceso = new Modificacion();
			statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='"+ nombreProyecto.trim() +"';";
			System.out.println(nombreProyecto);
			ResultSet resultados = statement.executeQuery(query);
			
			if(resultados.next()) {
				num = resultados.getInt("idProyecto");
			}
			
			
		}catch(SQLException a) {
			
		}catch(Exception b) {
			
		}finally {
	        try {
	            cerrarTodo(statement);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		
		return num;
		
	}
	
	/**
	 * Aqui estan todos los getters y setters
	 * @return
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
