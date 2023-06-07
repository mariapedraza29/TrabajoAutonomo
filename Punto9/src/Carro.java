
public class Carro {
	    private String marca;
	    private String modelo;
	    private int anio;

	    public Carro(String marca, String modelo, int anio) {
	        this.marca = marca;
	        this.modelo = modelo;
	        this.anio = anio;
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

		public int getAnio() {
			return anio;
		}

		public void setAnio(int anio) {
			this.anio = anio;
		}

		public void conducir() {
	        System.out.println("Conduciendo el carro");
	    }

	    public void detener() {
	        System.out.println("Deteniendo el carro");
	    }
}
