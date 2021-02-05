/**
 * 
 */
package com.ucreativa;

/**
 * @author espiraul
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//IMPRESORA
		System.out.println("---Impresora");

		Impresora impresora = new Impresora("Epson", "EcoTank", "Negra", 100);
		System.out.println(impresora.toString());
		
		//encender impresora
		impresora.encender();
		System.out.println(impresora.toString());
		
		//colocar papel
		impresora.colocarPapel(5);
		System.out.println(impresora.toString());
		
		//cargar tintas
		impresora.cargarTintaNegra(100);
		impresora.cargarTintaColores(100);
		System.out.println(impresora.toString());
		
		//imprimir a colores
		impresora.imprimirDocumento(20, true);
		
		//imprimir a bn
		impresora.imprimirDocumento(20, false);
		System.out.println(impresora.toString());
		
		//apagar
		impresora.apagar();
		System.out.println(impresora.toString());
		
		//TELEFONO
		System.out.println("---Telefono");
		Telefono miTelefono = new Telefono("Orange","oPhone 3","Naranja", "555-5555");
		System.out.println(miTelefono.toString());
		
		//Encender telefono
		miTelefono.encender();
		System.out.println(miTelefono.toString());
		
		//Hacer llamada
		miTelefono.hacerLlamada("323-3433");
		System.out.println(miTelefono.toString());
		
		//Terminar llamada
		miTelefono.terminarLlamada();
		System.out.println(miTelefono.toString());
		
		//Apagar telefono
		miTelefono.apagar();
		System.out.println(miTelefono.toString());
		
		//TELEVISOR
		System.out.println("---Televisor");
		Televisor miTV = new Televisor("Sony", "Bravia", "Negro", 55.0);
		System.out.println(miTV.toString());
		
		//Encender TV
		miTV.encender();
		System.out.println(miTV.toString());
		
		//Cambiar a cable
		miTV.cambiarInput(3);
		System.out.println(miTV.toString());
		
		//Subir el volumen en 3 niveles
		miTV.subirVolumen();
		miTV.subirVolumen();
		miTV.subirVolumen();
		System.out.println(miTV.toString());
		
		//Bajar el volumen en 1 nivel
		miTV.bajarVolumen();
		System.out.println(miTV.toString());
		
		//Poner canal 8000
		miTV.cambiarCanal(8000);
		System.out.println(miTV.toString());
		
		//Poner el canal 20
		miTV.cambiarCanal(20);
		System.out.println(miTV.toString());
		
		//Poner mute
		miTV.mute();
		System.out.println(miTV.toString());
		
		//LAVADORA
		System.out.println("---Lavadora");
		Lavadora miLavadora = new Lavadora("Lavamatik", "X88", "Blanca");
		System.out.println(miLavadora.toString());
		//cerrar tapa
		miLavadora.cerrarTapa();
		System.out.println(miLavadora.toString());
		//iniciar ciclo
		miLavadora.iniciarCiclo("Delicado");
		System.out.println(miLavadora.toString());
		//intentar abrir tapa
		miLavadora.abrirTapa();
		System.out.println(miLavadora.toString());
		//terminar ciclo
		miLavadora.terminarCiclo();
		System.out.println(miLavadora.toString());
		//abrir tapa
		miLavadora.abrirTapa();
		System.out.println(miLavadora.toString());
	}
}