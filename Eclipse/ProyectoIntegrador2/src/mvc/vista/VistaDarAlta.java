package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAtrasDarAlta;
import mvc.controlador.ListenerVistaDarAltaEnviar;

import java.awt.*;

public class VistaDarAlta extends JFrame {
	private JLabel titulo;
	private JLabel enunciado;
	private JRadioButton opcionAlumno, opcionProyecto;
	private JButton enviar;
	private JButton atras;

	public VistaDarAlta() {
		super("Dar de Alta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializarComponentes();
	}

	public void inicializarComponentes() {

		setSize(440, 250);
		setLocationRelativeTo(null);

		// Creación de los componentes
		titulo = new JLabel("Dar de Alta");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(16, 23, 400, 30);

		enunciado = new JLabel("¿Que quieres dar de alta?");
		enunciado.setFont(new Font("Tahoma", Font.PLAIN, 11));
		enunciado.setBounds(26, 63, 148, 30);

		opcionAlumno = new JRadioButton("Alumno");
		opcionAlumno.setSelected(true);
		opcionProyecto = new JRadioButton("Proyecto");
		opcionAlumno.setBounds(29, 98, 80, 20);
		opcionProyecto.setBounds(29, 134, 80, 20);

		ButtonGroup grupoOpciones = new ButtonGroup();
		grupoOpciones.add(opcionAlumno);
		grupoOpciones.add(opcionProyecto);

		enviar = new JButton("Enviar");
		ListenerVistaDarAltaEnviar escuchador2 = new ListenerVistaDarAltaEnviar(this);
		enviar.addActionListener(escuchador2);
		enviar.setBounds(119, 178, 80, 25);

		atras = new JButton("Atrás");
		ListenerAtrasDarAlta escuchador1 = new ListenerAtrasDarAlta(this);
		atras.addActionListener(escuchador1);
		atras.setBounds(29, 178, 80, 25);

		getContentPane().setLayout(null);
		getContentPane().add(titulo);
		getContentPane().add(opcionAlumno);
		getContentPane().add(opcionProyecto);

		getContentPane().add(enviar);
		getContentPane().add(enunciado);
		getContentPane().add(atras);

	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(JLabel enunciado) {
		this.enunciado = enunciado;
	}

	public JRadioButton getOpcionAlumno() {
		return opcionAlumno;
	}

	public void setOpcionAlumno(JRadioButton opcionAlumno) {
		this.opcionAlumno = opcionAlumno;
	}

	public JRadioButton getOpcionProyecto() {
		return opcionProyecto;
	}

	public void setOpcionProyecto(JRadioButton opcionProyecto) {
		this.opcionProyecto = opcionProyecto;
	}

	public JButton getEnviar() {
		return enviar;
	}

	public void setEnviar(JButton enviar) {
		this.enviar = enviar;
	}

	public JButton getAtras() {
		return atras;
	}

	public void setAtras(JButton atras) {
		this.atras = atras;
	}

	public void hacerVisible() {
		setVisible(true);
	}
}