package mvc.vista;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConfirmacionModificacion extends JFrame{

	private JLabel mensaje;
    private JButton volverButton;

    public ConfirmacionModificacion() {
        super("Confirmación");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();
    }

    private void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(381, 120);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        // Creación y configuración de los componentes
        mensaje = new JLabel("¡Se han modificado los datos exitosamente!");
        mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
        mensaje.setHorizontalAlignment(SwingConstants.CENTER);
        mensaje.setBounds(50, 10, 251, 25);

        volverButton = new JButton();
        volverButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        volverButton.setText("Volver al Menú");
        volverButton.setBounds(112, 46, 130, 25);

        // Agregar componentes a la ventana
        getContentPane().add(mensaje);
        getContentPane().add(volverButton);

    }

    private void hacerVisible() {
        // Hacer visible la ventana
        setVisible(true);
    }
	
}
