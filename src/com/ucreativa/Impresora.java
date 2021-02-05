/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Impresora {

	private String marca;
	private String modelo;
	private String color;
	private int papel;
	private int tintaNegra;
	private int tintaColores;
	private boolean encendida;
	
	/**
	 * 
	 */
	public Impresora(String marca, String modelo, String color, int papel) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.papel = papel;
		tintaNegra = 100;
		tintaColores = 100;
		encendida = false;
	}
	
	public void encender() {
		if(!encendida) {
			encendida = true;
			System.out.println("Riudo de encendido: \"whirrrrrrrrr click clickety click kachuuuun cha whooooor tik\" y la lucesita esta verde fija");
		}
	}
	
	public void apagar() {
		if(encendida) {
			encendida = false;
			System.out.println("La lucesita se apago.");
		}
	}
	
	public void colocarPapel(int papel) {
		this.papel = this.papel + papel;
		System.out.println("Se cargaron " + papel + " paginas.");
	}
	
	public void cargarTintaNegra(int tintaNegra) {
		if(tintaNegra > 0) {
			this.tintaNegra = this.tintaNegra + tintaNegra;
			System.out.println("Se cargo " + tintaNegra + " de tinta negra.");
		}
	}
	
	public void cargarTintaColores(int tintaColores) {
		if(tintaColores > 0) {
			this.tintaColores = this.tintaColores + tintaColores;
			System.out.println("Se cargo " + tintaColores + " de tinta negra.");
		}
	}
	
	public void imprimirDocumento(int cantPaginas, boolean color) {
		if(encendida && papel > cantPaginas && tintaNegra > 0 && tintaColores > 0) {
			System.out.println("Lucesita Verde parpadeando e imprimiendo " + cantPaginas + " paginas...");
			if(color) {
				tintaColores = tintaColores - cantPaginas;
			}
			tintaNegra = tintaNegra - cantPaginas;
			papel = papel + cantPaginas;
		}
	}
	
	@Override
	public String toString() {
		String toString = "La impresora " + marca + " " + modelo + " color " + color;
		if(encendida) {
			toString = toString + " esta encendida. Tiene " + papel + " paginas para imprimir, " + tintaNegra + " de tinta negra y " + tintaColores + " de tinta de colores";
		}else {
			toString = toString + " esta apagada.";
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

	public int getPapel() {
		return papel;
	}

	public void setPapel(int papel) {
		this.papel = papel;
	}

	public int getTintaNegra() {
		return tintaNegra;
	}

	public void setTintaNegra(int tintaNegra) {
		this.tintaNegra = tintaNegra;
	}

	public int getTintaColores() {
		return tintaColores;
	}

	public void setTintaColores(int tintaColores) {
		this.tintaColores = tintaColores;
	}

	public boolean isEncendida() {
		return encendida;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}
}