package mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.modelo.Baja;
import mvc.vista.*;

public class ListenerSeguroBaja implements ActionListener {

	SeguroBaja v;
	BusquedaDarBaja vistaBaja;

	public ListenerSeguroBaja(SeguroBaja vista, BusquedaDarBaja vistaBaja) {
		v = vista;
		this.vistaBaja = vistaBaja;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		v.dispose();
		vistaBaja.dispose();

		VistaConfirmacionBaja ventana = new VistaConfirmacionBaja();
		ventana.hacerVisible();

		String seleccion = vistaBaja.getResultList().getSelectedValue();
		String texto = seleccion.substring(seleccion.length() - 8);
		String texto2 = seleccion.substring(0, seleccion.indexOf(" "));
		Baja acceso = new Baja();

		if (seleccion.contains(":")) {
			acceso.setMatricula(texto);
			acceso.borrarAlumno();
		} else {
			acceso.setNombreProyecto(texto2);
			acceso.borrarProyecto();
		}

	}

}
