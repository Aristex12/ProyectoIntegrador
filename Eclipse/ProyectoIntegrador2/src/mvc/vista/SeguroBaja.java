package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class SeguroBaja extends JDialog {

	private JLabel mensaje;
	private JButton cancelButton;
	private JButton darDeBajaButton;

	public SeguroBaja() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		// Inicializar los componentes
		inicializarComponentes();
		// Hacer visible la ventana
		hacerVisible();
	}

	private void inicializarComponentes() {
		// Configuración de la ventana
		setSize(400, 200);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		// Creación y configuración de los componentes
		mensaje = new JLabel("¿Seguro que quieres salir?");
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 12));
		mensaje.setBounds(106, 47, 173, 25);

		cancelButton = new JButton();
		cancelButton.setText("Cancelar");
		cancelButton.setBounds(71, 91, 100, 25);

		darDeBajaButton = new JButton();
		darDeBajaButton.setText("Dar de Baja");
		darDeBajaButton.setBounds(209, 91, 100, 25);

		// Agregar componentes a la ventana
		getContentPane().add(mensaje);
		getContentPane().add(cancelButton);
		getContentPane().add(darDeBajaButton);

	}

	private void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}

}
