package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaDarAlta extends JFrame {
    private JLabel titulo;
    private JLabel enunciado;
    private JRadioButton opcionAlumno, opcionProyecto, opcionAreas;
    private JButton enviar;

    public VistaDarAlta() {
        super("Dar de Alta");

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(430, 275);
        setLocationRelativeTo(null);

        // Creación de los componentes
        titulo = new JLabel("Dar de Alta");
        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(0, 23, 400, 30);

        enunciado = new JLabel("¿Que quieres dar de alta?");
        enunciado.setFont(new Font("Tahoma", Font.PLAIN, 11));
        enunciado.setBounds(20, 64, 148, 30);
        
        opcionAlumno = new JRadioButton("Alumno");
        opcionProyecto = new JRadioButton("Proyecto");
        opcionAreas = new JRadioButton("Áreas");
        opcionAlumno.setBounds(150, 83, 80, 20);
        opcionProyecto.setBounds(150, 106, 80, 20);
        opcionAreas.setBounds(150, 129, 80, 20);

        ButtonGroup grupoOpciones = new ButtonGroup();
        grupoOpciones.add(opcionAlumno);
        grupoOpciones.add(opcionProyecto);
        grupoOpciones.add(opcionAreas);

        enviar = new JButton("Enviar");
        enviar.setBounds(137, 166, 100, 30);

      
        getContentPane().setLayout(null);
        getContentPane().add(titulo);
        getContentPane().add(opcionAlumno);
        getContentPane().add(opcionProyecto);
        getContentPane().add(opcionAreas);
        getContentPane().add(enviar);
        getContentPane().add(enunciado);
        
    }
}