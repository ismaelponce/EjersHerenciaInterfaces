package tiendaInformatica;

public class Teclado extends Periferico {

		public Teclado(String marca, String modelo, double precio, int numTeclas) {
			super(marca, modelo, precio);
			this.numTeclas = numTeclas;
		}

		private int numTeclas;

		public void setNumTeclas(int numTeclas) {
			this.numTeclas = numTeclas;
		}
		
		public int getNumTeclas() {
			return numTeclas;
		}
		
		public boolean equals(Teclado tec) {
			if (tec.getNumTeclas() == this.numTeclas 
					&& tec.getMarca().contentEquals(this.getMarca()) 
					&& tec.getModelo().contentEquals(this.getModelo()))
				return true;
			return false;
		}
		
		@Override
		public String toString() {
			return super.toString()
					+ "\nNumero de teclas: " + getNumTeclas();
		}
	
}
