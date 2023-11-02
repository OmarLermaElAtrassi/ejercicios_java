/*
 * Importar metodos para que se pueda realizar 
 * las cuentas con el menor codigo posible
 */


public class TestEcuacionSegundoGrado {
	
	public static void main (String[] args) {
		
		//Pregunta coeficiente
		System.out.println("Introduce valor para a: ");
		double a = EcuacionSegundoGrado.preguntarCoeficiente ();
		System.out.println("Introduce valor para b: ");
		double b = EcuacionSegundoGrado.preguntarCoeficiente ();
		System.out.println("Introduce valor para c: ");
		double c = EcuacionSegundoGrado.preguntarCoeficiente ();
		
		//Dice si es posible de resolver
		if (EcuacionSegundoGrado.puedeHacerse(a, b, c)){ //Si es posible da los 2 resultados
			System.out.printf("x = %.2f\n\n y = %.2f",
			EcuacionSegundoGrado.darResultado1(a, b, c),
			EcuacionSegundoGrado.darResultado2(a, b, c));
		}else{//Sino dice que no tiene solucion
			System.out.println("La ecuación no tiene solucion");
		}
		
	}
}

