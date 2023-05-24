package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasModificacion;
import mvc.controlador.ListenerModificacionEnviar;

import java.awt.*;

/**
 * <p>
 * Esta la vista en donde el usuario puede modificar
 * los datos de proyectos y alumnos
 * </p>
 *
 * @author Aris, Josep, Miguel y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class VistaModificacion extends JFrame {
	
	//los componentes de la vista
	
	private JLabel titulo, labelTipo, labelNombre, error;
	private JRadioButton radioAlumno, radioProyecto;
	private JTextField campoNombre;
	private JButton botonBuscar;
	private JButton atras;

	/**
	 * El constructor de la clase
	 */
	
	public VistaModificacion() {
		// Configuración de la ventana
		super("Menu Modificación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarComponentes();
	}

	/**
	 * Inicializamos todos los componentes y le damos formato
	 */
	
	public void inicializarComponentes() {
		setSize(440, 250);
		setLocationRelativeTo(null);

		// Creación de los componentes
		titulo = new JLabel("Modificar");
		titulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);

		labelTipo = new JLabel("Tipos:");
		labelTipo.setFont(new Font("Tahoma", Font.BOLD, 11));

		radioAlumno = new JRadioButton("Alumno");
		radioAlumno.setSelected(true);
		radioProyecto = new JRadioButton("Proyecto");

		ButtonGroup grupoTipos = new ButtonGroup();
		grupoTipos.add(radioAlumno);
		grupoTipos.add(radioProyecto);

		labelNombre = new JLabel("Nombre:");
		labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));

		campoNombre = new JTextField();

		botonBuscar = new JButton("Buscar");
		ListenerModificacionEnviar escuchador1 = new ListenerModificacionEnviar(this);
		botonBuscar.addActionListener(escuchador1);

		error = new JLabel("");
		error.setForeground(new Color(255, 0, 0));
		error.setBounds(56, 160, 104, 30);
		getContentPane().add(error);
		
		atras = new JButton("Atrás");
		ListenerAtrasModificacion escuchador2 = new ListenerAtrasModificacion(this);
		atras.addActionListener(escuchador2);

		// Configuración del layout
		getContentPane().setLayout(null);

		titulo.setBounds(10, 28, 400, 30);
		getContentPane().add(titulo);

		labelTipo.setBounds(56, 68, 50, 30);
		getContentPane().add(labelTipo);

		radioAlumno.setBounds(170, 68, 73, 30);
		getContentPane().add(radioAlumno);

		radioProyecto.setBounds(245, 68, 80, 30);
		getContentPane().add(radioProyecto);

		labelNombre.setBounds(56, 108, 61, 30);
		getContentPane().add(labelNombre);

		campoNombre.setBounds(170, 109, 200, 30);
		getContentPane().add(campoNombre);

		botonBuscar.setBounds(290, 160, 80, 30);
		getContentPane().add(botonBuscar);

		atras.setBounds(170, 160, 80, 30);
		getContentPane().add(atras);

	}

	/**
	 * El resto de getters 
	 */
	
	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getLabelTipo() {
		return labelTipo;
	}

	public void setLabelTipo(JLabel labelTipo) {
		this.labelTipo = labelTipo;
	}

	public JLabel getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	public JRadioButton getRadioAlumno() {
		return radioAlumno;
	}

	public void setRadioAlumno(JRadioButton radioAlumno) {
		this.radioAlumno = radioAlumno;
	}

	public JRadioButton getRadioProyecto() {
		return radioProyecto;
	}

	public void setRadioProyecto(JRadioButton radioProyecto) {
		this.radioProyecto = radioProyecto;
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public JButton getBotonBuscar() {
		return botonBuscar;
	}

	public void setBotonBuscar(JButton botonBuscar) {
		this.botonBuscar = botonBuscar;
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
		setVisible(true);
	}

	public JLabel getError() {
		return error;
	}

	public void setError(JLabel error) {
		this.error = error;
	}

}