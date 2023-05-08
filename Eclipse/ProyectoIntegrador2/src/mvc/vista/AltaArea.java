package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class AltaArea extends JFrame {
	
	private JLabel titulo;
	private JLabel nombre;
	private JTextField inputNombre;
	private JLabel duracion;
	private JComboBox<Integer> duracionComboBox;
	private JButton enviar;

	public AltaArea() {
		super("Alta Area");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();

	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(328, 190);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración del título
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Alta Area");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(50, 10, 200, 25);

		// Creación y configuración del nombre del área
		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(30, 50, 60, 25);

		inputNombre = new JTextField();
		inputNombre.setBounds(90, 50, 180, 25);

		// Creación y configuración de la duración del área
		duracion = new JLabel();
		duracion.setFont(new Font("Tahoma", Font.BOLD, 11));
		duracion.setText("Duración:");
		duracion.setBounds(30, 80, 60, 25);

		Integer[] duraciones = { 1, 2, 3, 4, 5 };
		DefaultComboBoxModel<Integer> model = new DefaultComboBoxModel<>(duraciones);
		duracionComboBox = new JComboBox<>(model);
		duracionComboBox.setBounds(90, 80, 180, 25);

		// Creación y configuración del botón de enviar
		enviar = new JButton();
		enviar.setText("Enviar");
		enviar.setBounds(110, 116, 80, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(inputNombre);
		getContentPane().add(duracion);
		getContentPane().add(duracionComboBox);
		getContentPane().add(enviar);
	}

	private void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}
}
