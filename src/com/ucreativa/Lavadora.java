/**
 * 
 */
package com.ucreativa;

/**
 * @author Raul Espinoza
 *
 */
public class Lavadora {
	
	private String marca;
	private String modelo;
	private String color;
	private String cicloSeleccionado;
	private boolean estadoCiclo;
	private int nivelAgua;
	private boolean estadoTapa; //true cerrada, false abierta
	
	
	/**
	 * 
	 */
	public Lavadora(String marca, String modelo, String color) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		cicloSeleccionado = "";
		estadoCiclo = false;
		nivelAgua = 0;
		estadoTapa = false;
	}

	public void iniciarCiclo(String ciclop) {
		if((ciclop.equals("Delicado") || ciclop.equals("Muy Sucio") || ciclop.equals("Regular")) && estadoTapa) {
			setCicloSeleccionado(ciclop);
			nivelAgua = 100;
			estadoCiclo = true;
			System.out.println("-La lavadora empieza a lavar.");
		}
	}
	
	public void terminarCiclo() {
		if(nivelAgua == 100 && estadoCiclo) {
			setCicloSeleccionado("");
			nivelAgua = 0;
			estadoCiclo = false;
			System.out.println("-La lavadora termina de lavar.");
		}
	}
	
	public void abrirTapa() {
		if(!estadoCiclo && estadoTapa) {
			estadoTapa = false;
			System.out.println("-Se abre la tapa.");
		}
	}
	
	public void cerrarTapa() {
		if(!estadoTapa) {
			estadoTapa = true;
			System.out.println("-Se cierra la tapa.");
		}
	}

	@Override
	public String toString() {
		String toString = "";
		toString = toString + "La lavadora " + getMarca() + " " + getModelo() + " de color " + getColor();
		if(estadoCiclo) {
			toString = toString + " esta lavando en el ciclo " + getCicloSeleccionado() + ".";
		}
		else {
			toString = toString + " no esta lavando.";
		}
		toString = toString + " La tapa esta " + getEstadoTapa();
		return toString;
	}
	
	public String getEstadoTapa() {
		if(estadoTapa) {
			return "Cerrada";
		}
		else {
			return "Abierta";
		}
	}

	public void setEstadoTapa(boolean estadoTapa) {
		this.estadoTapa = estadoTapa;
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

	public String getCicloSeleccionado() {
		return cicloSeleccionado;
	}

	public void setCicloSeleccionado(String cicloSeleccionado) {
		this.cicloSeleccionado = cicloSeleccionado;
	}

	public boolean isEstadoCiclo() {
		return estadoCiclo;
	}

	public void setEstadoCiclo(boolean estadoCiclo) {
		this.estadoCiclo = estadoCiclo;
	}

	public int getNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(int nivelAgua) {
		this.nivelAgua = nivelAgua;
	}
}