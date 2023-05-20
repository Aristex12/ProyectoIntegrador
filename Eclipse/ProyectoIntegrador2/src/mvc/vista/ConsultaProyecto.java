package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerVolverAlMenuProyecto;

import java.awt.Font;

public class ConsultaProyecto extends JFrame{

	private JLabel titulo;
    private JLabel nombre;
    private JLabel nombreLabel;
    private JLabel curso;
    private JLabel cursoLabel;
    private JLabel area;
    private JLabel areaLabel;
    private JLabel nota;
    private JLabel notaLabel;
    private JLabel github;
    private JLabel githubLabel;
    private JLabel integrantes;
    private JLabel integrantesLabel;
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
    	
    	setSize(440, 306);
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
        nombreLabel.setText("");
        nombreLabel.setBounds(106, 53, 200, 25);

        curso = new JLabel();
        curso.setFont(new Font("Tahoma", Font.BOLD, 11));
        curso.setText("Curso:");
        curso.setBounds(28, 80, 51, 25);

        cursoLabel = new JLabel();
        cursoLabel.setText("");
        cursoLabel.setBounds(106, 80, 200, 25);

        area = new JLabel();
        area.setFont(new Font("Tahoma", Font.BOLD, 11));
        area.setText("Área:");
        area.setBounds(28, 112, 51, 25);

        areaLabel = new JLabel();
        areaLabel.setText("");
        areaLabel.setBounds(106, 112, 200, 25);
        
        nota = new JLabel("Nota:");
        nota.setFont(new Font("Tahoma", Font.BOLD, 11));
        nota.setBounds(28, 143, 51, 25);
        
        notaLabel = new JLabel("");
        notaLabel.setBounds(106, 143, 51, 25);
        
        github = new JLabel("GitHub:");
        github.setFont(new Font("Tahoma", Font.BOLD, 11));
        github.setBounds(28, 173, 51, 25);
        
        githubLabel = new JLabel("");
        githubLabel.setBounds(106, 173, 200, 25);
        
        integrantes = new JLabel("Integrantes:");
        integrantes.setFont(new Font("Tahoma", Font.BOLD, 11));
        integrantes.setBounds(28, 200, 99, 25);
        
        integrantesLabel = new JLabel("");
        integrantesLabel.setBounds(106, 200, 200, 25);

        volverButton = new JButton();
        volverButton.setText("Volver al Menú");
        ListenerVolverAlMenuProyecto escuchador1 = new ListenerVolverAlMenuProyecto(this);
        volverButton.addActionListener(escuchador1);
        volverButton.setBounds(276, 234, 140, 25);

        // Agregar componentes a la ventana
        getContentPane().add(titulo);
        getContentPane().add(nombre);
        getContentPane().add(nombreLabel);
        getContentPane().add(curso);
        getContentPane().add(cursoLabel);
        getContentPane().add(area);
        getContentPane().add(areaLabel);
        getContentPane().add(volverButton);
        getContentPane().add(nota);
        getContentPane().add(notaLabel);
        getContentPane().add(github);
        getContentPane().add(githubLabel);
        getContentPane().add(integrantes);
        getContentPane().add(integrantesLabel);
    }

    public JLabel getGithub() {
		return github;
	}

	public void setGithub(JLabel github) {
		this.github = github;
	}

	public JLabel getGithubLabel() {
		return githubLabel;
	}

	public void setGithubLabel(JLabel githubLabel) {
		this.githubLabel = githubLabel;
	}

	public JLabel getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(JLabel integrantes) {
		this.integrantes = integrantes;
	}

	public JLabel getIntegrantesLabel() {
		return integrantesLabel;
	}

	public void setIntegrantesLabel(JLabel integrantesLabel) {
		this.integrantesLabel = integrantesLabel;
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

	public JLabel getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(JLabel nombreLabel) {
		this.nombreLabel = nombreLabel;
	}

	public JLabel getCurso() {
		return curso;
	}

	public void setCurso(JLabel curso) {
		this.curso = curso;
	}

	public JLabel getCursoLabel() {
		return cursoLabel;
	}

	public void setCursoLabel(JLabel cursoLabel) {
		this.cursoLabel = cursoLabel;
	}

	public JLabel getArea() {
		return area;
	}

	public void setArea(JLabel area) {
		this.area = area;
	}

	public JLabel getAreaLabel() {
		return areaLabel;
	}

	public void setAreaLabel(JLabel areaLabel) {
		this.areaLabel = areaLabel;
	}

	public JLabel getNota() {
		return nota;
	}

	public void setNota(JLabel nota) {
		this.nota = nota;
	}

	public JLabel getNotaLabel() {
		return notaLabel;
	}

	public void setNotaLabel(JLabel notaLabel) {
		this.notaLabel = notaLabel;
	}

	public JButton getVolverButton() {
		return volverButton;
	}

	public void setVolverButton(JButton volverButton) {
		this.volverButton = volverButton;
	}

	public void hacerVisible() {
        setVisible(true);
    }

	public JLabel getIdProyecto() {
		return github;
	}

	public void setIdProyecto(JLabel idProyecto) {
		this.github = idProyecto;
	}

	public JLabel getIdProyectoLabel() {
		return githubLabel;
	}

	public void setIdProyectoLabel(JLabel idProyectoLabel) {
		this.githubLabel = idProyectoLabel;
	}
	
}
