package juegoArmas;

public abstract class ArmaAtaque implements ArmaInterfaz{

	private double porcentajeAtaque;
	
	public ArmaAtaque() {
		
	}
	
	public abstract Personaje activarAtaque(Personaje per);
	
	public Personaje equiparPersonaje(Personaje per) {
		per.setPuntosAtaque(per.getPuntosAtaque() * this.getPorcentajeAtaque());
		activarAtaque(per);
		return per;
	}
	
	public double getPorcentajeAtaque() {
		return porcentajeAtaque;
	}

	public void setPorcentajeAtaque(double porcentajeAtaque) {
		this.porcentajeAtaque = porcentajeAtaque;
	}
	
	
	
}
