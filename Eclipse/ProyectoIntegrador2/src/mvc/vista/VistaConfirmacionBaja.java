package mvc.vista;
import javax.swing.*;

import mvc.controlador.ListenerVolverAlMenuConfirmacionBaja;
import mvc.controlador.ListenerVolverMenuConfirmacionAlumno;

import java.awt.*;

public class VistaConfirmacionBaja extends JFrame {
    
	private JLabel titulo;
    private JButton botonVolver;

    public VistaConfirmacionBaja() {
        // Configuración de la ventana
        super("Confirmación de baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
    }
    
    public void inicializarComponentes() {
    	
    	//Le damos las caracteristicas a la ventana
    	setSize(400, 200);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("¡Se ha dado de baja exitosamente!");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 12));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        botonVolver = new JButton("Volver al menú");
        ListenerVolverAlMenuConfirmacionBaja escuchador1 = new ListenerVolverAlMenuConfirmacionBaja(this);
        botonVolver.addActionListener(escuchador1);

        // Configuración del layout
        getContentPane().setLayout(null);

        titulo.setBounds(10, 38, 361, 30);
        getContentPane().add(titulo);

        botonVolver.setBounds(131, 83, 120, 30);
        getContentPane().add(botonVolver);
    	
    }
    
    public void hacerVisible() {
    	setVisible(true);
    }
    
}