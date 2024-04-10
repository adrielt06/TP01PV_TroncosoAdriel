package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial=0, num=0;
		
		//Declaracion de Scanner
		Scanner sc = new Scanner(System.in);
		
		//Uso de bloque try catch para validar entrada.
		try {
			System.out.print("Ingrese un entero entre 0 y 10: ");
			num = sc.nextInt();
			sc.nextLine();
			
			if(num < 0 || num > 10) {
				System.out.println("ERROR: El entero debe estar entre 0 y 10.");
			}else {
				factorial = calculoFactorial(num);
				System.out.println("El factorial de "+num+" es " + factorial);
			}
		}catch(java.util.InputMismatchException e) {
			System.out.println("ERROR: debe ingresar un numero entero.");
		}
		
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
		
	}
	
	//CALCULO FACTORIAL con ciclo while
	public static int calculoFactorial(int n) {
		int resultado = 1;
		while(n>1) {
			resultado *= n;
			n--;
		}
		return resultado;
	}

}
