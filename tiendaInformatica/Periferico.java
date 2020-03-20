package tiendaInformatica;

public abstract class Periferico extends Producto{

	
	public Periferico(String marca, String modelo, double precio) {
		super(marca, modelo, precio);
		super.setDescuentoMom(2);
		
	}

	
	
}
