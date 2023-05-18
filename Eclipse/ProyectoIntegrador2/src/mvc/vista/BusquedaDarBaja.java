package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class BusquedaDarBaja extends JFrame {

	private JLabel titulo;
    private JPanel panel;
    private JScrollPane scrollPane;
    private JButton seleccionar;
    private JButton atras;

    public BusquedaDarBaja() {
        super("Búsqueda Dar Baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Inicializar los componentes
        inicializarComponentes();

    }

    public void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(442, 299);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
    	
        // Creación y configuración del título
        titulo = new JLabel();
        titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        titulo.setText("Busqueda");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setBounds(67, 10, 300, 25);

        // Creación y configuración del panel de datos
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Creación del scrollpane
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        
        JList<String> resultList = new JList<>(listModel);
        
        scrollPane = new JScrollPane(resultList);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50, 50, 332, 156);

        //Configuramos los botones de seleccionar y atras
        seleccionar = new JButton("Seleccionar");
        seleccionar.setBounds(289, 216, 93, 25);
        
        atras = new JButton("Atras");
        atras.setBounds(186, 216, 93, 25);
        
        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(scrollPane);
        getContentPane().add(seleccionar);
        getContentPane().add(atras);
    }
    
    public void hacerVisible() {
    	// Hacer visible la ventana
        setVisible(true);
    }
	
}
