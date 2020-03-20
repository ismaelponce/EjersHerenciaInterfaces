package juegoArmas;

import java.util.ArrayList;

public class Personaje {

	private double puntosVida;
	private double puntosAtaque;
	
	private boolean proteccionArquero;
	private boolean proteccionCuerpoACuerpo;
	private boolean ataqueArquero;
	private boolean ataqueCuerpoACuerpo;
	
	private ArrayList<ArmaInterfaz> armas;
	
	public Personaje() {
		armas = new ArrayList<ArmaInterfaz>();
		this.puntosVida = 100;
		this.puntosAtaque = 10;
		
	}
	
	public void equipar() {
		for (ArmaInterfaz arma : armas) {
			arma.equiparPersonaje(this);
		}
	}
	
	public double getPuntosVida() {
		return puntosVida;
	}

	public void setPuntosVida(double puntosVida) {
		this.puntosVida = puntosVida;
	}

	public double getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(double puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	public boolean isProteccionArquero() {
		return proteccionArquero;
	}

	public void setProteccionArquero(boolean proteccionArquero) {
		this.proteccionArquero = proteccionArquero;
	}

	public boolean isProteccionCuerpoACuerpo() {
		return proteccionCuerpoACuerpo;
	}

	public void setProteccionCuerpoACuerpo(boolean proteccionCuerpoACuerpo) {
		this.proteccionCuerpoACuerpo = proteccionCuerpoACuerpo;
	}

	public boolean isAtaqueArquero() {
		return ataqueArquero;
	}

	public void setAtaqueArquero(boolean ataqueArquero) {
		this.ataqueArquero = ataqueArquero;
	}

	public boolean isAtaqueCuerpoACuerpo() {
		return ataqueCuerpoACuerpo;
	}

	public void setAtaqueCuerpoACuerpo(boolean ataqueCuerpoACuerpo) {
		this.ataqueCuerpoACuerpo = ataqueCuerpoACuerpo;
	}

	public void aniadirArmaAtaque(ArmaAtaque arma) {
		this.armas.add(arma);
	}
	
	public void aniadirArmaDefensa(ArmaDefensa arma) {
		this.armas.add(arma);
	}
	//La lista de armas funciona como una cola. La primera que entra es la primera en salir.
	public void quitarArma() {
		if (!armas.isEmpty()) this.armas.remove(0);
	}

	
	@Override
	public String toString() {
		return "Puntos de vida: " + this.puntosVida
				+ "\nPuntos de ataque: " + this.puntosAtaque
				+ "\nAtaque arquero: " + this.ataqueArquero
				+ "\nAtaque cuerpo a cuerpo: " + this.ataqueCuerpoACuerpo
				+ "\nProteccion arquero: " + this.proteccionArquero
				+ "\nProteccion cuerpo a cuerpo: " + this.proteccionCuerpoACuerpo;
	}
	
}
