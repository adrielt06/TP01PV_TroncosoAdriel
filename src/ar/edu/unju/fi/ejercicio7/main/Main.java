package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Empleado empleado = creacionEmpleado(sc);
		System.out.println("\n**DATOS DE EMPLEADO**");
		empleado.mostrarDatos();
		
		System.out.println("\nDando aumento a empleado...");
		empleado.darAumento();
		
		System.out.println("\n**NUEVOS DATOS DE EMPLEADO**");
		empleado.mostrarDatos();
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
		
	}

	public static Empleado creacionEmpleado(Scanner sc) {
		System.out.print("Ingrese nombre de empleado: ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese legajo de empleado: ");
		String legajo = sc.nextLine();
		
		System.out.println("Ingrese salario de empleado: ");
		double salario = sc.nextDouble();
		
		Empleado empleado = new Empleado(nombre, legajo, salario);
		return empleado;
		
	}
}
