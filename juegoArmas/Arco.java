package juegoArmas;

public class Arco extends ArmaAtaque {

	public Arco() {
		super.setPorcentajeAtaque(1.15);
	}

	@Override
	public Personaje activarAtaque(Personaje per) {
		per.setAtaqueArquero(true);
		return per;
	}
	
}
