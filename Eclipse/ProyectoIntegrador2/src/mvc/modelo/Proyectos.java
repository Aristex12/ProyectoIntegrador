package mvc.modelo;

import mvc.controlador.*;
import mvc.vista.*;
import mvc.modelo.*;

/**
 * La clase Proyectos representa un proyecto con atributos como nombre, ID del proyecto, nota, curso y URL.
 * @author Aris, Josep, Miguel y Dani
 */
public class Proyectos {

    private String nombre;
    private String idProyecto;
    private String curso;
    private String url;
    private int nota;

    /**
     * Constructor de la clase Proyectos.
     *
     * @param nombre      El nombre del proyecto.
     * @param idProyecto  El ID del proyecto.
     * @param nota        La nota del proyecto.
     * @param curso       El curso al que pertenece el proyecto.
     * @param url         La URL asociada al proyecto.
     */
    public Proyectos(String nombre, String idProyecto, int nota, String curso, String url) {
        this.nombre = nombre;
        this.idProyecto = idProyecto;
        this.nota = nota;
        this.curso = curso;
        this.url = url;
    }

    /**
     * Constructor vacío de la clase Proyectos.
     */
    public Proyectos() {

    }

    /**
     * Devuelve una representación en forma de cadena de texto del proyecto.
     *
     * @return La representación en forma de cadena de texto del proyecto.
     */
    public String toString() {
        return nombre + " / " + curso + " / " + nota;
    }

    /**
     * Obtiene el nombre del proyecto.
     *
     * @return El nombre del proyecto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del proyecto.
     *
     * @param nombre El nombre del proyecto a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el ID del proyecto.
     *
     * @return El ID del proyecto.
     */
    public String getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el ID del proyecto.
     *
     * @param idProyecto El ID del proyecto a establecer.
     */
    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * Obtiene el curso al que pertenece el proyecto.
     *
     * @return El curso al que pertenece el proyecto.
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Establece el curso al que pertenece el proyecto.
     *
     * @param curso El curso al que pertenece el proyecto a establecer.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Obtiene la nota del proyecto.
     *
     * @return La nota del proyecto.
     */
    public int getNota() {
        return nota;
    }

    /**
     * Establece la nota del proyecto.
     *
     * @param nota La nota del proyecto a establecer.
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Obtiene la URL asociada al proyecto.
     *
     * @return La URL asociada al proyecto.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establece la URL asociada al proyecto.
     *
     * @param url La URL asociada al proyecto a establecer.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
