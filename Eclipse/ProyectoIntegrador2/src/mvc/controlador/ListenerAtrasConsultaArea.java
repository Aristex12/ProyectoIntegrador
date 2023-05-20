package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.vista.ConsultaArea;
import mvc.vista.VistaConsulta;

public class ListenerAtrasConsultaArea implements ActionListener {

	ConsultaArea v;
	
	public ListenerAtrasConsultaArea(ConsultaArea vista) {
		v = vista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		v.dispose();
		VistaConsulta ventana = new VistaConsulta();
		ventana.hacerVisible();

	}

}
