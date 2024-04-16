package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		String [] nombres = new String[5];
		int i;
		Byte num;
		
		for(i = 0; i<nombres.length; i++) {
			System.out.print("Ingrese un nombre para posicion ["+i+"]: ");
			nombres[i] = sc.nextLine();
		}
		
		System.out.println("**ARREGLO DE NOMBRES**");
		mostrarArray(nombres);
		
		System.out.println("------------------------");
		System.out.println("El tamaño del array de nombres es: "+nombres.length);
		
		do {
			System.out.print("\nIngrese un entero (0-4): ");
			num = sc.nextByte();
			if(num < 0 || num > 4) {
				System.out.println("ERROR: Entero fuera de rango.");
			}
		} while (num < 0 || num > 4);
		
		System.out.println("\nEliminando valor en indice "+num+"....");
		
		if (num<4) {
			for (i = num; i < nombres.length-1; i++) {
				nombres[i] = nombres[i + 1];
			} 
		}
		nombres[4]="";
		
		System.out.println("**ARREGLO DE NOMBRES**");
		mostrarArray(nombres);
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	}
	
	public static void mostrarArray(String[] array) {
		int i=0;
		while(i<array.length) {
			System.out.println("Posicion ["+i+"] = "+array[i]);
			i++;
		}
	}

}
