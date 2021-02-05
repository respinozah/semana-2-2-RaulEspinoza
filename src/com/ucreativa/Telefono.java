/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Telefono {

	private String marca;
	private String modelo;
	private String color;
	private String numero;
	private int estado; //1 encendido, 2 apagado, 3 en llamada, 4 sin senial
	private boolean senial;
	/**
	 * 
	 */
	public Telefono(String marca, String modelo, String color, String numero) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numero = numero;
		estado = 2;
		senial = true;
	}

	public void encender() {
		estado = 1;
		System.out.println("-Se enciende el telefono.");
	}
	
	public void apagar() {
		estado = 2;
		System.out.println("-Se apaga el telefono.");
	}
	
	public void hacerLlamada(String numTelefonop) {
		if(estado == 1 && senial) {
			estado = 3;
			System.out.println("-Se inicia una llamada al " + numTelefonop + ".");
		}
	}
	
	public void terminarLlamada() {
		if(estado == 3) {
			estado = 1;
			System.out.println("-Se termina la llamada.");
		}
	}
	
	@Override
	public String toString() {
		String toString = "";
		
		toString = toString + "El telefono " + getMarca() + " " + getModelo() + " de color " + getColor();
		if(estado == 1) {
			toString = toString + " esta encendido y esperando llamadas al " + getNumero() + ".";
		}
		else if(estado == 3){
			toString = toString + " esta encendido y en una llamada.";
		}
		else {
			toString = toString + " esta apagado.";
		}
		
		return toString;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public boolean isSenial() {
		return senial;
	}

	public void setSenial(boolean senial) {
		this.senial = senial;
	}
}