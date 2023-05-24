package mvc.vista;
import javax.swing.*;

import mvc.controlador.ListenerVolverAlMenuAlumno;
import mvc.controlador.ListenerVolverMenuConfirmacionAlumno;

import java.awt.*;

/**
 * <p>
 * Esta la ventana de confirmacion cuando damos de alta un alumno o
 * proyecto
 * </p>
 *
 * @author Aris, Josep, Miguel y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class VistaConfirmacionAlta extends JFrame {
    
	//Los componentes
	
	private JLabel titulo;
    private JButton botonVolver;

    /**
	 * Tenemos el constructor de la clase
	 */
    
    public VistaConfirmacionAlta() {
        // Configuración de la ventana
        super("Confirmación de alta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
    }
    
    /**
	 * Inicilizamos todos los componentes de la vista
	 */
    
    public void inicializarComponentes() {
    	setSize(400, 200);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("¡Se ha dado de alta exitosamente!");
        titulo.setFont(new Font("Arial", Font.BOLD, 12));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        botonVolver = new JButton("Volver al menú");
        ListenerVolverMenuConfirmacionAlumno escuchador1 = new ListenerVolverMenuConfirmacionAlumno(this);
        botonVolver.addActionListener(escuchador1);

        // Configuración del layout
        getContentPane().setLayout(null);

        titulo.setBounds(40, 48, 303, 30);
        getContentPane().add(titulo);

        botonVolver.setBounds(129, 88, 126, 30);
        getContentPane().add(botonVolver);
    }
    
    /**
	 * Hace visible la ventana
	 */
    
    public void hacerVisible() {
    	setVisible(true);
    }
}