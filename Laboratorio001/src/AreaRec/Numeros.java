package AreaRec;
import javax.swing.JOptionPane;

class Numeros {
	//declaramos las variables
	int numero;
	int i, neg=0,par=0;
	
	public void entrada() {
		//se hace un ciclo donde el iterador llega hasta 5
		for(i=0; i<5;i++) {
			//se hace un dialogo para que el usuario digite un numero
			numero=ingresarDatos("dijite 1 numero");
			//se hace una condicion donde se evalúa si el numero es par si es asi se guarda en el contador par
					if(numero %2==0) {
						par++;
					}
					//en esta condicional se evalua si el numero es menor a 0, si es asi es un numero negativo por lo cual se guarda en la variable neg
					if(numero<0) {
						neg++;
					}
		}
		//se muestra un ventada con el resultado de los numeros ingresados
		JOptionPane.showMessageDialog(null, "el numero de numeros pares es: " +par+
				"y el numero de nueros negativos es: " + neg);
	} 
	//este metodo realiza la transformacion de enteros a cadenaw
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena=JOptionPane.showInputDialog(null, mensaje);
		valor=Integer.parseInt(cadena);
		return valor;
	}
}
