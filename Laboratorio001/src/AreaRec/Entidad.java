package AreaRec;

import javax.swing.JOptionPane;

public class Entidad {
	//se declaran las variables
	private double ladoA, ladoB;
	
	
	//se hace un metodo llamado ingresarDatos, les asigna el valor a las variables ladoA y ladoB
	public void ingresarDatos() {
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B"));
	}
	
	//Se hace un metodo para calcular el area del triangulo
	public void calcularArea() {
		//se declara la variable resultado
		double resultado;
		//se le agrega un valor a resultado que seria la multiplicacion de lado B y B
		resultado = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: "+ resultado);
		
	}
	
}
