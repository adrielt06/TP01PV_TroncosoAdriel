package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Uso de bloque try catch para validar input de usuario
		try {
			System.out.print("Ingrese un entero entre 0 y 9: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num < 0 || num > 9) {
				System.out.println("ERROR: El entero debe estar entre 0 y 9.");
			}else {
				tablaNumero(num);
			}
		}catch(java.util.InputMismatchException e) {
			System.out.println("ERROR: debe ingresar un numero entero.");
		}
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	}

	//Impresion de tabla en consola con ciclo for
	public static void tablaNumero(int num) {
		System.out.println("Tabla del "+num);
		for(int i=0;i<=10;i++) {
			System.out.println(num+" x "+i+" = "+ num*i);
		}
		
		
	}
}
