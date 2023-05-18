package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasAltaProyecto;

import java.awt.Font;

public class AltaProyecto extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JTextField inputNombre;
	private JLabel grupoLabel;
	private JComboBox<Integer> cursoComboBox;
	private JLabel areaLabel;
	private JComboBox<String> areaComboBox;
	private JComboBox<Integer> notaComboBox;
	private JButton enviar;
	private JButton atras;
	private JLabel labelNota;

	public AltaProyecto() {
		super("Alta Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(440, 306);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración del título
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Alta Proyecto");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(102, 10, 200, 25);

		// Creación y configuración del nombre del proyecto
		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(60, 55, 60, 25);

		inputNombre = new JTextField();
		inputNombre.setBounds(189, 55, 180, 25);

		// Creación y configuración del grupo del proyecto
		grupoLabel = new JLabel();
		grupoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		grupoLabel.setText("Curso:");
		grupoLabel.setBounds(60, 90, 60, 25);

		cursoComboBox = new JComboBox<Integer>();
		cursoComboBox.setBounds(189, 90, 180, 25);

		// Creación y configuración del área del proyecto
		areaLabel = new JLabel();
		areaLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		areaLabel.setText("Área:");
		areaLabel.setBounds(60, 125, 60, 25);

        areaComboBox = new JComboBox<>();
        areaComboBox.setBounds(189, 125, 180, 25);

		// Creación y configuración del botón de enviar
		enviar = new JButton();
		enviar.setText("Enviar");
		enviar.setBounds(289, 207, 80, 25);

		//Creamos el boton atras
		atras = new JButton("Atrás");
		ListenerAtrasAltaProyecto escuchador1 = new ListenerAtrasAltaProyecto(this);
		atras.addActionListener(escuchador1);
		atras.setBounds(189, 207, 80, 25);
		
		//Configuramos el jLabel de notas
		labelNota = new JLabel("Nota:");
		labelNota.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNota.setBounds(60, 160, 80, 25);
		
		//Creamos la lista
		notaComboBox = new JComboBox<>();
		notaComboBox.setBounds(189, 160, 80, 25);
		
		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(inputNombre);
		getContentPane().add(grupoLabel);
		getContentPane().add(cursoComboBox);
		getContentPane().add(areaLabel);
		getContentPane().add(areaComboBox);
		getContentPane().add(enviar);
		getContentPane().add(atras);
		getContentPane().add(notaComboBox);
		getContentPane().add(labelNota);
	}

	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

}
