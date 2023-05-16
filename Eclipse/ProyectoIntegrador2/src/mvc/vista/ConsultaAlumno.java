package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class ConsultaAlumno extends JFrame{

	private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel apellidos;
    private JLabel apellidosLabel;
    private JLabel matricula;
    private JLabel matriculaLabel;
    private JButton volverButton;

    public ConsultaAlumno() {
        // Configuración de la ventana
        super("Consulta de Alumno");
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
        titulo.setText("Datos del Alumno");
        titulo.setBounds(124, 10, 158, 25);

        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(81, 53, 100, 25);

        nombreLabel = new JLabel();
        nombreLabel.setText("Nombre Imaginario");
        nombreLabel.setBounds(202, 53, 200, 25);

        apellidos = new JLabel();
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setText("Apellidos:");
        apellidos.setBounds(81, 88, 100, 25);

        apellidosLabel = new JLabel();
        apellidosLabel.setText("Apellido Imaginario");
        apellidosLabel.setBounds(202, 89, 200, 25);

        matricula = new JLabel();
        matricula.setFont(new Font("Tahoma", Font.BOLD, 11));
        matricula.setText("Matrícula:");
        matricula.setBounds(81, 124, 100, 25);

        matriculaLabel = new JLabel();
        matriculaLabel.setText("1234567890");
        matriculaLabel.setBounds(202, 124, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        volverButton.setBounds(127, 159, 140, 25);

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
