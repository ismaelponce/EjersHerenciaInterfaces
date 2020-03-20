package tiendaInformatica;

public class Raton extends Periferico {

	public Raton(String marca, String modelo, double precio, String color) {
		super(marca, modelo, precio);
		this.color = color;
	}

	private String color;
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public boolean equals(Raton rat) {
		if (rat.getColor().contentEquals(this.getColor()) 
				&& rat.getMarca().contentEquals(this.getMarca()) 
				&& rat.getModelo().contentEquals(this.getModelo()))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nColor: " + getColor();
	}
	
}
