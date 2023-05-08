package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class BusquedaAlumno extends JFrame {

	private JLabel titulo;
    private JPanel panel;
    private JScrollPane scrollPane;

    public BusquedaAlumno() {
        super("Búsqueda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar los componentes
        inicializarComponentes();

    }

    public void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(400, 300);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración del título
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Busqueda");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(50, 10, 300, 25);

        // Creación y configuración del panel de datos
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Creación del scrollpane
        scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50, 50, 300, 200);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(scrollPane);
    }
    
    public void hacerVisible() {
    	// Hacer visible la ventana
        setVisible(true);
    }
	
}
