package mvc.vista;

import javax.swing.*;
import java.awt.Font;

public class SeguroBaja extends JFrame {
	
	private JLabel mensaje;
    private JButton cancelButton;
    private JButton darDeBajaButton;

    public SeguroBaja() {
        super("Confirmación");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Inicializar los componentes
        inicializarComponentes();

    }

    private void inicializarComponentes() {
    	// Configuración de la ventana
        setSize(300, 120);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);
        
        // Creación y configuración de los componentes
        mensaje = new JLabel("¿Seguro que quieres salir?");
        mensaje.setFont(new Font("Tahoma", Font.BOLD, 11));
        mensaje.setBounds(71, 11, 154, 25);

        cancelButton = new JButton();
        cancelButton.setText("Cancelar");
        cancelButton.setBounds(40, 50, 100, 25);

        darDeBajaButton = new JButton();
        darDeBajaButton.setText("Dar de Baja");
        darDeBajaButton.setBounds(160, 50, 100, 25);

        // Agregar componentes a la ventana
        getContentPane().add(mensaje);
        getContentPane().add(cancelButton);
        getContentPane().add(darDeBajaButton);

        // Acción del botón cancelar
        cancelButton.addActionListener(e -> dispose());

        // Acción del botón dar de baja
        darDeBajaButton.addActionListener(e -> {
            // Código para dar de baja al alumno
            dispose();
        });
    }

    private void hacerVisible() {
        // Hacer visible la ventana
        setVisible(true);
    }
	
}
