package mvc.modelo;

/**
 * La clase Area representa un área con atributos como nombre y descripción.
 * @author Aris, Josep, Miguel y Dani
 */
public class Area {

    private String nombre;
    private String descripcion;

    /**
     * Constructor de la clase Area.
     *
     * @param nombre      El nombre del área.
     * @param descripcion La descripción del área.
     */
    public Area(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Constructor vacío de la clase Area.
     */
    public Area() {

    }

    /**
     * Devuelve una representación en forma de cadena de texto del área.
     *
     * @return La representación en forma de cadena de texto del área.
     */
    public String toString() {
        return nombre;
    }

    /**
     * Obtiene el nombre del área.
     *
     * @return El nombre del área.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del área.
     *
     * @param nombre El nombre del área a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del área.
     *
     * @return La descripción del área.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del área.
     *
     * @param descripcion La descripción del área a establecer.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}

