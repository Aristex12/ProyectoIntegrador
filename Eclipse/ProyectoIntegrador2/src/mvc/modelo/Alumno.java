package mvc.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * La clase Alumno representa a un estudiante con atributos como nombre, apellidos, matrícula e ID del proyecto.
 * @author Aris, Dani, Josep y Miguel
 */
public class Alumno {

    private String nombre;
    private String apellidos;
    private String matricula;
    private String idProyecto;

    /**
     * Constructor de la clase Alumno.
     *
     * @param nombre      El nombre del alumno.
     * @param apellidos   Los apellidos del alumno.
     * @param matricula   La matrícula del alumno.
     * @param idProyecto  El ID del proyecto al que el alumno está asignado.
     */
    public Alumno(String nombre, String apellidos, String matricula, String idProyecto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.matricula = matricula;
        this.setIdProyecto(idProyecto);
    }

    /**
     * Constructor vacío de la clase Alumno.
     */
    public Alumno() {

    }

    /**
     * Devuelve una representación en forma de cadena de texto del alumno.
     *
     * @return La representación en forma de cadena de texto del alumno.
     */
    public String toString() {
        return nombre + " " + apellidos + " : " + matricula;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return El nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre El nombre del alumno a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del alumno.
     *
     * @return Los apellidos del alumno.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del alumno.
     *
     * @param apellidos Los apellidos del alumno a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene la matrícula del alumno.
     *
     * @return La matrícula del alumno.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del alumno.
     *
     * @param matricula La matrícula del alumno a establecer.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtiene el ID del proyecto al que el alumno está asignado.
     *
     * @return El ID del proyecto del alumno.
     */
    public String getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el ID del proyecto al que el alumno está asignado.
     *
     * @param idProyecto El ID del proyecto a establecer para el alumno.
     */
    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }
}

