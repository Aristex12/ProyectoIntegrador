package mvc.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import mvc.controlador.ListenerAtrasConsultaArea;
import mvc.controlador.ListenerVolverAlMenuProyecto;

/**
 * <p>
 * La clase ConsultaArea permite al usuario consultar los datos de un área
 * específica en la base de datos.
 * </p>
 *
 * <p>
 * El usuario puede ver los datos del área, como nombre y descripción. También
 * se incluye un botón para volver al menú principal.
 * </p>
 *
 * @author Aris, Josep, Miguel y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class ConsultaArea extends JFrame {

	// Etiquetas para el título y los datos del área
	private JLabel titulo;
	private JLabel nombre;
	private JLabel nombreLabel;
	private JLabel descripcion;

	// Área de texto para la descripción del área
	private JTextArea descripcionLabel;

	// Botón para volver al menú principal
	private JButton volverButton;

	public ConsultaArea() {
		// Configuración de la ventana
		super("Consulta Datos del Area");
		// Inicializar los componentes
		inicializarComponentes();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
     * <p>Método para inicializar todos los componentes de la ventana de ConsultaArea.</p>
     * <p>Incluye la configuración de etiquetas, área de texto y botón, y otros elementos de la interfaz de usuario.</p>
     */
	
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
		descripcionLabel.setEditable(false);
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

	/**
	 * El resto de getters y setters
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

	/**
     * <p>Método para hacer visible la ventana de ConsultaArea.</p>
     */
	
	public void hacerVisible() {
		setVisible(true);
	}

}
