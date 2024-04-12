package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaNac;
	private String provincia;
	
	public Persona() {
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNac, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = provincia;
	}
	
	public Persona(String dni, String nombre, LocalDate fechaNac) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.provincia = "Jujuy";
	}

	public int calcularEdad(LocalDate fechaNac) {
		int anios;
		Period edad = Period.between(fechaNac, LocalDate.now());
		anios = edad.getYears();
		return anios;
	}
	
	public boolean mayorDeEdad(int edad) {
		return edad>=18;
	}
	
	public void mostrarDatos(){
		System.out.println("DNI = "+this.dni);
		System.out.println("nombre = "+this.nombre);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
		System.out.println("fecha de Nacimiento = "+ formatter.format(this.fechaNac));
		System.out.println("Provincia = "+this.provincia);
		System.out.println("Edad = "+calcularEdad(fechaNac));
		if(mayorDeEdad(calcularEdad(fechaNac))){
			System.out.println("La persona es mayor de edad");
		}else {
			System.out.println("La persona no es mayor de edad");
		}
		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
}
