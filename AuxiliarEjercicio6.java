/*
 * AuxiliarEjercicio6.java
 * Controlamos el nº de columnas, debe estar comprendido entre 1 y 22, 
 * de esa forma no se juntan los nº
 * Controlamos el nº, debe ser positivo y menor que 10_000
 * El programa se debe ejecutar, debe mostrar datos
 */


public class AuxiliarEjercicio6 {
	
	public static void DarListaNumeros(int numero, int numeroColumna) {
		for (int i = 1; i <= numero; i++){
		 System.out.printf("%5d", i);
		 if (i % numeroColumna == 0){
			System.out.printf("%n%n");
		 }
		 	 
	 }
	}
}
