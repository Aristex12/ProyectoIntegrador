package main;

import mvc.vista.VistaMenuPrincipal;

public class Main {

	public static void main( String[] args )
    {	
    	java.awt.EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				//Creamos un objeto de la clase InterfazGrafica
				
				VistaMenuPrincipal ventana = new VistaMenuPrincipal();
				
				//Hacemos la ventana visible
				
				ventana.hacerVisible();
				
			}
			
		});
  
    }
	
}
