package mvc.vista;

import javax.swing.*;
import java.awt.*;

public class VistaConsulta extends JFrame {

	private JLabel titulo, labelTipo, labelNombre, labelAreas, error;
	private JRadioButton radioAlumno, radioProyecto;
	private JTextField campoNombre;
	private JButton botonBuscar;
	private JComboBox lista;
	private JButton atras;
	
	public VistaConsulta() {
		// Configuración de la ventana
		super("Consulta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarComponentes();
	}
	
	public void inicializarComponentes() {
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

		botonBuscar = new JButton("Buscar");
		
		
		atras = new JButton("Atrás");
		ListenerAtrasConsulta escuchador1 = new ListenerAtrasConsulta(this);
		atras.addActionListener(escuchador1);
		
		lista = new JComboBox();
		
		error = new JLabel();
		error.setForeground(new Color(255, 0, 0));

		// Configuración del layout
		getContentPane().setLayout(null);
		
		error.setBounds(66, 170, 200, 25);
		getContentPane().add(error);

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

		campoNombre.setBounds(172, 91, 200, 30);
		getContentPane().add(campoNombre);
		
		lista.setBounds(172, 130, 200, 30);
		getContentPane().add(lista);

		labelAreas.setBounds(66, 130, 100, 30);
		getContentPane().add(labelAreas);

		botonBuscar.setBounds(296, 171, 80, 30);
		getContentPane().add(botonBuscar);
		
		atras.setBounds(172, 170, 80, 30);
		getContentPane().add(atras);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	public JLabel getError() {
		return error;
	}

	public void setError(JLabel error) {
		this.error = error;
	}

	public JComboBox getLista() {
		return lista;
	}

	public void setLista(JComboBox lista) {
		this.lista = lista;
	}

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

	public JLabel getLabelAreas() {
		return labelAreas;
	}

	public void setLabelAreas(JLabel labelAreas) {
		this.labelAreas = labelAreas;
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

}