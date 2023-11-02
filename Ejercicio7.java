/*
 * Ejercicio7.java
 * 
 * Copyright 2023 usuario manana <manana@usuario-E70-SFF>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;

public class Ejercicio7 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el valor de a: ");
		double a = sc.nextDouble();
		System.out.println("Escribe el valor de b: ");
		double b = sc.nextDouble();
		System.out.println("Escribe el valor de c: ");
		double c = sc.nextDouble();
		System.out.println("Escribe el valor de d: ");
		double d = sc.nextDouble();
		System.out.println("Escribe el valor de e: ");
		double e = sc.nextDouble();
		System.out.println("Escribe el valor de f: ");
		double f = sc.nextDouble();
		System.out.println();
		if(resoluble (a, d, b, c)){
			System.out.printf("La ecuacion no es resoluble %n%n");
		}else{
			System.out.printf("x = %.2f%n%nx = %.2f%n", daResultadoX(e, d, b, f, a, c), daResultadoY(a, f, e, c, d, b));
			}
	}
	
	public static boolean resoluble (double a, double d, double b, 
	double c){
		boolean conSolucion = (a * d) - (b * c) == 0;
		return conSolucion;
		
	}
	
	public static double daResultadoX(double e, double d, double b,
	double f, double a, double c){
		double resultadoX = ((e * d)-(b * f)) / ((a * d)-(b * c));
		return resultadoX;								
	}
	
	public static double daResultadoY(double a, double f, double e,
	double c, double d, double b){
		double resultadoY = ((a * f)-(e * c)) / ((a * d)-(b * c));
		return resultadoY;									
	}
}

