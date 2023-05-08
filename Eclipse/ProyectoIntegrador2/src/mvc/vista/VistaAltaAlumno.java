package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaAltaAlumno extends JFrame {
    private JLabel labelNombre, labelApellido, labelNumero;
    private JTextField txtNombre, txtApellido, txtNumero;
    private JButton btnEnviar;

    public VistaAltaAlumno(String titulo) {
        super(titulo);

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(426, 259);
        setLocationRelativeTo(null);

        // Creación de los componentes
        JLabel labelTitulo = new JLabel("Alta alumno");
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        labelTitulo.setBounds(140, 10, 120, 20);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelApellido = new JLabel("Apellido:");
        labelApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNumero = new JLabel("Número de matrícula:");
        labelNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNombre.setBounds(20, 50, 120, 20);
        labelApellido.setBounds(20, 80, 120, 20);
        labelNumero.setBounds(20, 110, 150, 20);

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtNumero = new JTextField();
        txtNombre.setBounds(150, 50, 180, 20);
        txtApellido.setBounds(150, 80, 180, 20);
        txtNumero.setBounds(150, 110, 180, 20);

        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(150, 160, 100, 30);

        // Configuración del layout
        getContentPane().setLayout(null);

        getContentPane().add(labelTitulo);
        getContentPane().add(labelNombre);
        getContentPane().add(labelApellido);
        getContentPane().add(labelNumero);
        getContentPane().add(txtNombre);
        getContentPane().add(txtApellido);
        getContentPane().add(txtNumero);
        getContentPane().add(btnEnviar);
    }
}