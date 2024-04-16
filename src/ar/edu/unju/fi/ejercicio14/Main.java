package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.print("Ingrese un entero en el rango [3-10]: ");
			num = sc.nextInt();
			if(num < 3 || num > 10) {
				System.out.println("ERROR: El entero esta duera del rango.");
			}
		}while(num < 3 || num > 10);
		
		int [] array = new int [num];
		
		for(int i =0; i<array.length; i++) {
			System.out.print("Ingrese un entero para posicion ["+i+"/"+(num-1)+"]:");
			array[i] = sc.nextInt();
		}
		
		System.out.println("---------------------");
		System.out.println("**ARRAY DE ENTEROS**");
		for(int i =0; i<array.length; i++) {
			System.out.println("Entero en posicion ["+i+"] = "+array[i]);
		}
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
		
	}

}
