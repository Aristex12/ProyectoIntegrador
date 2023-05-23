package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasModificacionProyecto;
import mvc.controlador.ListenerEnviarModificacionProyecto;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class ModificacionProyecto extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JTextField nombreTextField;
	private JLabel curso;
	private JComboBox<String> comboCurso;
	private JLabel area;
	JComboBox<String> areaCombo;
	private JLabel nota;
	private JSpinner notasSpinner;
	private JLabel labelError;
	private JButton atras;
	private JButton modificarButton;

	public ModificacionProyecto() {
		super("Modificar");
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		// Configuración de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(440, 270);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Modificar Datos del Proyecto");
		titulo.setBounds(90, 22, 237, 25);

		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(50, 60, 100, 25);

		nombreTextField = new JTextField();
		nombreTextField.setBounds(160, 60, 200, 25);

		curso = new JLabel();
		curso.setFont(new Font("Tahoma", Font.BOLD, 11));
		curso.setText("Curso:");
		curso.setBounds(50, 95, 100, 25);

		String[] opciones = { "Primero", "Segundo" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(opciones);
		comboCurso = new JComboBox<String>(modelo);
		comboCurso.setBounds(160, 95, 200, 25);

		area = new JLabel();
		area.setFont(new Font("Tahoma", Font.BOLD, 11));
		area.setText("Área:");
		area.setBounds(50, 130, 100, 25);
		
		String[] opciones2 = {"BaseDeDatos", "Programación", "LenguajeDeMarcas", "FOL", "SistemasInformaticos"};
		DefaultComboBoxModel<String> modelo2 = new DefaultComboBoxModel<>(opciones2);
		areaCombo = new JComboBox<>(modelo2);
		areaCombo.setBounds(160, 130, 200, 24);

		nota = new JLabel("Nota:");
		nota.setFont(new Font("Tahoma", Font.BOLD, 11));
		nota.setBounds(50, 160, 100, 24);

		SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
		notasSpinner = new JSpinner(spinnerModel);
		notasSpinner.setBounds(160, 165, 47, 24);

		modificarButton = new JButton();
		
		atras = new JButton("Atrás");
		ListenerAtrasModificacionProyecto escuchador1 = new ListenerAtrasModificacionProyecto(this);
		atras.addActionListener(escuchador1);
		atras.setBounds(160, 199, 87, 25);
		
		labelError = new JLabel("");
		labelError.setForeground(new Color(255, 0, 0));
		labelError.setBounds(50, 194, 100, 25);
		
		modificarButton.setText("Modificar");
		ListenerEnviarModificacionProyecto escuchador2 = new ListenerEnviarModificacionProyecto(this);
		modificarButton.addActionListener(escuchador2);
		modificarButton.setBounds(273, 199, 87, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(nombreTextField);
		getContentPane().add(curso);
		getContentPane().add(comboCurso);
		getContentPane().add(area);
		getContentPane().add(areaCombo);
		getContentPane().add(nota);
		getContentPane().add(notasSpinner);
		getContentPane().add(labelError);
		getContentPane().add(modificarButton);
		getContentPane().add(atras);
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

	public JTextField getNombreTextField() {
		return nombreTextField;
	}

	public void setNombreTextField(JTextField nombreTextField) {
		this.nombreTextField = nombreTextField;
	}

	public JLabel getCurso() {
		return curso;
	}

	public void setCurso(JLabel curso) {
		this.curso = curso;
	}

	public JComboBox<String> getComboCurso() {
		return comboCurso;
	}

	public void setComboCurso(JComboBox<String> comboCurso) {
		this.comboCurso = comboCurso;
	}

	public JLabel getArea() {
		return area;
	}

	public void setArea(JLabel area) {
		this.area = area;
	}

	public JComboBox<String> getAreaCombo() {
		return areaCombo;
	}

	public void setAreaCombo(JComboBox<String> areaCombo) {
		this.areaCombo = areaCombo;
	}

	public JLabel getNota() {
		return nota;
	}

	public void setNota(JLabel nota) {
		this.nota = nota;
	}

	public JSpinner getNotasSpinner() {
		return notasSpinner;
	}

	public void setNotasSpinner(JSpinner notasSpinner) {
		this.notasSpinner = notasSpinner;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JButton getModificarButton() {
		return modificarButton;
	}

	public void setModificarButton(JButton modificarButton) {
		this.modificarButton = modificarButton;
	}

	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

	public JLabel getLabelError() {
		return labelError;
	}

	public void setLabelError(JLabel labelError) {
		this.labelError = labelError;
	}

}
