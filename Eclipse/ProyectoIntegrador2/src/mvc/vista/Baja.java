package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasBaja;
import mvc.controlador.ListenerBajaEnviar;

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
    private JButton atras;

    public Baja() {
        super("Dar de Baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();
    }

    public void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(440, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración del título
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Dar de Baja");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(106, 26, 200, 25);

        // Creación y configuración del tipo de elemento a dar de baja
        tipoLabel = new JLabel();
        tipoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
        tipoLabel.setText("Tipo:");
        tipoLabel.setBounds(53, 76, 60, 25);

        ButtonGroup tipoButtonGroup = new ButtonGroup();

        alumnoRadioButton = new JRadioButton("Alumno");
        alumnoRadioButton.setSelected(true);
        alumnoRadioButton.setBounds(165, 76, 80, 25);
        tipoButtonGroup.add(alumnoRadioButton);

        proyectoRadioButton = new JRadioButton("Proyecto");
        proyectoRadioButton.setBounds(247, 76, 80, 25);
        tipoButtonGroup.add(proyectoRadioButton);

        areasRadioButton = new JRadioButton("Áreas");
        areasRadioButton.setBounds(329, 76, 80, 25);
        tipoButtonGroup.add(areasRadioButton);

        // Creación y configuración del nombre del elemento a dar de baja
        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(53, 111, 60, 25);

        inputNombre = new JTextField();
        inputNombre.setBounds(165, 111, 180, 25);

        // Creación y configuración del botón de enviar
        enviar = new JButton();
        enviar.setText("Enviar");
        ListenerBajaEnviar escuchador2 = new ListenerBajaEnviar(this);
        enviar.addActionListener(escuchador2);
        enviar.setBounds(265, 152, 80, 25);
        
        //Creamos y le damos las caracteristicas al boton de atras
        atras = new JButton("Atrás");
        ListenerAtrasBaja escuchador1 = new ListenerAtrasBaja(this);
        atras.addActionListener(escuchador1);
		atras.setBounds(165, 152, 80, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(tipoLabel);
        getContentPane().add(alumnoRadioButton);
        getContentPane().add(proyectoRadioButton);
        getContentPane().add(areasRadioButton);
        getContentPane().add(nombre);
        getContentPane().add(inputNombre);
        getContentPane().add(enviar);
        getContentPane().add(atras);
    }

    public void hacerVisible() {
        // Hacer visible la ventana
        setVisible(true);
    }
	
}
