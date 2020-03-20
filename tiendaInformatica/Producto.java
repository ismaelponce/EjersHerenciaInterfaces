package tiendaInformatica;

public abstract class Producto {

	private String marca;
	private String modelo;
	private double precio;
	private double descuentoMom;
	private double descuentoGen;
	
	Producto(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		descuentoGen = 1;
		descuentoMom = 0;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDescuentoMom() {
		return descuentoMom;
	}

	public void setDescuentoMom(double descuentoMom) {
		this.descuentoMom = descuentoMom;
	}

	public double getDescuentoGen() {
		return descuentoGen;
	}

	public void setDescuentoGen(double descuentoGen) {
		this.descuentoGen = descuentoGen;
	}
	
	
	public double devolverPrecio() {
		if (descuentoGen > 0 && descuentoMom > 0) {
			precio =  precio - (precio*(descuentoMom/100)) - (precio*(descuentoGen/100)); 
		} else if (descuentoGen > 0 && descuentoMom == 0) {
			precio =  precio - (precio*(descuentoGen/100));
		} else {
			precio =  precio - (precio*(descuentoMom/100));
		} 
		
		return getPrecio();
	}
	
	public boolean equals(Producto prod) {
		if (prod.getMarca().contentEquals(this.getMarca()) && prod.getModelo().contentEquals(this.getModelo()))
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Marca: " + getMarca()
		+ "\nModelo: " + getModelo()
		+ "\nPrecio de venta: " + getPrecio()
		+ "\nPrecio final: " + devolverPrecio();
	}
	
}
