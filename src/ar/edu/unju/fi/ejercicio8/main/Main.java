package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		CalculadoraEspecial calculadora = crearCalculadora(sc);
		long sumatoria = calculadora.calcularSumatoria();
		long productoria = calculadora.calcularProductoria();
		
		System.out.println("\nLa sumatora es= "+ sumatoria);
		System.out.println("La productoria es= "+productoria);
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	}
	
	public static CalculadoraEspecial crearCalculadora(Scanner sc) {
		
		System.out.print("Ingrese un valor para calculadora: ");
		int n = sc.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial();
		calculadora.setN(n);
		
		return calculadora;
	}
	
	
}
