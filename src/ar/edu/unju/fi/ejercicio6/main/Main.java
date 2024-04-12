package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		usoConstructorPorDefecto(sc);
		usoConstructorParametrizado(sc);
		usoConstructorParametrizado2(sc);
		
		sc.close();
		
		System.out.println("FIN DE PROGRAMA");
	
	}
	
	public static void usoConstructorPorDefecto(Scanner sc) {
		
		Persona persona = new Persona();
		
		System.out.print("Ingrese DNI de persona 1: ");
		persona.setDni(sc.nextLine());
		
		System.out.print("Ingrese nombre de persona 1: ");
		persona.setNombre(sc.nextLine());
		
		System.out.print("Ingrese Fecha de nacimiento de persona 1 (dd/mm/yyyy): ");
		String fechaNacString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacString,formatter);
		persona.setFechaNac(fechaNac);
		
		System.out.print("Ingrese provincia de persona 1: ");
		persona.setProvincia(sc.nextLine());
		
		System.out.println("\n**DATOS PERSONA 1**");
		persona.mostrarDatos();
	}
	
	public static void usoConstructorParametrizado(Scanner sc) {
		
		System.out.print("Ingrese DNI de persona 2: ");
		String dni = sc.nextLine();
		
		System.out.print("Ingrese nombre de persona 2: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Fecha de nacimiento de persona 2 (dd/mm/yyyy): ");
		String fechaNacString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacString,formatter);
		
		System.out.print("Ingrese provincia de persona 2: ");
		String provincia = sc.nextLine();
		
		Persona persona = new Persona(dni, nombre, fechaNac, provincia);
		
		System.out.println("\n**DATOS PERSONA 2**");
		persona.mostrarDatos();
		
	}
	
	public static void usoConstructorParametrizado2(Scanner sc) {
		System.out.print("Ingrese DNI de persona 3: ");
		String dni = sc.nextLine();
		
		System.out.print("Ingrese nombre de persona 3: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Fecha de nacimiento de persona 3 (dd/mm/yyyy): ");
		String fechaNacString = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
		LocalDate fechaNac = LocalDate.parse(fechaNacString,formatter);
		
		Persona persona = new Persona(dni, nombre, fechaNac);
		
		System.out.println("\n**DATOS PERSONA 3**");
		persona.mostrarDatos();
	}
}	
