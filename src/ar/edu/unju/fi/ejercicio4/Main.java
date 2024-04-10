package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, acumulador = 1;
		
		//Declaracion de Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero entero entre 0 y 10:");
		
		//Comprobacion de input como entero
		while(!sc.hasNextInt()) {
			System.out.println("ERROR: Debe ingresar un entero entre 0 y 10");
			System.out.println("Intente nuevamente:");
			sc.next();
		}
		
		num = sc.nextInt();
		
		//Comprobacion de input entre 0 y 10
		while(num<0 || num>10) {
			System.out.println("ERROR: El entero debe estar entre 0 y 10");
			System.out.println("Intente nuevamente:");
			num = sc.nextInt();
		}
		
		
		//CALCULO FACTORIAL con ciclo while
		int factorial = num;
		while(num>1) {
			acumulador *= num;
			num--;
		}
		
		System.out.println("El factorial de "+factorial+" es " +acumulador);
		System.out.println("FIN DE PROGRAMA");
		
	}

}
