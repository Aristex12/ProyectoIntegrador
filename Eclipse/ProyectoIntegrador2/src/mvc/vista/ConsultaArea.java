package mvc.vista;

import javax.swing.*;
import java.awt.Font;


public class ConsultaArea extends JFrame {
	private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel apellidos;
    private JLabel apellidosLabel;
    private JLabel matricula;
    private JLabel matriculaLabel;
    private JButton volverButton;

    public ConsultaArea() {
        // Configuración de la ventana
        super("Consulta Datos del Area");
        // Inicializar los componentes
        inicializarComponentes();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
    	//Configuramos la ventana
    	
    	setSize(353, 223);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración de los componentes
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Datos del Área");
        titulo.setBounds(100, 10, 200, 25);

        nombre = new JLabel();
        nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        nombre.setText("Nombre:");
        nombre.setBounds(50, 53, 100, 25);

        nombreLabel = new JLabel();
        nombreLabel.setText("Nombre Imaginario");
        nombreLabel.setBounds(160, 53, 200, 25);

        apellidos = new JLabel();
        apellidos.setFont(new Font("Tahoma", Font.BOLD, 11));
        apellidos.setText("Duración:");
        apellidos.setBounds(50, 89, 100, 25);

        apellidosLabel = new JLabel();
        apellidosLabel.setText("5 años");
        apellidosLabel.setBounds(160, 89, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        volverButton.setBounds(100, 125, 140, 25);

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
