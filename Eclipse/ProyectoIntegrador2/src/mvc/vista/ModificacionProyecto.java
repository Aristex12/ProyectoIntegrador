package mvc.vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ModificacionProyecto extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JTextField nombreTextField;
	private JLabel curso;
	private JComboBox<String> comboCurso;
	private JLabel area;
	JComboBox<String> areaCombo;
	private JLabel nota;
	private JComboBox<Integer> notasCombo;
	private JButton modificarButton;

	public ModificacionProyecto() {
		super("Modificar Datos del Proyecto");
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		// Configuración de la ventana
		setTitle("Datos del Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(440, 270);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Modificar Datos del Alumno");
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
		comboCurso = new JComboBox<String>();
		comboCurso.setBounds(160, 130, 200, 25);

		area = new JLabel();
		area.setFont(new Font("Tahoma", Font.BOLD, 11));
		area.setText("Área:");
		area.setBounds(50, 130, 100, 25);

		String[] opciones2 = { "Opción 1", "Opción 2", "Opción 3" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(opciones);
		areaCombo = new JComboBox<>(modelo);
		areaCombo.setBounds(160, 95, 200, 24);

		nota = new JLabel("Nota:");
		nota.setFont(new Font("Tahoma", Font.BOLD, 11));
		nota.setBounds(50, 160, 100, 24);

		notasCombo = new JComboBox<Integer>();
		notasCombo.setBounds(160, 165, 200, 24);

		modificarButton = new JButton();

		modificarButton.setText("Modificar");
		modificarButton.setBounds(260, 199, 100, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(nombreTextField);
		getContentPane().add(curso);
		getContentPane().add(comboCurso);
		getContentPane().add(area);
		getContentPane().add(areaCombo);
		getContentPane().add(nota);
		getContentPane().add(notasCombo);
		getContentPane().add(modificarButton);
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

	public JComboBox<Integer> getNotasCombo() {
		return notasCombo;
	}

	public void setNotasCombo(JComboBox<Integer> notasCombo) {
		this.notasCombo = notasCombo;
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

}
