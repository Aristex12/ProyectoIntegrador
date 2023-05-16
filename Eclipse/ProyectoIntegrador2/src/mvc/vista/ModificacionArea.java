package mvc.vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ModificacionArea extends JFrame{

	 	private JLabel titulo;
	    private JLabel nombre;
	    private JTextField nombreTextField;
	    private JLabel duracion;
	    private JTextField duracionTextField;
	    private JComboBox<String> areaComboBox;
	    private JButton modificarButton;

	    public ModificacionArea() {
	        // Configuración de la ventana
	        super("Modificar Datos del Área");
	        // Inicializar los componentes
	        inicializarComponentes();

	    }

	    private void inicializarComponentes() {
	    	
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	//Configuramos la ventana
	    	setSize(440, 250);
	        setLocationRelativeTo(null);
	        getContentPane().setLayout(null);
	        setVisible(true);
	    	
	        // Creación y configuración de los componentes
	        titulo = new JLabel();
	        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
	        titulo.setText("Modificar Datos del Curso");
	        titulo.setBounds(108, 24, 261, 25);

	        nombre = new JLabel();
	        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
	        nombre.setText("Nombre:");
	        nombre.setBounds(50, 69, 100, 25);

	        nombreTextField = new JTextField();
	        nombreTextField.setBounds(160, 69, 200, 25);

	        duracion = new JLabel();
	        duracion.setFont(new Font("Tahoma", Font.BOLD, 11));
	        duracion.setText("Descripción:");
	        duracion.setBounds(50, 105, 100, 25);

	        duracionTextField = new JTextField();
	        duracionTextField.setBounds(160, 105, 200, 25);

	        modificarButton = new JButton();
	        modificarButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        modificarButton.setText("Modificar");
	        modificarButton.setBounds(240, 149, 120, 25);

	        // Agregar componentes a la ventana
	        getContentPane().add(titulo);
	        getContentPane().add(nombre);
	        getContentPane().add(nombreTextField);
	        getContentPane().add(duracion);
	        getContentPane().add(duracionTextField);
	        getContentPane().add(areaComboBox);
	        getContentPane().add(modificarButton);
	    }

	    private void hacerVisible() {
	        setVisible(true);
	    }
	
}
