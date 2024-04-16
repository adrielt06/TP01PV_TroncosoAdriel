package ar.edu.unju.fi.ejercicio12.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Persona persona = crearPersona(sc);
		persona.mostrarDatos();
		System.out.println("FIN DE PROGRAMA");
		sc.close();
	}
	
	public static Persona crearPersona(Scanner sc) throws ParseException {
		Persona persona = new Persona();
		
		System.out.print("Ingrese el nombre de la persona: ");
		persona.setNombre(sc.nextLine());
	
		System.out.print("Ingrese la fecha de nacimiento de la persona (dd/mm/yyyy): ");
		DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = formateador.parse(sc.nextLine());
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(fecha);
		persona.setFechaNac(calendar);
		
		return persona;
	}

}
