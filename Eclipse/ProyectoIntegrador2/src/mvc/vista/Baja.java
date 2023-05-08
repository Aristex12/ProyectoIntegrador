package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class Baja extends JFrame{

	private JLabel titulo;
    private JLabel tipoLabel;
    private JRadioButton alumnoRadioButton;
    private JRadioButton proyectoRadioButton;
    private JRadioButton areasRadioButton;
    private JLabel nombre;
    private JTextField inputNombre;
    private JButton enviar;

    public Baja() {
        super("Dar de Baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();
    }

    public void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(360, 220);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración del título
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Dar de Baja");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(70, 14, 200, 25);

        // Creación y configuración del tipo de elemento a dar de baja
        tipoLabel = new JLabel();
        tipoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        tipoLabel.setText("Tipo:");
        tipoLabel.setBounds(30, 50, 60, 25);

        ButtonGroup tipoButtonGroup = new ButtonGroup();

        alumnoRadioButton = new JRadioButton("Alumno");
        alumnoRadioButton.setSelected(true);
        alumnoRadioButton.setBounds(90, 50, 80, 25);
        tipoButtonGroup.add(alumnoRadioButton);

        proyectoRadioButton = new JRadioButton("Proyecto");
        proyectoRadioButton.setBounds(170, 50, 80, 25);
        tipoButtonGroup.add(proyectoRadioButton);

        areasRadioButton = new JRadioButton("Áreas");
        areasRadioButton.setBounds(250, 50, 80, 25);
        tipoButtonGroup.add(areasRadioButton);

        // Creación y configuración del nombre del elemento a dar de baja
        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(30, 80, 60, 25);

        inputNombre = new JTextField();
        inputNombre.setBounds(90, 80, 180, 25);

        // Creación y configuración del botón de enviar
        enviar = new JButton();
        enviar.setText("Enviar");
        enviar.setBounds(133, 116, 80, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(tipoLabel);
        getContentPane().add(alumnoRadioButton);
        getContentPane().add(proyectoRadioButton);
        getContentPane().add(areasRadioButton);
        getContentPane().add(nombre);
        getContentPane().add(inputNombre);
        getContentPane().add(enviar);
    }

    private void hacerVisible() {
        // Hacer visible la ventana
        setVisible(true);
    }
	
}
