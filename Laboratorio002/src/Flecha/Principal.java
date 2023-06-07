package Flecha;

public class Principal {
	//se declaran las variables
	Flecha flecha1,flecha2,flecha3, flecha4;
	
	public static void main(String[ ]args) {
		//se invoca la otra clase
		Principal miPrincipal=new Principal();
	}
	//este metodo genera  objetos
	public Principal (){
		
		//se hace la primera flecha con los metodos y se crean con los valores por defecto que tiene la clase Flecha
		flecha1 = new Flecha();
		flecha1.contruirFlecha();
		flecha1.imprimirEspacio();
		
		//esta creando una nueva flecha llamada flecha2
		flecha2 = new Flecha();
		//le esta asignando una longitud y color a la nueva flecha
		flecha2.longitud=34;
		flecha2.color="rojo";
		//esta invocando los metodos
		flecha2.contruirFlecha();
		flecha2.imprimirEspacio();
		
		//esta haciendo un nuevo objeto llamado flecha3 que por parametro le eesta asignando nuevos valores
		flecha3 = new Flecha(12,"negro");
		flecha3.contruirFlecha();
		flecha3.imprimirEspacio();
		
		flecha4 = new Flecha(19,"negro");
		flecha4.contruirFlecha();
		
	}

}

