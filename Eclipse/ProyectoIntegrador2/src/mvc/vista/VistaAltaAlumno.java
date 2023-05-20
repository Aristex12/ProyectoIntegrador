package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerAltaAlumno;
import mvc.controlador.ListenerAtrasAltaAlumno;

import java.awt.*;

public class VistaAltaAlumno extends JFrame {
    private JLabel labelNombre, labelApellido, labelNumero, labelId, labelError;
    private JTextField txtNombre, txtApellido, txtNumero, txtId;
    private JButton btnEnviar, atras;

    public VistaAltaAlumno() {
        super("Alta Alumno");
        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
    }
    
    public void inicializarComponentes(){
    	
    	setSize(440, 250);
        setLocationRelativeTo(null);

        // Creación de los componentes
        JLabel labelTitulo = new JLabel("Alta alumno");
        labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
        labelTitulo.setBounds(155, 21, 120, 20);

        labelNombre = new JLabel("Nombre:");
        labelNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelApellido = new JLabel("Apellido:");
        labelApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNumero = new JLabel("Número de matrícula:");
        labelNumero.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelNombre.setBounds(30, 61, 120, 20);
        labelApellido.setBounds(30, 91, 120, 20);
        labelNumero.setBounds(30, 121, 150, 20);

        txtNombre = new JTextField();
        txtApellido = new JTextField();
        txtNumero = new JTextField();
        txtNombre.setBounds(200, 62, 180, 20);
        txtApellido.setBounds(200, 92, 180, 20);
        txtNumero.setBounds(200, 122, 180, 20);
        
        labelId = new JLabel("ID Proyecto:");
        labelId.setFont(new Font("Tahoma", Font.BOLD, 11));
        labelId.setBounds(30, 152, 120, 20);
        
        txtId = new JTextField();
        txtId.setBounds(200, 152, 94, 20);
        
        labelError = new JLabel("");
        labelError.setForeground(new Color(255, 0, 0));
        labelError.setBounds(30, 181, 150, 20);

        btnEnviar = new JButton("Enviar");
        ListenerAltaAlumno escuchador2 = new ListenerAltaAlumno(this);
        btnEnviar.addActionListener(escuchador2);
        btnEnviar.setBounds(294, 181, 86, 30);
        
        atras = new JButton("Atrás");
        ListenerAtrasAltaAlumno escuchador1 = new ListenerAtrasAltaAlumno(this);
        atras.addActionListener(escuchador1);
        atras.setBounds(200, 181, 86, 30);

        // Configuración del layout
        getContentPane().setLayout(null);

        getContentPane().add(labelTitulo);
        getContentPane().add(labelNombre);
        getContentPane().add(labelApellido);
        getContentPane().add(labelNumero);
        getContentPane().add(txtNombre);
        getContentPane().add(txtApellido);
        getContentPane().add(txtNumero);
        getContentPane().add(btnEnviar);
        getContentPane().add(atras);
        getContentPane().add(labelId);
        getContentPane().add(txtId);
        getContentPane().add(labelError);
    }
    
    public JLabel getLabelError() {
		return labelError;
	}

	public void setLabelError(JLabel labelError) {
		this.labelError = labelError;
	}

	public JLabel getLabelNombre() {
		return labelNombre;
	}

	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	public JLabel getLabelApellido() {
		return labelApellido;
	}

	public void setLabelApellido(JLabel labelApellido) {
		this.labelApellido = labelApellido;
	}

	public JLabel getLabelNumero() {
		return labelNumero;
	}

	public void setLabelNumero(JLabel labelNumero) {
		this.labelNumero = labelNumero;
	}

	public JLabel getLabelId() {
		return labelId;
	}

	public void setLabelId(JLabel labelId) {
		this.labelId = labelId;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JTextField getTxtId() {
		return txtId;
	}

	public void setTxtId(JTextField txtId) {
		this.txtId = txtId;
	}

	public JButton getBtnEnviar() {
		return btnEnviar;
	}

	public void setBtnEnviar(JButton btnEnviar) {
		this.btnEnviar = btnEnviar;
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