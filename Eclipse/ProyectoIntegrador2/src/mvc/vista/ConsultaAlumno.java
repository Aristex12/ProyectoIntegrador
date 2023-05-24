package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerVolverAlMenuAlumno;

import java.awt.Font;

/**
 * <p>La clase ConsultaAlumno permite al usuario consultar los datos de un estudiante específico en la base de datos.</p>
 *
 * <p>El usuario puede ver los datos del estudiante, como nombre, apellidos, matrícula y el id del proyecto asociado. También se incluye un botón para volver al menú principal.</p>
 *
 * @author Aris, Miguel, Josep y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class ConsultaAlumno extends JFrame{

	// Etiquetas para el título y los datos del estudiante
    private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel apellidos;
    private JLabel apellidosLabel;
    private JLabel matricula;
    private JLabel matriculaLabel;
    private JLabel idProyecto;
    private JLabel idProyectoLabel;

    // Botón para volver al menú principal
    private JButton volverButton;

    /**
     * <p>Constructor para la clase ConsultaAlumno. Inicializa la ventana y sus componentes.</p>
     */
    
    public ConsultaAlumno() {
        // Configuración de la ventana
        super("Consulta de Alumno");
        // Inicializar los componentes
        inicializarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * <p>Método para inicializar todos los componentes de la ventana de ConsultaAlumno.</p>
     * <p>Incluye la configuración de etiquetas y botones, y otros elementos de la interfaz de usuario.</p>
     */
    
    public void inicializarComponentes() {
    	//Configuramos la ventana
    	
    	setSize(440, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración de los componentes
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Datos del Alumno");
        titulo.setBounds(22, 23, 158, 25);

        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(22, 58, 56, 25);

        nombreLabel = new JLabel();
        nombreLabel.setText("");
        nombreLabel.setBounds(108, 58, 200, 25);

        apellidos = new JLabel();
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setText("Apellidos:");
        apellidos.setBounds(22, 89, 64, 25);

        apellidosLabel = new JLabel();
        apellidosLabel.setText("");
        apellidosLabel.setBounds(108, 89, 200, 25);

        matricula = new JLabel();
        matricula.setFont(new Font("Tahoma", Font.BOLD, 11));
        matricula.setText("Matrícula:");
        matricula.setBounds(22, 124, 64, 25);

        matriculaLabel = new JLabel();
        matriculaLabel.setText("");
        matriculaLabel.setBounds(108, 124, 158, 25);
        
        idProyecto = new JLabel("id Proyecto");
        idProyecto.setFont(new Font("Tahoma", Font.BOLD, 11));
        idProyecto.setBounds(22, 159, 85, 25);
        
        idProyectoLabel = new JLabel();
        idProyectoLabel.setBounds(108, 159, 158, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        ListenerVolverAlMenuAlumno escuchador1 = new ListenerVolverAlMenuAlumno(this);
        volverButton.addActionListener(escuchador1);
        volverButton.setBounds(276, 178, 140, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(nombre);
        getContentPane().add(nombreLabel);
        getContentPane().add(apellidos);
        getContentPane().add(apellidosLabel);
        getContentPane().add(matricula);
        getContentPane().add(matriculaLabel);
        getContentPane().add(volverButton);
        getContentPane().add(idProyecto);
        getContentPane().add(idProyectoLabel);
    }

    /**
     * El resto de getters y setters
     */
    
    public JLabel getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(JLabel idProyecto) {
		this.idProyecto = idProyecto;
	}

	public JLabel getIdProyectoLabel() {
		return idProyectoLabel;
	}

	public void setIdProyectoLabel(JLabel idProyectoLabel) {
		this.idProyectoLabel = idProyectoLabel;
	}

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

	public JLabel getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(JLabel nombreLabel) {
		this.nombreLabel = nombreLabel;
	}

	public JLabel getApellidos() {
		return apellidos;
	}

	public void setApellidos(JLabel apellidos) {
		this.apellidos = apellidos;
	}

	public JLabel getApellidosLabel() {
		return apellidosLabel;
	}

	public void setApellidosLabel(JLabel apellidosLabel) {
		this.apellidosLabel = apellidosLabel;
	}

	public JLabel getMatricula() {
		return matricula;
	}

	public void setMatricula(JLabel matricula) {
		this.matricula = matricula;
	}

	public JLabel getMatriculaLabel() {
		return matriculaLabel;
	}

	public void setMatriculaLabel(JLabel matriculaLabel) {
		this.matriculaLabel = matriculaLabel;
	}

	public JButton getVolverButton() {
		return volverButton;
	}

	public void setVolverButton(JButton volverButton) {
		this.volverButton = volverButton;
	}

	/**
     * <p>Método para hacer visible la ventana de ConsultaAlumno.</p>
     */
	
	public void hacerVisible() {
        setVisible(true);
    }
	
}
