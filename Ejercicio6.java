/*
 * Programa que solicita un nº y un nº de columnas, de forma que imprima
 * desde el nº 1 hasta el solicitado en el nº de columnas pedido. 
 */

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Escribe un nº: ");
     int numero = sc.nextInt();
 	 System.out.println("Escribe un nº de columnas: ");    
     int numeroColumna = sc.nextInt();
     AuxiliarEjercicio6.DarListaNumeros(numero, numeroColumna);
     
	}
}

