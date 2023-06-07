package AreaRec;

import javax.swing.JOptionPane;

public class Area {
	public static void main (String [] args) {
	//se decaran las variables
		double ladoA=0, ladoB=0, areaRectangulo=0;
		
		//se les asigna el valor a las variables ladoA y ladoB 
		ladoA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de lado B"));
		//se le asigna el valor a areaRectangulo, que como valor contiene la multiplicacion de los lados a y b.
		areaRectangulo= ladoA * ladoB;
		System.out.println(areaRectangulo);
	}
}
