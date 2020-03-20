package juegoArmas;

public class Escudo extends ArmaDefensa {

	public Escudo() {
		setPorcentajeVida(1.1);
		
	}
	
	@Override
	public Personaje activarProteccion(Personaje per) {
		per.setProteccionArquero(true);
		return per;
	}

	
	
}
