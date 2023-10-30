/* 
 * Documento auxiliar del ejercicio4 
 */


public class Auxiliar {
	
	public static void ElegirOpcion(int numero1, int numero2, int opcion) {
		switch (opcion)
		{
			case 1 -> 
			System.out.printf("El resultado de la suma es:" + 
			(numero1 + numero2));
			case 2 ->
			System.out.printf("El resultado de la resta es: " + 
			(numero1 - numero2));
			case 3 -> 
			System.out.println
			("El resultado de la multiplicacion es " + 	
			numero1 * numero2);
			case 4 ->
			System.out.printf("El resultado de la división es " + 
			numero1 / numero2);		
			default ->
			System.out.printf("Se va a salir del menu%n");
		}
		
	}
}

