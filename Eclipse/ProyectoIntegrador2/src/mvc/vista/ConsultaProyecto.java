package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class ConsultaProyecto extends JFrame{

	private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel apellidos;
    private JLabel apellidosLabel;
    private JLabel matricula;
    private JLabel matriculaLabel;
    private JButton volverButton;

    public ConsultaProyecto() {
        // Configuración de la ventana
        super("Consulta Datos del Proyecto");
        // Inicializar los componentes
        inicializarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
    	//Configuramos la ventana
    	
    	setSize(440, 250);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración de los componentes
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Datos del Proyecto");
        titulo.setBounds(118, 18, 200, 25);

        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(106, 53, 100, 25);

        nombreLabel = new JLabel();
        nombreLabel.setText("Proyecto Mamado");
        nombreLabel.setBounds(216, 53, 200, 25);

        apellidos = new JLabel();
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setText("Grupo:");
        apellidos.setBounds(106, 89, 100, 25);

        apellidosLabel = new JLabel();
        apellidosLabel.setText("Atom");
        apellidosLabel.setBounds(216, 89, 200, 25);

        matricula = new JLabel();
        matricula.setFont(new Font("Tahoma", Font.BOLD, 11));
        matricula.setText("Área:");
        matricula.setBounds(106, 124, 100, 25);

        matriculaLabel = new JLabel();
        matriculaLabel.setText("DAW");
        matriculaLabel.setBounds(216, 124, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        volverButton.setBounds(116, 158, 140, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(nombre);
        getContentPane().add(nombreLabel);
        getContentPane().add(apellidos);
        getContentPane().add(apellidosLabel);
        getContentPane().add(matricula);
        getContentPane().add(matriculaLabel);
        getContentPane().add(volverButton);
    }

    private void hacerVisible() {
        setVisible(true);
    }
	
}
