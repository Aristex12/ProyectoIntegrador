package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * La clase Consulta se encarga de realizar consultas a una base de datos y recuperar los datos necesarios.
 * @author Aris, Josep, Miguel y Dani
 */

public class Consulta {

	//Todos los atributos que se utilizaran en la clase
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pw = "root";

	//Los atributos que son de alumnos
	
	private String nombre;
	private String apellidos;
	private String matricula;
	private String idProyectoAlumno;

	//Los atributos que son de proyectos
	
	private String nombreProyecto;
	private String año;
	private String area;
	private int nota;
	private int idProyecto;
	private String github;
	private String integrantes = "";
	
	//Los atributos que son de areas
	
	private String nombreArea;
	private String descripcion;

	Connection con = null;

	/**
	 * Metodo que se encarga de establecer la conexion con la base de datos
	 * @return devuelve la conexion a la base de datos
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

			System.out.println("Problema que no se que es");
			

		}

		return con;

	}

	
    /**
     * Obtiene los datos del alumno desde la base de datos.
     */
    public void datosAlumno() {
        
    	Statement statement = null;
    	
    	try {
            Consulta acceso = new Consulta();
            statement = acceso.getConexion().createStatement();
            String query = "SELECT * FROM alumnos WHERE numExpediente='" + matricula.trim() + "';";
            ResultSet resultados = statement.executeQuery(query);
            resultados.next();

            nombre = resultados.getString("nombre");
            apellidos = resultados.getString("apellidos");
            idProyectoAlumno = resultados.getString("idProyectoFK");
        } catch (SQLException a) {
            // Manejar la excepción
        } catch (Exception b) {
            // Manejar la excepción
        }finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Busca los integrantes de un proyecto en la base de datos.
     */
    public void buscarIntegrantes() {
        
    	Statement statement = null;
    	
    	try {
            Consulta acceso = new Consulta();
            statement = acceso.getConexion().createStatement();
            String query = "SELECT * FROM alumnos WHERE idProyectoFK='" + idProyecto + "';";
            ResultSet resultados = statement.executeQuery(query);

            while (resultados.next()) {
                integrantes += resultados.getString("nombre") + " / ";
            }
        } catch (SQLException a) {
            // Manejar la excepción
        } catch (Exception b) {
            // Manejar la excepción
        }finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Obtiene los datos del proyecto desde la base de datos.
     */
    public void datosProyecto() {
        
    	Statement statement = null;
    	
    	try {
            Consulta acceso = new Consulta();
            statement = acceso.getConexion().createStatement();
            String query = "SELECT * FROM proyectos WHERE nombreProyecto='" + nombreProyecto.trim() + "';";
            ResultSet resultados = statement.executeQuery(query);
            resultados.next();

            año = resultados.getString("ano");
            area = resultados.getString("codAreaFK");
            nota = resultados.getInt("notaObtenida");
            idProyecto = resultados.getInt("idProyecto");
            github = resultados.getString("github");
        } catch (SQLException a) {
            // Manejar la excepción
        } catch (Exception b) {
            // Manejar la excepción
        }finally {

            try {
                cerrarTodo(statement);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    
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

	
	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public void datosArea() {
		
		Statement statement = null;
		
		try {

			Consulta acceso = new Consulta();
			statement = acceso.getConexion().createStatement();
			String query = "SELECT * FROM areas WHERE nombre='" + nombreArea.trim() + "';";
			ResultSet resultados = statement.executeQuery(query);
			resultados.next();

			descripcion = resultados.getString("descripcion");
			
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
