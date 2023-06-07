
public class Deportivo extends Carro {
	    private boolean turbo;

	    public Deportivo(String marca, String modelo, int anio, boolean turbo) {
	        super(marca, modelo, anio);
	        this.turbo = turbo;
	    }

	    public boolean isTurbo() {
			return turbo;
		}

		public void setTurbo(boolean turbo) {
			this.turbo = turbo;
		}

		public void acelerar() {
	        System.out.println("Acelerando el carro deportivo");
	    }
}
