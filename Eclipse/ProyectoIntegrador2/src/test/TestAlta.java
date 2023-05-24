package test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mvc.modelo.Alta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAlta {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost/proyectointegrador";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection;
    private Alta alta;

    @BeforeEach
    public void setUp() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            alta = new Alta();
        } catch (Exception e) {
            
        }
    }

    @Test
    public void testComprobarMatriculaAlumno() {
        alta.setMatricula("123456"); // Supongamos que esta matrícula no existe en la base de datos

        boolean result = alta.comprobarMatriculaAlumno();

        Assertions.assertTrue(result);
    }

    @Test
    public void testInsertarAlumno() {
        alta.setMatricula("123456");
        alta.setNombre("John");
        alta.setApellidos("Doe");
        alta.setIdProyectoAlumno("P123");

        alta.insertarAlumno();

        // Realizar alguna verificación, como comprobar si el alumno se insertó correctamente en la base de datos
    }

    @Test
    public void testComprobarNombreProyecto() {
        alta.setNombreProyecto("Proyecto1"); // Supongamos que este nombre de proyecto no existe en la base de datos

        boolean result = alta.comprobarNombreProyecto();

        Assertions.assertFalse(result);
    }

    @Test
    public void testComprobarArea() {
        alta.setArea("BasesDeDatos");

        alta.comprobarArea();

        int numeroArea = alta.getNumeroArea();
        Assertions.assertEquals(1, numeroArea);
    }

    @Test
    public void testCerrarTodo() {
        Statement statement = null;

        try {
            statement = connection.createStatement();
            // Realizar alguna operación con el statement

            alta.cerrarTodo(statement);

            // Verificar que el statement se cerró correctamente
            Assertions.assertTrue(statement.isClosed());
        } catch (Exception e) {
            
        }
    }
}