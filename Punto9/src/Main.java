
public class Main {
	 public static void main(String[] args) {
	        Carro carro = new Carro("Toyota", "Corolla", 2020);
	        carro.conducir();
	        carro.detener();

	        Deportivo Deportivo = new Deportivo("Ferrari", "458 Italia", 2022, true);
	        Deportivo.conducir();
	        Deportivo.detener();
	        Deportivo.acelerar();

	        System.out.println(Deportivo.getMarca());
	        System.out.println(Deportivo.getModelo());
	        System.out.println(Deportivo.getAnio());
	        System.out.println(Deportivo.isTurbo());

	 }
}
