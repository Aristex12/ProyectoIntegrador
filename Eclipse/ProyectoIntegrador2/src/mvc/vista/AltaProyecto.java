package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAltaProyecto;
import mvc.controlador.ListenerAtrasAltaProyecto;

import java.awt.Font;
import java.awt.Color;

public class AltaProyecto extends JFrame {

	private JLabel titulo;
	private JLabel nombre;
	private JTextField inputNombre;
	private JLabel grupoLabel;
	private JComboBox<String> cursoComboBox;
	private JLabel areaLabel;
	private JComboBox<String> areaComboBox;
	private JSpinner notasSpinner;
	private JLabel labelURL;
	private JTextField inputUrl;
	private JButton enviar;
	private JButton atras;
	private JLabel labelNota;
	private JLabel labelError;

	public AltaProyecto() {
		super("Alta Proyecto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(440, 306);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración del título
		titulo = new JLabel();
		titulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		titulo.setText("Alta Proyecto");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(102, 10, 200, 25);

		// Creación y configuración del nombre del proyecto
		nombre = new JLabel();
		nombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		nombre.setText("Nombre:");
		nombre.setBounds(60, 55, 60, 25);

		inputNombre = new JTextField();
		inputNombre.setBounds(189, 55, 180, 25);

		// Creación y configuración del grupo del proyecto
		grupoLabel = new JLabel();
		grupoLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		grupoLabel.setText("Curso:");
		grupoLabel.setBounds(60, 90, 60, 25);
		
		DefaultComboBoxModel<String> cursos = new DefaultComboBoxModel<>();
		cursos.addElement("Primero");
		cursos.addElement("Segundo");
		cursoComboBox = new JComboBox<String>(cursos);
		cursoComboBox.setBounds(189, 90, 180, 25);

		// Creación y configuración del área del proyecto
		areaLabel = new JLabel();
		areaLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		areaLabel.setText("Área:");
		areaLabel.setBounds(60, 125, 60, 25);

		DefaultComboBoxModel<String> areas = new DefaultComboBoxModel<>();
		areas.addElement("BasesDeDatos");
		areas.addElement("Programación");
		areas.addElement("LenguajeDeMarcas");
		areas.addElement("FOL");
		areas.addElement("SistemasInformaticos");
        areaComboBox = new JComboBox<>(areas);
        areaComboBox.setBounds(189, 125, 180, 25);

        labelURL = new JLabel("Github:");
        labelURL.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelURL.setBounds(60, 195, 60, 25);
        
        inputUrl = new JTextField();
        inputUrl.setBounds(189, 195, 180, 25);
        
        labelError = new JLabel("");
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(22, 230, 141, 25);
        
		// Creación y configuración del botón de enviar
		enviar = new JButton();
		enviar.setText("Enviar");
		ListenerAltaProyecto escuchador2 = new ListenerAltaProyecto(this);
		enviar.addActionListener(escuchador2);
		enviar.setBounds(289, 234, 80, 25);

		//Creamos el boton atras
		atras = new JButton("Atrás");
		ListenerAtrasAltaProyecto escuchador1 = new ListenerAtrasAltaProyecto(this);
		atras.addActionListener(escuchador1);
		atras.setBounds(189, 234, 80, 25);
		
		//Configuramos el jLabel de notas
		labelNota = new JLabel("Nota:");
		labelNota.setFont(new Font("Tahoma", Font.BOLD, 11));
		labelNota.setBounds(60, 160, 80, 25);
		
		SpinnerModel spinnerModel = new SpinnerNumberModel(1, 1, 10, 1);
		notasSpinner = new JSpinner(spinnerModel);
		notasSpinner.setBounds(189, 160, 80, 25);
		
		// Agregar componentes a la ventana
		getContentPane().add(titulo);
		getContentPane().add(nombre);
		getContentPane().add(inputNombre);
		getContentPane().add(grupoLabel);
		getContentPane().add(cursoComboBox);
		getContentPane().add(areaLabel);
		getContentPane().add(areaComboBox);
		getContentPane().add(enviar);
		getContentPane().add(atras);
		getContentPane().add(labelNota);
		getContentPane().add(notasSpinner);
		getContentPane().add(labelURL);
		getContentPane().add(inputUrl);
		getContentPane().add(labelError);
	}

	public JLabel getLabelError() {
		return labelError;
	}

	public void setLabelError(JLabel labelError) {
		this.labelError = labelError;
	}

	public JLabel getLabelURL() {
		return labelURL;
	}

	public void setLabelURL(JLabel labelURL) {
		this.labelURL = labelURL;
	}

	public JTextField getInputUrl() {
		return inputUrl;
	}

	public void setInputUrl(JTextField inputUrl) {
		this.inputUrl = inputUrl;
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JTextField getInputNombre() {
		return inputNombre;
	}

	public void setInputNombre(JTextField inputNombre) {
		this.inputNombre = inputNombre;
	}

	public JLabel getGrupoLabel() {
		return grupoLabel;
	}

	public void setGrupoLabel(JLabel grupoLabel) {
		this.grupoLabel = grupoLabel;
	}

	public JComboBox<String> getCursoComboBox() {
		return cursoComboBox;
	}

	public void setCursoComboBox(JComboBox<String> cursoComboBox) {
		this.cursoComboBox = cursoComboBox;
	}

	public JLabel getAreaLabel() {
		return areaLabel;
	}

	public void setAreaLabel(JLabel areaLabel) {
		this.areaLabel = areaLabel;
	}

	public JComboBox<String> getAreaComboBox() {
		return areaComboBox;
	}

	public void setAreaComboBox(JComboBox<String> areaComboBox) {
		this.areaComboBox = areaComboBox;
	}

	public JSpinner getNotasSpinner() {
		return notasSpinner;
	}

	public void setNotasSpinner(JSpinner notasSpinner) {
		this.notasSpinner = notasSpinner;
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

	public JLabel getLabelNota() {
		return labelNota;
	}

	public void setLabelNota(JLabel labelNota) {
		this.labelNota = labelNota;
	}

	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

}
