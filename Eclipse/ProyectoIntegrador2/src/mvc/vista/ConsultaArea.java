package mvc.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import mvc.controlador.ListenerAtrasConsultaArea;
import mvc.controlador.ListenerVolverAlMenuProyecto;

public class ConsultaArea extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JLabel nombreLabel;
	private JLabel descripcion;
	private JTextArea descripcionLabel;
	private JButton volverButton;

	public ConsultaArea() {
		// Configuración de la ventana
		super("Consulta Datos del Area");
		// Inicializar los componentes
		inicializarComponentes();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void inicializarComponentes() {
		// Configuramos la ventana

		setSize(440, 250);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Datos del Proyecto");
		titulo.setBounds(28, 18, 200, 25);

		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(28, 67, 51, 25);

		nombreLabel = new JLabel();
		nombreLabel.setText("");
		nombreLabel.setBounds(117, 67, 268, 25);

		descripcion = new JLabel();
		descripcion.setFont(new Font("Tahoma", Font.BOLD, 11));
		descripcion.setText("Descripción:");
		descripcion.setBounds(28, 102, 83, 25);

		descripcionLabel = new JTextArea("");
		descripcionLabel.setLineWrap(true);
        descripcionLabel.setWrapStyleWord(true);
		descripcionLabel.setBounds(117, 102, 268, 66);
		
		volverButton = new JButton();
		ListenerAtrasConsultaArea escuchador1 = new ListenerAtrasConsultaArea(this);
		volverButton.addActionListener(escuchador1);
		volverButton.setText("Volver al Menú");
		
	
		volverButton.setBounds(243, 178, 140, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(nombreLabel);
		getContentPane().add(descripcion);
		getContentPane().add(descripcionLabel);
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

	public JLabel getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(JLabel descripcion) {
		this.descripcion = descripcion;
	}

	public JTextArea getDescripcionLabel() {
		return descripcionLabel;
	}

	public void setDescripcionLabel(JTextArea descripcionLabel) {
		this.descripcionLabel = descripcionLabel;
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
