package juegoArmas;

public class Espada extends ArmaAtaque{

	public Espada() {
		super.setPorcentajeAtaque(1.4);
	}

	@Override
	public Personaje activarAtaque(Personaje per) {
		per.setAtaqueCuerpoACuerpo(true);
		return per;
	}
	
}
