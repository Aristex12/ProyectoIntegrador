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
        setSize(440, 250);
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

        labelTipo.setBounds(66, 51, 100, 30);
        getContentPane().add(labelTipo);

        radioAlumno.setBounds(172, 51, 80, 30);
        getContentPane().add(radioAlumno);

        radioProyecto.setBounds(254, 51, 80, 30);
        getContentPane().add(radioProyecto);

        labelNombre.setBounds(66, 90, 100, 30);
        getContentPane().add(labelNombre);

        campoNombre.setBounds(176, 91, 200, 30);
        getContentPane().add(campoNombre);

        labelAreas.setBounds(66, 130, 100, 30);
        getContentPane().add(labelAreas);

        campoAreas.setBounds(176, 131, 200, 30);
        getContentPane().add(campoAreas);

        botonBuscar.setBounds(296, 171, 80, 30);
        getContentPane().add(botonBuscar);
    }
}