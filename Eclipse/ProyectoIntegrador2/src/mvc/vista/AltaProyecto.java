package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class AltaProyecto extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JTextField inputNombre;
	private JLabel grupoLabel;
	private JTextField inputGrupo;
	private JLabel areaLabel;
	private JComboBox<String> areaComboBox;
	private JButton enviar;

	public AltaProyecto() {
		super("Alta Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(332, 240);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración del título
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Alta Proyecto");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(50, 10, 200, 25);

		// Creación y configuración del nombre del proyecto
		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(30, 50, 60, 25);

		inputNombre = new JTextField();
		inputNombre.setBounds(90, 50, 180, 25);

		// Creación y configuración del grupo del proyecto
		grupoLabel = new JLabel();
		grupoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		grupoLabel.setText("Grupo:");
		grupoLabel.setBounds(30, 80, 60, 25);

		inputGrupo = new JTextField();
		inputGrupo.setBounds(90, 80, 180, 25);

		// Creación y configuración del área del proyecto
		areaLabel = new JLabel();
		areaLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		areaLabel.setText("Área:");
		areaLabel.setBounds(30, 110, 60, 25);

		String[] areas = {"DAW", "ASIR", "SMR"};
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(areas);
        areaComboBox = new JComboBox<>(model);
        areaComboBox.setBounds(90, 110, 180, 25);

		// Creación y configuración del botón de enviar
		enviar = new JButton();
		enviar.setText("Enviar");
		enviar.setBounds(110, 146, 80, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(inputNombre);
		getContentPane().add(grupoLabel);
		getContentPane().add(inputGrupo);
		getContentPane().add(areaLabel);
		getContentPane().add(areaComboBox);
		getContentPane().add(enviar);
	}

	private void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

}
