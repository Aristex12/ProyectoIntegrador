package mvc.vista;
import javax.swing.*;
import java.awt.*;

public class VistaConfirmacionBaja extends JFrame {
    private JLabel titulo;
    private JButton botonVolver;

    public VistaConfirmacionBaja() {
        // Configuración de la ventana
        super("Confirmación de baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 174);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("¡Se ha dado de baja exitosamente!");
        titulo.setFont(new Font("Arial", Font.BOLD, 15));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        botonVolver = new JButton("Volver al menú");

        // Configuración del layout
        getContentPane().setLayout(null);

        titulo.setBounds(0, 20, 400, 30);
        getContentPane().add(titulo);

        botonVolver.setBounds(140, 70, 120, 30);
        getContentPane().add(botonVolver);
    }
}