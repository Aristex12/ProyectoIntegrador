package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasBaja;
import mvc.controlador.ListenerBajaEnviar;

import java.awt.Font;
import java.awt.Color;

/**
 * <p>
 * La clase VistaBaja permite al usuario dar de baja los datos de un
 * alumno o proyecto específico en la base de datos.
 * </p>
 *
 * @author Aris, Josep, Miguel y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class VistaBaja extends JFrame{

	//Todos los componentes
	
	private JLabel titulo;
    private JLabel tipoLabel;
    private JRadioButton alumnoRadioButton;
    private JRadioButton proyectoRadioButton;
    private JLabel nombre;
    private JTextField inputNombre;
    private JLabel labelError;
    private JButton enviar;
    private JButton atras;

    /**
	 * Tenemos el constructor de la clase
	 */
    
    public VistaBaja() {
        super("Dar de Baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();
    }

    /**
	 * Inicilizamos todos los componentes de la vista
	 */
    
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

        // Creación y configuración del nombre del elemento a dar de baja
        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(53, 111, 60, 25);

        inputNombre = new JTextField();
        inputNombre.setBounds(165, 111, 180, 25);
        
        labelError = new JLabel("");
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(53, 152, 102, 25);

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
        getContentPane().add(nombre);
        getContentPane().add(inputNombre);
        getContentPane().add(labelError);
        getContentPane().add(enviar);
        getContentPane().add(atras);
    }

    /**
     * El resto de getters y settters
     */
    
    public JLabel getLabelError() {
		return labelError;
	}

	public void setLabelError(JLabel labelError) {
		this.labelError = labelError;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getTipoLabel() {
		return tipoLabel;
	}

	public void setTipoLabel(JLabel tipoLabel) {
		this.tipoLabel = tipoLabel;
	}

	public JRadioButton getAlumnoRadioButton() {
		return alumnoRadioButton;
	}

	public void setAlumnoRadioButton(JRadioButton alumnoRadioButton) {
		this.alumnoRadioButton = alumnoRadioButton;
	}

	public JRadioButton getProyectoRadioButton() {
		return proyectoRadioButton;
	}

	public void setProyectoRadioButton(JRadioButton proyectoRadioButton) {
		this.proyectoRadioButton = proyectoRadioButton;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JTextField getInputNombre() {
		return inputNombre;
	}

	public void setInputNombre(JTextField inputNombre) {
		this.inputNombre = inputNombre;
	}

	public JButton getEnviar() {
		return enviar;
	}

	public void setEnviar(JButton enviar) {
		this.enviar = enviar;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	/**
	 * Hace visible la ventana
	 */
	
	public void hacerVisible() {
        // Hacer visible la ventana
        setVisible(true);
    }
	
}
