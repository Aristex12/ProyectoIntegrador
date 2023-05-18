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
        titulo.setBounds(28, 18, 200, 25);

        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(28, 53, 51, 25);

        nombreLabel = new JLabel();
        nombreLabel.setText("Proyecto Mamado");
        nombreLabel.setBounds(106, 53, 200, 25);

        apellidos = new JLabel();
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setText("Grupo:");
        apellidos.setBounds(28, 88, 51, 25);

        apellidosLabel = new JLabel();
        apellidosLabel.setText("Atom");
        apellidosLabel.setBounds(106, 88, 200, 25);

        matricula = new JLabel();
        matricula.setFont(new Font("Tahoma", Font.BOLD, 11));
        matricula.setText("Área:");
        matricula.setBounds(28, 123, 51, 25);

        matriculaLabel = new JLabel();
        matriculaLabel.setText("DAW");
        matriculaLabel.setBounds(106, 123, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        volverButton.setBounds(28, 160, 140, 25);

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
