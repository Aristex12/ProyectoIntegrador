package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasBusquedaBaja;
import mvc.controlador.ListenerSeleccionarBusquedaBaja;
import mvc.modelo.Alumno;
import mvc.modelo.Proyectos;

import java.awt.Font;
import java.util.ArrayList;

/**
 * <p>La clase BusquedaDarBaja permite al usuario buscar y dar de baja información en la base de datos. Muestra los resultados de la búsqueda en una lista y permite al usuario seleccionar un resultado para darlo de baja.</p>
 *
 * <p>El usuario también puede volver a la pantalla anterior utilizando un botón de "Atrás".</p>
 *
 * @author Aris, Miguel, Josep y Dani
 * @version 1.0
 * @since 2023-05-24
 */

public class BusquedaDarBaja extends JFrame {

	// Etiqueta de título
    private JLabel titulo;
    
    // Panel principal
    private JPanel panel;

    // ScrollPane para la lista de resultados de la búsqueda
    private JScrollPane scrollPane;

    // Botones para seleccionar un resultado y para volver a la pantalla anterior
    private JButton seleccionar;
    private JButton atras;

    // Lista de resultados de la búsqueda
    JList<String> resultList;
    DefaultListModel<String> listModel;

    /**
     * <p>Constructor para la clase BusquedaDarBaja. Inicializa la ventana y sus componentes.</p>
     */
    
    public BusquedaDarBaja() {
        super("Búsqueda Dar Baja");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();

    }

    /**
     * <p>Método para inicializar todos los componentes de la ventana de BusquedaDarBaja.</p>
     * <p>Incluye la configuración de etiquetas, botones, listas, scrollpane y otros elementos de la interfaz de usuario.</p>
     */
    
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
        
        listModel = new DefaultListModel<>();
        
        resultList = new JList<>(listModel);
        
        scrollPane = new JScrollPane(resultList);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(50, 50, 332, 156);

        //Configuramos los botones de seleccionar y atras
        seleccionar = new JButton("Seleccionar");
        ListenerSeleccionarBusquedaBaja escuchador2 = new ListenerSeleccionarBusquedaBaja(this);
        seleccionar.addActionListener(escuchador2);
        seleccionar.setBounds(289, 216, 93, 25);
        
        atras = new JButton("Atras");
        ListenerAtrasBusquedaBaja escuchador1 = new ListenerAtrasBusquedaBaja(this);
        atras.addActionListener(escuchador1);
        atras.setBounds(186, 216, 93, 25);
        
        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(scrollPane);
        getContentPane().add(seleccionar);
        getContentPane().add(atras);
    }
    
    /**
     * <p>Los métodos rellenarListaAlumnos y rellenarListaProyectos son utilizados para llenar la lista de resultados de búsqueda con los objetos apropiados.</p>
     */
    
    public void rellenarListaAlumnos (ArrayList<Alumno> array) {
		for(Alumno a : array) {
			listModel.addElement(a.toString());
		}
	}
	
	public void rellenarListaProyectos (ArrayList<Proyectos> array) {
		for(Proyectos a : array) {
			listModel.addElement(a.toString());
		}
	}
    
	/**
	 * El resto de getters y setters
	 * 
	 */
	
    public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public JButton getSeleccionar() {
		return seleccionar;
	}

	public void setSeleccionar(JButton seleccionar) {
		this.seleccionar = seleccionar;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public JList<String> getResultList() {
		return resultList;
	}

	public void setResultList(JList<String> resultList) {
		this.resultList = resultList;
	}

	public DefaultListModel<String> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<String> listModel) {
		this.listModel = listModel;
	}

	/**
     * <p>Método para hacer visible la ventana de BusquedaDarBaja.</p>
     */
	
	public void hacerVisible() {
    	// Hacer visible la ventana
        setVisible(true);
    }
}
