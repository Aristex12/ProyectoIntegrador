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
        setSize(440, 250);
        setLocationRelativeTo(null);

        // Creación de los componentes
        JLabel labelTitulo = new JLabel("Alta alumno");
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelTitulo.setBounds(155, 21, 120, 20);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelApellido = new JLabel("Apellido:");
        labelApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNumero = new JLabel("Número de matrícula:");
        labelNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNombre.setBounds(30, 61, 120, 20);
        labelApellido.setBounds(30, 91, 120, 20);
        labelNumero.setBounds(30, 121, 150, 20);

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtNumero = new JTextField();
        txtNombre.setBounds(200, 62, 180, 20);
        txtApellido.setBounds(200, 92, 180, 20);
        txtNumero.setBounds(200, 122, 180, 20);

        btnEnviar = new JButton("Enviar");
        btnEnviar.setBounds(280, 162, 100, 30);

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