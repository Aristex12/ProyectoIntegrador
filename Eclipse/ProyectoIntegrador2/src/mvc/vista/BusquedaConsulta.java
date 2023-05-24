package mvc.vista;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

import mvc.controlador.ListenerAtrasBusquedaConsulta;
import mvc.controlador.ListenerSeleccionBusquedaConsulta;
import mvc.modelo.Alumno;
import mvc.modelo.Area;
import mvc.modelo.Proyectos;

//Importaciones necesarias

/**
* <p>La clase BusquedaConsulta permite al usuario buscar y consultar información en la base de datos. Esta clase muestra los resultados de la búsqueda en una lista y permite al usuario seleccionar un resultado para obtener más información.</p>
*
* <p>El usuario también puede volver a la pantalla anterior utilizando un botón de "Atrás".</p>
*
* @author Aris, Miguel, Josep y Dani
* @version 1.0
* @since 2023-05-24
*/

public class BusquedaConsulta extends JFrame {

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
    DefaultListModel<String> listModel;
    JList<String> resultList;

    /**
     * <p>Constructor para la clase BusquedaConsulta. Inicializa la ventana y sus componentes.</p>
     */
    
	public BusquedaConsulta() {
		super("Búsqueda Consulta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
	}

	 /**
     * <p>Método para inicializar todos los componentes de la ventana de BusquedaConsulta.</p>
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

		// Creación del scrollpane

		listModel = new DefaultListModel<>();
		
		resultList = new JList<>(listModel);

		scrollPane = new JScrollPane(resultList);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(50, 50, 332, 156);

		// Configuramos los botones de seleccionar y atras
		seleccionar = new JButton("Seleccionar");
		ListenerSeleccionBusquedaConsulta escuchador1 = new ListenerSeleccionBusquedaConsulta(this);
		seleccionar.addActionListener(escuchador1);
		seleccionar.setBounds(289, 216, 93, 25);

		atras = new JButton("Atrás");
		ListenerAtrasBusquedaConsulta escuchador2 = new ListenerAtrasBusquedaConsulta(this);
		atras.addActionListener(escuchador2);
		atras.setBounds(186, 216, 93, 25);

		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(scrollPane);
		getContentPane().add(seleccionar);
		getContentPane().add(atras);
	}

	/**
     * <p>Método para hacer visible la ventana de BusquedaConsulta.</p>
     */
	
	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}
	
	/**
     * <p>Los métodos rellenarListaAlumnos, rellenarListaProyectos, rellenarListaArea son utilizados para llenar la lista de resultados de búsqueda con los objetos apropiados.</p>
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
	
	public void rellenarListaArea(ArrayList<Area> array) {
		for(Area a : array) {
			listModel.addElement(a.toString());
		}
	}
	
	/**
     * <p>Los métodos get y set son utilizados para obtener y modificar los atributos de la clase.</p>
     */
	
	public JList<String> getResultList() {
		return resultList;
	}

	public void setResultList(JList<String> resultList) {
		this.resultList = resultList;
	}
	
	/**
	 * Resto de getters y setters
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

}
