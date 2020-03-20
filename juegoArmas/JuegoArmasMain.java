package juegoArmas;

public class JuegoArmasMain {

	/**
	 * 
	 * @author Ismael Ponce
	 */

	public static void main(String[] args) {

		Personaje ragnar = new Personaje();
		Personaje thor = new Personaje();

		Espada esp = new Espada();
		Arco arc = new Arco();

		System.out.println(ragnar);
		System.out.println();
		System.out.println(thor);

		// Equipamos armas de ataque

		ragnar.aniadirArmaAtaque(esp);
		ragnar.equipar();
		thor.aniadirArmaAtaque(arc);
		thor.equipar();

		System.out.println();
		System.out.println(ragnar);
		System.out.println();
		System.out.println(thor);

		
		
		// Equipamos armas de ataque

		Escudo esc = new Escudo();
		Armadura arm = new Armadura();
		
		ragnar.aniadirArmaDefensa(esc);
		ragnar.equipar();
		thor.aniadirArmaDefensa(arm);;
		thor.equipar();

		System.out.println();
		System.out.println(ragnar);
		System.out.println();
		System.out.println(thor);

	}

}
