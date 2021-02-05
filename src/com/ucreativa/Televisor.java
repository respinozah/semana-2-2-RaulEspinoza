package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Televisor {

	private String marca;
	private String modelo;
	private String color;
	private double pulgadas;
	private int input; //1: HDMI-1, 2: HDMI2, 3: Cable.
	private boolean estado; //encendido o apagado.
	private int volumen; 
	private int canal;
	
	/**
	 * 
	 */
	public Televisor(String marca, String modelo, String color, double pulgadas) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.pulgadas = pulgadas;
		input = 1;
		estado = false;
		volumen = 20;
		canal = 2;
	}
	
	public void encender() {
		if(!estado) {
			estado = true;
			System.out.println("-Se enciende el televisor.");
		}
	}
	
	public void apagar() {
		if(estado) {
			estado = false;
			System.out.println("-Se apaga el televisor.");
		}
	}
	
	public void cambiarInput(int inputp) {
		if(inputp == 1 || inputp == 2 || inputp == 3) {
			input = inputp;	
			System.out.println("El televisor ahora recibe de " + getInput() + ".");
		}
	}

	public void subirVolumen() {
		if(volumen >= 0 && volumen < 100) {
			volumen++;
			System.out.println("-Se ajusta el volumen a " + volumen + ".");
		}
	}
	
	public void bajarVolumen() {
		if(volumen > 0 && volumen <= 100) {
			volumen--;
			System.out.println("-Se ajusta el volumen a " + volumen + ".");
		}
	}
	
	public void mute() {
		volumen = 0;
	}
	
	public void cambiarCanal(int canalp) {
		if(input == 3 && canalp > 0 && canalp < 99) {
			canal = canalp;
			System.out.println("-Se cambia al canal " + canalp + ".");
		}
	}
	
	@Override
	public String toString() {
		String toString = "";
		toString = "El TV " + getMarca() + " " + getModelo() + " color " + getColor() + " de " + getPulgadas() + " pulgadas";
		if(estado) {
			toString = toString + " esta encendido en " + getInput() + " y con el volumen en " + getVolumen() + ".";
			if(input == 3) {
				toString = toString + " El canal seleccionado es " + getCanal() + ".";
			}
		}else {
			toString = toString + " esta apagado.";
		}
		return toString;
	}
	

	public void setInput(int input) {
		this.input = input;
	}
	
	public String getInput() {
		String input = "";
		
		switch (this.input) {
		case 1:
			input = "HDMI-1";
			break;
		case 2:
			input = "HDMI-2";
			break;
		case 3:
			input = "Cable";
			break;
		}
		return input;
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

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
}