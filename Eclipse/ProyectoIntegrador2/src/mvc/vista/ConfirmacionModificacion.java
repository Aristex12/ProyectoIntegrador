package mvc.vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConfirmacionModificacion extends JDialog {

	private JLabel mensaje;
	private JButton volverButton;

	public ConfirmacionModificacion() {
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
		mensaje = new JLabel("¡Se han modificado los datos exitosamente!");
		mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
		mensaje.setHorizontalAlignment(SwingConstants.CENTER);
		mensaje.setBounds(61, 38, 251, 25);

		volverButton = new JButton();
		
		volverButton.setText("Volver al Menú");
		volverButton.setBounds(119, 85, 130, 25);

		// Agregar componentes a la ventana
		getContentPane().add(mensaje);
		getContentPane().add(volverButton);
	}

	public void hacerVisible() {
		// Hacer visible la ventana
		setVisible(true);
	}
}
