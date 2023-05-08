package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaConsulta extends JFrame {
    private JLabel titulo, labelTipo, labelNombre, labelAreas;
    private JRadioButton radioAlumno, radioProyecto;
    private JTextField campoNombre, campoAreas;
    private JButton botonBuscar;

    public VistaConsulta() {
        // Configuración de la ventana
        super("Consulta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 269);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("Consulta");
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        labelTipo = new JLabel("Tipo:");

        radioAlumno = new JRadioButton("Alumno");
        radioProyecto = new JRadioButton("Proyecto");

        ButtonGroup grupoRadio = new ButtonGroup();
        grupoRadio.add(radioAlumno);
        grupoRadio.add(radioProyecto);

        labelNombre = new JLabel("Nombre:");

        campoNombre = new JTextField();

        labelAreas = new JLabel("Área:");

        campoAreas = new JTextField();

        botonBuscar = new JButton("Buscar");

        // Configuración del layout
        getContentPane().setLayout(null);

        titulo.setBounds(0, 11, 400, 30);
        getContentPane().add(titulo);

        labelTipo.setBounds(45, 46, 100, 30);
        getContentPane().add(labelTipo);

        radioAlumno.setBounds(134, 46, 80, 30);
        getContentPane().add(radioAlumno);

        radioProyecto.setBounds(230, 46, 80, 30);
        getContentPane().add(radioProyecto);

        labelNombre.setBounds(50, 90, 100, 30);
        getContentPane().add(labelNombre);

        campoNombre.setBounds(110, 90, 200, 30);
        getContentPane().add(campoNombre);

        labelAreas.setBounds(50, 130, 100, 30);
        getContentPane().add(labelAreas);

        campoAreas.setBounds(110, 130, 200, 30);
        getContentPane().add(campoAreas);

        botonBuscar.setBounds(160, 170, 80, 30);
        getContentPane().add(botonBuscar);
    }
}