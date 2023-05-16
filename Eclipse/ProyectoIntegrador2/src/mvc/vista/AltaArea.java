package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class AltaArea extends JFrame {
	
	private JLabel titulo;
	private JLabel nombre;
	private JTextField inputNombre;
	private JLabel duracion;
	private JTextArea descripcion;
	private JButton enviar;

	public AltaArea() {
		super("Alta Area");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();

	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(440, 250);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración del título
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Alta Area");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(110, 10, 200, 25);

		// Creación y configuración del nombre del área
		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(30, 68, 60, 25);

		inputNombre = new JTextField();
		inputNombre.setBounds(175, 68, 180, 25);

		// Creación y configuración del text area
		duracion = new JLabel();
		duracion.setFont(new Font("Tahoma", Font.BOLD, 11));
		duracion.setText("Descripción:");
		duracion.setBounds(30, 113, 102, 25);

		descripcion = new JTextArea();
		descripcion.setBounds(175, 113, 180, 25);
		

		// Creación y configuración del botón de enviar
		enviar = new JButton();
		enviar.setText("Enviar");
		enviar.setBounds(275, 162, 80, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(inputNombre);
		getContentPane().add(duracion);
		getContentPane().add(descripcion);
		getContentPane().add(enviar);
	}

	private void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}
}
