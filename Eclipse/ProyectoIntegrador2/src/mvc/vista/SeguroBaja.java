package mvc.vista;

import javax.swing.*;

import mvc.controlador.ListenerSeguroBaja;
import mvc.controlador.ListenerVolverAlMenuSeguroBaja;

import java.awt.Font;

public class SeguroBaja extends JDialog {

	private JLabel mensaje;
	private JButton cancelButton;
	private JButton darDeBajaButton;
	BusquedaDarBaja vistaBaja;

	public SeguroBaja(BusquedaDarBaja vista) {
		vistaBaja = vista;
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(400, 200);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		mensaje = new JLabel("¿Seguro que quieres dar de baja?");
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensaje.setBounds(106, 47, 173, 25);

		cancelButton = new JButton();
		cancelButton.setText("Cancelar");
		ListenerVolverAlMenuSeguroBaja escuchador1 = new ListenerVolverAlMenuSeguroBaja(this);
		cancelButton.addActionListener(escuchador1);
		cancelButton.setBounds(71, 91, 100, 25);

		darDeBajaButton = new JButton();
		darDeBajaButton.setText("Dar de Baja");
		ListenerSeguroBaja escuchador2 = new ListenerSeguroBaja(this, vistaBaja); // Pasamos la referencia aquí
		darDeBajaButton.addActionListener(escuchador2);
		darDeBajaButton.setBounds(209, 91, 100, 25);

		// Agregar componentes a la ventana
		getContentPane().add(mensaje);
		getContentPane().add(cancelButton);
		getContentPane().add(darDeBajaButton);

	}

	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

}
