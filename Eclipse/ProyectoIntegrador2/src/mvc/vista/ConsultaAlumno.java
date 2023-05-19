package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerVolverAlMenuAlumno;

import java.awt.Font;

public class ConsultaAlumno extends JFrame{

	private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel apellidos;
    private JLabel apellidosLabel;
    private JLabel matricula;
    private JLabel matriculaLabel;
    private JButton volverButton;

    public ConsultaAlumno() {
        // Configuración de la ventana
        super("Consulta de Alumno");
        // Inicializar los componentes
        inicializarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

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
        matriculaLabel.setBounds(108, 124, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        ListenerVolverAlMenuAlumno escuchador1 = new ListenerVolverAlMenuAlumno(this);
        volverButton.addActionListener(escuchador1);
        volverButton.setBounds(22, 159, 140, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(nombre);
        getContentPane().add(nombreLabel);
        getContentPane().add(apellidos);
        getContentPane().add(apellidosLabel);
        getContentPane().add(matricula);
        getContentPane().add(matriculaLabel);
        getContentPane().add(volverButton);
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

	public void hacerVisible() {
        setVisible(true);
    }
	
}
