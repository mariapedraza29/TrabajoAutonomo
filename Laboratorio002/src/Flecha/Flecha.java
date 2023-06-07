package Flecha;

public class Flecha {
	//declarando las variables
	int longitud;
	String color;
	
	public Flecha() {
		//esta asignandole un valor a las variables
		longitud=18;
		color="negro";
	}
	
	public Flecha(int longitud, String color){
		this.longitud=longitud;
		this.color=color;
		
	}
	
	
	public void contruirFlecha() {
	//hace un ciclo que genera la cantidad de guiones que le esta asignando en la longitud
		for (int i=0; i<longitud;i++) {
			imprime("-");
			
		}
		//cuando termina el ciclo se imprime el simbolo de >
		imprime(">");
		
	}

	
	private void imprime(String simbolo) {
		//se hace la condicion de quye si el color es igual a negro se deja tal cual viene por defecto
		if(color.equals("negro")) {
			System.out.print(simbolo);
		}
		//si no se cumple la condicion anterior se genera un error que da a los guiones el color rojo
		else {
			System.err.print(simbolo);
		}
		
	}public void imprimirEspacio() {
		//imprime un espacio de linea entre las flechas
		System.out.println("");
	}
}
