package tiendaInformatica;

import java.util.Scanner;

public class TiendaMain {

	/**
	 * 
	 * @auth Ismael Ponce
	 */

	public static void main(String[] args) {

		// Herramientas
		Scanner sc = new Scanner(System.in);

		// Variables
		boolean salir = false;
		int op = 0;
		String mensajeError = "Introduzca un valor valido, por favor.";
		String marca = "";
		String modelo = "";
		double precio = 0;

		Teclado teclados[] = new Teclado [2];
		Raton ratones[] = new Raton[2];
		MemoriaRAM memorias[] = new MemoriaRAM[2];
		
		int contTeclados = 0;
		int contRatones = 0;
		int contMemorias = 0;
		
		while (!salir) {

			System.out.println("¿Que desea hacer?");
			System.out.println("1. Introducir un nuevo producto.");
			System.out.println("2. Mostrar todos los productos actualmente creados.");
			System.out.println("3. Comprobar si los teclados son iguales.");
			System.out.println("4. Salir.");

			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("¿Que tipo de producto desea introducir?");
				System.out.println("1. Teclado.");
				System.out.println("2. Raton.");
				System.out.println("3. Memoria RAM.");
				
				op = sc.nextInt();
				
				switch (op) {
				case 1:
					
					if(contTeclados < 2) {
						System.out.println("Introduzca una marca: ");
						marca = sc.next();
						
						System.out.println("Introduzca un modelo: ");
						modelo = sc.next();
						
						System.out.println("Introduzca un precio: ");
						precio = sc.nextDouble();
						
						System.out.println("Introduzca el numero de teclas: ");
						int numTeclas = sc.nextInt();
						
						Teclado tec = new Teclado(marca, modelo, precio, numTeclas);
						teclados[contTeclados] = tec;
						contTeclados++;
					} else {
						System.out.println("Ya se han creado 2 teclados, no caben mas.");
					}
					
					
					break;

				case 2:
					
					if(contRatones < 2) {
						System.out.println("Introduzca una marca: ");
						marca = sc.next();
						
						System.out.println("Introduzca un modelo: ");
						modelo = sc.next();
						
						System.out.println("Introduzca un precio: ");
						precio = sc.nextDouble();
						
						System.out.println("Introduzca el color: ");
						String color = sc.next();
						
						Raton rat = new Raton(marca, modelo, precio, color);
						ratones[contRatones] = rat;
						contRatones++;
					} else {
						System.out.println("Ya se han creado 2 ratones, no caben mas.");
					}
					
					break;
					
				case 3:

					if(contMemorias < 2) {
						System.out.println("Introduzca una marca: ");
						marca = sc.next();
						
						System.out.println("Introduzca un modelo: ");
						modelo = sc.next();
						
						System.out.println("Introduzca un precio: ");
						precio = sc.nextDouble();
						
						System.out.println("Introduzca la capacidad: ");
						int capacidad = sc.nextInt();
						
						MemoriaRAM mem = new MemoriaRAM(marca, modelo, precio, capacidad);
						memorias[contMemorias] = mem;
						contMemorias++;
					} else {
						System.out.println("Ya se han creado 2 memorias RAM, no caben mas.");
					}
					
					break;
					
				default:
					System.out.println(mensajeError);
					break;
				}
				
				break;
			case 2:
				
				if(contMemorias == 0 && contRatones == 0 && contTeclados == 0) {
					System.out.println("Aun no ha introducido ningun producto.");
				} else {
				
					if(contRatones > 0)
					for (Raton raton : ratones) {
						if (raton != null) System.out.println(raton + "\n");
					}
					System.out.println();
					
					if(contTeclados > 0)
					for (Teclado teclado : teclados) {
						if (teclado != null) System.out.println(teclado + "\n");
					}
					System.out.println();
					
					if(contMemorias > 0)
					for (MemoriaRAM memoriaRAM : memorias) {
						if (memoriaRAM != null) System.out.println(memoriaRAM + "\n");
					}
				
				}
				break;
			case 3:
				if(contTeclados == 2) System.out.println(teclados[0].equals(teclados[1]));
				else System.out.println("No hay suficientes teclados creados.");
				break;
				
			case 4:
				System.out.println("FIN DE PROGRAMA");
				salir = true;
				break;

			default:
				System.out.println(mensajeError);
				break;
			}

		}

		sc.close();

	}
	
}
