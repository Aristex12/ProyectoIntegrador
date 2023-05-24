package mvc.vista;

import javax.swing.*;

import mvc.controlador.*;

import java.awt.Font;
import java.awt.Color;

/**
 * <p>
 * La clase ModificacionAlumnos permite al usuario modificar los datos de un
 * alumno específico en la base de datos.
 * </p>
 *
 * @author Aris, Josep, Miguel y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class ModificacionAlumnos extends JFrame{
	
	//Aqui estan todos los atributos
	private JLabel titulo;
	private JLabel nombre;
    private JTextField nombreTextField;
    private JLabel apellidos;
    private JTextField apellidosTextField;
    private JLabel matricula;
    private JLabel matriculaTextField;
    private JButton modificarButton;
    private JButton atras;
    private JLabel labelError;
    
    /**
     * Constructor de la clase
     */
    
    public ModificacionAlumnos() {
    	super("Modificar Datos del Alumno");
    	inicializarComponentes();
    }
    
    /**
     * Aqui inicializamos todos los componentes y le damos formato
     */
    
    public void inicializarComponentes() {
    	// Configuración de la ventana
        setTitle("Datos del Alumno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Creación y configuración de los componentes
        
        titulo = new JLabel("Modificar Datos del Alumno");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setBounds(101, 25, 230, 25);
        
        nombre = new JLabel("Nombre");
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setBounds(50, 74, 100, 25);

        nombreTextField = new JTextField();
        nombreTextField.setBounds(160, 74, 200, 25);

        apellidos = new JLabel("Apellidos");
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setBounds(50, 110, 100, 25);

        apellidosTextField = new JTextField();
        apellidosTextField.setBounds(160, 110, 200, 25);

        matricula = new JLabel("Num. Matricula");
        matricula.setFont(new Font("Tahoma", Font.BOLD, 11));
        matricula.setBounds(50, 146, 100, 25);
        
        labelError = new JLabel("");
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(10, 178, 140, 25);
        
        atras = new JButton("Atrás");
        ListenerAtrasModificarAlumnos escuchador1 = new ListenerAtrasModificarAlumnos(this);
        atras.addActionListener(escuchador1);
        atras.setBounds(160, 178, 85, 25);

        matriculaTextField = new JLabel("");
        matriculaTextField.setBounds(160, 146, 200, 25);
        
		modificarButton = new JButton("Modificar");
		modificarButton.setBounds(275, 178, 85, 25);
		
		ListenerModificarAlumno listener = new ListenerModificarAlumno(this);
		modificarButton.addActionListener(listener);

        // Agregar componentes a la ventana
        getContentPane().add(nombre);
        getContentPane().add(nombreTextField);
        getContentPane().add(apellidos);
        getContentPane().add(apellidosTextField);
        getContentPane().add(matricula);
        getContentPane().add(matriculaTextField);
        getContentPane().add(modificarButton);
        getContentPane().add(titulo);
        getContentPane().add(atras);
        getContentPane().add(labelError);

    }

    /*
     * Hace que la ventana sea visible
     */
    
	public void hacerVisible() {
    	// Hacer visible la ventana
        setVisible(true);
    }

	/**
	 * El resto de getters y setters
	 * @return
	 */
	
	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JTextField getNombreTextField() {
		return nombreTextField;
	}

	public void setNombreTextField(JTextField nombreTextField) {
		this.nombreTextField = nombreTextField;
	}

	public JLabel getApellidos() {
		return apellidos;
	}

	public void setApellidos(JLabel apellidos) {
		this.apellidos = apellidos;
	}

	public JTextField getApellidosTextField() {
		return apellidosTextField;
	}

	public void setApellidosTextField(JTextField apellidosTextField) {
		this.apellidosTextField = apellidosTextField;
	}

	public JLabel getMatricula() {
		return matricula;
	}

	public void setMatricula(JLabel area) {
		this.matricula = area;
	}

	public JLabel getMatriculaTextField() {
		return matriculaTextField;
	}

	public void setMatriculaTextField(JLabel matriculaTextField) {
		this.matriculaTextField = matriculaTextField;
	}

	public JButton getModificarButton() {
		return modificarButton;
	}

	public void setModificarButton(JButton modificarButton) {
		this.modificarButton = modificarButton;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JLabel getLabelError() {
		return labelError;
	}

	public void setLabelError(JLabel labelError) {
		this.labelError = labelError;
	}
    
}
