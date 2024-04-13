package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while(i<=3) {
			Pizza pizza = crearPizza (sc);
			System.out.println("\n**PIZZA "+i+"**");
			pizza.mostrarDatos();
			i++;
		}
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	}
	
	public static Pizza crearPizza(Scanner sc) {
		Pizza pizza = new Pizza();
		
		do {
			System.out.print("Ingrese diametro de pizza (20/30/40): ");
			pizza.setDiametro(sc.nextFloat());
			sc.nextLine();
			if(pizza.getDiametro() != 20 && pizza.getDiametro() != 30 && pizza.getDiametro() != 40) {
				System.out.println("ERROR: debe elegir entre los diametros 20, 30 o 40");
			}
		}while(pizza.getDiametro() != 20 && pizza.getDiametro() != 30 && pizza.getDiametro() != 40);
		
		System.out.print("Tiene ingredientes especiales? (true/false): ");
		pizza.setEspecial(sc.nextBoolean());
		
		pizza.setPrecio(pizza.calcularPrecio());
		pizza.setArea(pizza.calcularArea());
		
		return pizza;
	}

}
