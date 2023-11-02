/*
 * Programa que solicita un nº y un nº de columnas, de forma que imprima
 * desde el nº 1 hasta el solicitado en el nº de columnas pedido. 
 */

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[] args) {
	
	 int numero = 0;
	 int numeroColumna = 0;
	 Scanner sc = new Scanner(System.in);
	 do
	 {
		System.out.println("Escribe un nº: ");
		numero = sc.nextInt();
	 } while (numero < 1 || numero >=10000);
     do{
		System.out.println("Escribe un nº de columnas: ");    
		numeroColumna = sc.nextInt();
	 } while (numeroColumna > 22 || numeroColumna < 1);
	 

     System.out.println
     ("--------------------------------------------------------------");
     AuxiliarEjercicio6.DarListaNumeros(numero, numeroColumna);
     
	}
}

