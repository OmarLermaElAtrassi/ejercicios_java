/*
 * 1) Se solicita coeficiente a, b y c
 * 2) Se comprueba si se puede hacer,
 * si no se puede -> mostrar mensaje
 * si se puede -> mostrar resultado1 y resultado2
 */

import java.util.Scanner;

public class EcuacionSegundoGrado {
	
	static Scanner sc = new Scanner(System.in);
	
	public static double preguntarCoeficiente (){
		
		double coeficiente = sc.nextDouble();
		return coeficiente;
	}
	
	public static boolean puedeHacerse (double a, double b, double c) {
		
		boolean posible = ( Math.pow(b, 2) - (4 * a * c) >= 0 );
		return posible; 
	}
	
	public static double darResultado1 (double a, double b, double c){
	
		double resultado1 = 
		( -b + (Math.sqrt((b * b) - (4 * a * c))) ) / (2 * a);
		return resultado1;
	}
	
	public static double darResultado2 (double a, double b, double c){
		
		double resultado2 = 
		( -b - (Math.sqrt((b * b) - (4 * a * c))) ) / (2 * a);
		return resultado2;
	}
	
}

