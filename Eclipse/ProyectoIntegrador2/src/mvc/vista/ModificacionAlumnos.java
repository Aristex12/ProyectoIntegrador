package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class ModificacionAlumnos extends JFrame{
	
	private JLabel titulo;
	private JLabel nombre;
    private JTextField nombreTextField;
    private JLabel apellidos;
    private JTextField apellidosTextField;
    private JLabel area;
    private JComboBox<String> areaComboBox;
    private JButton modificarButton;
    private JButton atras;
    
    public ModificacionAlumnos() {
    	super("Modificar Datos del Alumno");
    	inicializarComponentes();
    }
    
    public void inicializarComponentes() {
    	// Configuración de la ventana
        setTitle("Datos del Alumno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(440, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Creación y configuración de los componentes
        
        titulo = new JLabel("Modificar Datos del Alumno");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setBounds(101, 25, 230, 25);
        
        nombre = new JLabel("Nombre");
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setBounds(50, 74, 100, 25);

        nombreTextField = new JTextField();
        nombreTextField.setBounds(160, 74, 200, 25);

        apellidos = new JLabel("Apellidos");
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setBounds(50, 110, 100, 25);

        apellidosTextField = new JTextField();
        apellidosTextField.setBounds(160, 110, 200, 25);

        area = new JLabel("Área");
        area.setFont(new Font("Tahoma", Font.BOLD, 11));
        area.setBounds(50, 146, 100, 25);
        
        atras = new JButton("Atrás");
        atras.setBounds(160, 178, 85, 25);

        DefaultComboBoxModel<String> areaComboBoxModel = new DefaultComboBoxModel<>();
        areaComboBoxModel.addElement("Área 1");
        areaComboBoxModel.addElement("Área 2");
        areaComboBoxModel.addElement("Área 3");
        areaComboBox = new JComboBox<>(areaComboBoxModel);
        areaComboBox.setBounds(160, 146, 200, 25);
		modificarButton = new JButton("Modificar");
		modificarButton.setBounds(275, 178, 85, 25);

        // Agregar componentes a la ventana
        getContentPane().add(nombre);
        getContentPane().add(nombreTextField);
        getContentPane().add(apellidos);
        getContentPane().add(apellidosTextField);
        getContentPane().add(area);
        getContentPane().add(areaComboBox);
        getContentPane().add(modificarButton);
        getContentPane().add(titulo);
        getContentPane().add(atras);

        // Hacer visible la ventana
        setVisible(true);
    }
	
}
