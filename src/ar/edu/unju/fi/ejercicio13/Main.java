package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [8];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<array.length; i++) {
			System.out.print("Ingrese un entero para arreglo ["+i+"]:");
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
