package tiendaInformatica;

public class MemoriaRAM extends Producto{

	MemoriaRAM(String marca, String modelo, double precio, int capacidad) {
		super(marca, modelo, precio);
		this.capacidad = capacidad;
	}

	private int capacidad;
	
	
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public boolean equals(MemoriaRAM mem) {
		if (mem.getCapacidad() == this.getCapacidad()
				&& mem.getMarca().contentEquals(this.getMarca()) 
				&& mem.getModelo().contentEquals(this.getModelo()))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nCapacidad: " + getCapacidad();
	}
	
}
