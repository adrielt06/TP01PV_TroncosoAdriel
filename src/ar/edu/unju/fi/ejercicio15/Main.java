package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,i;
		
		do {
			System.out.print("Ingrese un entero en el rango [5-10]: ");
			num = sc.nextInt();
			sc.nextLine();
			if(num < 5 || num > 10) {
				System.out.println("ERROR: El entero esta fuera del rango.");
			}
		}while(num < 5 || num > 10);
		
		String [] array = new String [num];
		
		for(i = 0; i<array.length; i++) {
			System.out.print("Ingrese un nombre de persona para posicion ["+i+"/"+(num-1)+"]: ");
			array[i] = sc.nextLine();
		}
		
		System.out.println("---------------------");
		System.out.println("**ARRAY DE NOMBRES**");
		
		for(i = 0; i<array.length; i++) {
			System.out.println("Nombre en posicion ["+i+"] = "+array[i]);
		}
		
		System.out.println("---------------------");
		System.out.println("**ARRAY DE NOMBRES (invertido)**");
		
		for(i = num-1; i>=0; i--) {
			System.out.println("Nombre en posicion ["+i+"] = "+array[i]);
		}
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	}
	
	

}
