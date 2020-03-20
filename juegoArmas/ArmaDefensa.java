package juegoArmas;

public abstract class ArmaDefensa implements ArmaInterfaz{

	private double porcentajeVida;
	
	public ArmaDefensa() {
		
	}
	
	public abstract Personaje activarProteccion(Personaje per);
	
	public Personaje equiparPersonaje(Personaje per) {
		per.setPuntosVida(per.getPuntosVida() * this.getPorcentajeVida());
		activarProteccion(per);
		return per;
	}

	public double getPorcentajeVida() {
		return porcentajeVida;
	}

	public void setPorcentajeVida(double porcentajeVida) {
		this.porcentajeVida = porcentajeVida;
	}
	
	
}
