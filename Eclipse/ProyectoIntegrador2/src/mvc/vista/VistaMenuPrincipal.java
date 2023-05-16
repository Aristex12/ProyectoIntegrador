package mvc.vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class VistaMenuPrincipal extends JFrame {
	
	private JButton btnDarAlta;
	private JButton btnDarBaja;
	private JButton btnModificacion;
	private JButton btnConsulta;
	private JLabel lblGestinDeProyectos;
	private JLabel label2;
	
	
	

	public VistaMenuPrincipal() {
		super ("Menu");
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
	}
	
	
	


	public void inicializarComponentes() {
		//Cambios del editor visual		
				getContentPane().setBackground(new Color(255, 255, 255));
				getContentPane().setForeground(new Color(255, 255, 0));
				//Definimos la forma de colocar los componentes e el panel que lo muestra 
				getContentPane().setLayout(null);
				
				//TODO aquí iría la definición de componentes 
				
				//Asignamos tamaño y posicion en la pantalla
				setSize(500,410);
				setLocationRelativeTo(null);
		
				
				btnDarAlta = new JButton ("Dar de alta");
				
				btnDarAlta.setBounds(170, 128, 146, 36);
				getContentPane().add(btnDarAlta);
				
				btnDarBaja = new JButton ("Dar de baja");
				btnDarBaja.setBounds(170, 192, 146, 36);
				getContentPane().add(btnDarBaja);
				
				btnModificacion = new JButton ("Modificacion");
				btnModificacion.setBounds(170, 252, 146, 36);
				getContentPane().add(btnModificacion);
				
				btnConsulta = new JButton ("Consulta");
				btnConsulta.setBounds(170, 309, 150, 36);
				getContentPane().add(btnConsulta);
				
				
				lblGestinDeProyectos = new JLabel ("Gestión de Proyectos \r\nIntegradores");
				lblGestinDeProyectos.setFont(new Font("Tahoma", Font.BOLD, 16));
			
				lblGestinDeProyectos.setBounds(93,11,368,77);
				getContentPane().add(lblGestinDeProyectos);
				
				label2 = new JLabel ("Elige una opción:");
				label2.setFont(new Font("Tahoma", Font.PLAIN, 11));
			
				label2.setBounds(43,83,204,48);
				getContentPane().add(label2);
				
				
				
	}
	public void hacerVisible() {
		setVisible(true);
	}

	}

