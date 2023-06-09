package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase Alta se encarga de realizar operaciones de alta en una base de
 * datos, como inserción de alumnos y proyectos.
 * 
 * @author Aris, Josep, Miguel y Dani
 */

public class Alta {

	// Todas los atributos que vamos a utilizar en la clase

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	// Los atributos de alumnos

	private String nombre;
	private String apellidos;
	private String matricula;
	private String idProyectoAlumno;

	// Los atributos de proyectos

	private String ano;
	private String area;
	private int numeroArea;
	private String nombreProyecto;
	private int nota;
	private String github;
	private int idProyecto;

	// Los atributos de area

	private String nombreArea;
	private String descripcion;

	boolean flag;

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
	 * Comprueba si la matrícula del alumno ya existe en la base de datos.
	 *
	 * @return true si la matrícula no existe, false si ya existe.
	 */

	public boolean comprobarMatriculaAlumno() {

		Statement statement = null;
		flag = false;

		try {

			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);

			if (resultados.next()) {

			} else {
				flag = true;
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

		return flag;
	}

	/**
	 * Inserta un alumno en la base de datos.
	 */

	public void insertarAlumno() {

		Statement stmt = null;
		
		try {
	
			int res = 0;

			con = DriverManager.getConnection(url, usuario, pw);
			String query = "INSERT INTO alumnos VALUES('" + matricula + "','" + nombre + "', '" + apellidos + "', '"
					+ idProyectoAlumno + "')";
			stmt = con.createStatement();
			res = stmt.executeUpdate(query);

		} catch (SQLException a) {
			System.out.println("No se ha podido insertar");
			a.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de aplicación");
			e.printStackTrace();
		}finally {

            try {
                cerrarTodo(stmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

	}

	/**
	 * Comprueba si el nombre del proyecto ya existe en la base de datos.
	 *
	 * @return true si el nombre no existe, false si ya existe.
	 */

	public boolean comprobarNombreProyecto() {

		Statement statement = null;
		flag = false;

		try {
			
			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto + "';";
			ResultSet resultados = statement.executeQuery(query);

			if (resultados.next()) {

			} else {
				flag = true;
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

		return flag;
	}

	/**
	 * Comprueba el área del proyecto y asigna el número correspondiente.
	 */
	public void comprobarArea() {
		if (area.equals("BasesDeDatos")) {
			numeroArea = 1;
		} else if (area.equals("Programación")) {
			numeroArea = 2;
		} else if (area.equals("LenguajeDeMarcas")) {
			numeroArea = 3;
		} else if (area.equals("FOL")) {
			numeroArea = 4;
		} else if (area.equals("SistemasInformaticos")) {
			numeroArea = 5;
		}
	}

	/**
	 * Inserta un proyecto en la base de datos.
	 */
	public void insertarProyecto() {
		
		Statement stmt = null;
		
		try {
			int res = 0;
			comprobarArea();
			con = DriverManager.getConnection(url, usuario, pw);
			String query = "INSERT INTO proyectos(ano, nombreProyecto, notaObtenida, codAreaFK, github) VALUES('" + ano
					+ "','" + nombreProyecto + "', '" + nota + "', '" + numeroArea + "', '" + github + "');";
			stmt = con.createStatement();
			res = stmt.executeUpdate(query);
		} catch (SQLException a) {
			System.out.println("No se ha podido insertar");
			a.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de aplicación");
			e.printStackTrace();
		}finally {

            try {
                cerrarTodo(stmt);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
	}

	/**
	 * Comprueba si un proyecto con el ID especificado ya existe en la base de
	 * datos.
	 *
	 * @return true si el proyecto existe, false si no existe.
	 */
	public boolean comprobarIdProyecto() {
		
		Statement statement = null;
		
		boolean flag = false;
		try {
			con = DriverManager.getConnection(url, usuario, pw);
			statement = con.createStatement();
			String query = "SELECT * FROM proyectos WHERE idProyecto='" + idProyectoAlumno + "';";
			ResultSet resultados = statement.executeQuery(query);
			if (resultados.next()) {
				flag = true;
			}
		} catch (SQLException a) {
			System.out.println("No se ha podido insertar");
			a.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error de aplicación");
			e.printStackTrace();
		}finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
		return flag;
	}

	/**
	 * Este metodo se encarga de cerrar todas las conexiones con la BBDD
	 * 
	 * @param stmt para cerrar el statement
	 * @throws SQLException lanza un SQLException
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

	public int getNumeroArea() {
		return numeroArea;
	}

	public void setNumeroArea(int numeroArea) {
		this.numeroArea = numeroArea;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
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

	public String getAno() {
		return ano;
	}

	public void setAno(String curso) {
		this.ano = curso;
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

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public String getIdProyectoAlumno() {
		return idProyectoAlumno;
	}

	public void setIdProyectoAlumno(String idProyectoAlumno) {
		this.idProyectoAlumno = idProyectoAlumno;
	}

}
