package mvc.vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ModificacionProyecto extends JFrame {
	
	private JLabel titulo;
	private JLabel nombre;
	private JTextField nombreTextField;
	private JLabel grupo;
	private JTextField grupoTextField;
	private JLabel area;
	private JButton modificarButton;

	public ModificacionProyecto() {
		super("Modificar Datos del Proyecto");
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		// Configuración de la ventana
		setTitle("Datos del Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(435, 236);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Modificar Datos del Alumno");
		titulo.setBounds(100, 10, 237, 25);

		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(50, 45, 100, 25);

		nombreTextField = new JTextField();
		nombreTextField.setBounds(160, 45, 200, 25);

		grupo = new JLabel();
		grupo.setFont(new Font("Tahoma", Font.BOLD, 11));
		grupo.setText("Grupo:");
		grupo.setBounds(50, 80, 100, 25);

		grupoTextField = new JTextField();
		grupoTextField.setBounds(160, 80, 200, 25);

		area = new JLabel();
		area.setFont(new Font("Tahoma", Font.BOLD, 11));
		area.setText("Área:");
		area.setBounds(50, 115, 100, 25);
		
		String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(opciones);
		JComboBox<String> comboBox = new JComboBox<>(modelo);
		comboBox.setBounds(160, 116, 200, 24);
        
		modificarButton = new JButton();
		modificarButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		modificarButton.setText("Modificar");
		modificarButton.setBounds(160, 161, 100, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(nombreTextField);
		getContentPane().add(grupo);
		getContentPane().add(grupoTextField);
		getContentPane().add(area);
		getContentPane().add(comboBox);
		getContentPane().add(modificarButton);
	}

	public void hacerVisible() {
		// Hacer visible la ventana
        setVisible(true);
	}
	
}
