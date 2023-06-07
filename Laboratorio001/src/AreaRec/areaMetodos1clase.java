package AreaRec;

import javax.swing.JOptionPane;

public class areaMetodos1clase {
 public static void main (String []args) {
	 //En este punto se declaran las variables ladoA y ladoB
	 double ladoA, ladoB;
	 //Se les asigna un valor a las variables ladoA y ladoB
	 ladoA= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A: "));
	 ladoB= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B: "));
	 //se invoca el metodo calcularArea que recibe dos parametros, para hacer el calculo del area del rectangulo.
	 calcularArea (ladoA, ladoB);
 }
//este metodo calcula el area del rectangulo que como parametro tiene a y b.
 public static void calcularArea(double a, double b) {
	 //se declara la variable resultaado
	 double resultado;
	 //se le asigna el valor a la variable resultado multiplicando los lados a y b
	 resultado = a*b;
	 JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
 }

}
