package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaracion de Scanner para input de usuario
		Scanner sc = new Scanner(System.in);
		
		//Declaracion de variable
		int num;
		
		System.out.println("Ingrese un numero entero: ");
		
		//Comprobacion de valor ingresado como entero
		while(!sc.hasNextInt()) {
			System.out.println("ERROR: Debe ingresar un numero entero.");
			System.out.println("Ingrese un numero entero: ");
			sc.next();
		}
		
		//Asignacion de valor entero a variable
		num = sc.nextInt();
		
		//Operacion con variable entera (par o impar)
		if(num % 2 == 0) {
			num *= 3;
			System.out.println("El triple del numero par es: " + num);
		}else {
			num *= 2;
			System.out.println("El doble del numero impar es: " + num);
		}
		
		System.out.println("FIN DE PROGRAMA");
		//Cierre de Scanner
		sc.close();
	}
}
