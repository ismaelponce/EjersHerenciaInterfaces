package juegoArmas;

public class Armadura extends ArmaDefensa{

	public Armadura() {
		setPorcentajeVida(1.5);
	}
	
	@Override
	public Personaje activarProteccion(Personaje per) {
		per.setProteccionCuerpoACuerpo(true);
		return per;
	}

}
