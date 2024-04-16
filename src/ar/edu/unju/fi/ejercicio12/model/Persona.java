package ar.edu.unju.fi.ejercicio12.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNac;
	
	public void mostrarDatos() {
		System.out.println("\n**DATOS DE PERSONA**");
		System.out.println("Nombre: "+this.nombre);
		DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		String fechaConFormato = formateador.format(this.fechaNac.getTime());
		System.out.println("Fecha de nacimiento: "+fechaConFormato);
		System.out.println("Edad: "+calcularEdad());
		System.out.println("Signo del zodiaco: "+signoZodiaco());
		System.out.println("Estacion: "+estacionAnio());
		System.out.println("----------------------------------------");
	}
	
	public int calcularEdad() {
		Calendar hoy = Calendar.getInstance();
		return hoy.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
	}
	
	public String signoZodiaco() {
		int mes = fechaNac.get(Calendar.MONTH);
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String signo = "";
		
		if((mes == Calendar.MARCH && dia >= 21)||(mes == Calendar.APRIL && dia <= 20)) {
			signo = "Aries";
		}
		if((mes == Calendar.APRIL && dia >= 21)||(mes == Calendar.MAY && dia <= 20)) {
			signo = "Tauro";
		}
		if((mes == Calendar.MAY && dia >=21)||(mes == Calendar.JUNE && dia <= 20)) {
			signo = "Geminis";
		}
		if((mes == Calendar.JUNE && dia >=21)||(mes == Calendar.JULY && dia <= 22)) {
			signo = "Cancer";
		}
		if((mes == Calendar.JULY && dia >= 23)||(mes == Calendar.AUGUST && dia <= 23)) {
			signo = "Leo";
		}
		if((mes == Calendar.AUGUST && dia >= 24)||(mes == Calendar.SEPTEMBER && dia <= 22)) {
			signo = "Virgo";
		}
		if((mes == Calendar.SEPTEMBER && dia >= 23)||(mes == Calendar.OCTOBER && dia <= 23)) {
			signo = "Libra";
		}
		if((mes == Calendar.OCTOBER && dia >= 24)||(mes == Calendar.NOVEMBER && dia <= 22)) {
			signo = "Escorpio";
		}
		if((mes == Calendar.NOVEMBER && dia >= 23)||(mes == Calendar.DECEMBER && dia <= 21)) {
			signo = "Sagitario";
		}
		if((mes == Calendar.DECEMBER && dia >= 22)||(mes == Calendar.JANUARY && dia <= 20)) {
			signo = "Capricornio";
		}
		if((mes == Calendar.JANUARY && dia >= 21)||(mes == Calendar.FEBRUARY && dia <= 19)) {
			signo = "Acuario";
		}
		if((mes == Calendar.FEBRUARY && dia >= 20)||(mes == Calendar.MARCH && dia <= 20)){
			signo = "Piscis";
		}
		
		return signo;
	}	
	
	public String estacionAnio() {
		int mes = fechaNac.get(Calendar.MONTH);
		int dia = fechaNac.get(Calendar.DAY_OF_MONTH);
		String estacion = "";
		
		if ((mes == Calendar.DECEMBER && dia >= 21) || (mes == Calendar.JANUARY) || (mes == Calendar.FEBRUARY) || (mes == Calendar.MARCH && dia <= 20)) {
	        estacion = "Verano";
	    }
		if ((mes == Calendar.MARCH && dia >= 21) || (mes == Calendar.APRIL) || (mes == Calendar.MAY) || (mes == Calendar.JUNE && dia <= 20)) {
	        estacion = "Otoño";
	    }
		if ((mes == Calendar.JUNE && dia >= 21) || (mes == Calendar.JULY) || (mes == Calendar.AUGUST) || (mes == Calendar.SEPTEMBER && dia <= 20)) {
	        estacion = "Invierno";
	    }
		if ((mes == Calendar.SEPTEMBER && dia >= 21) || (mes == Calendar.OCTOBER) || (mes == Calendar.NOVEMBER) || (mes == Calendar.DECEMBER && dia <= 20)) {
	        estacion = "Primavera";
	    }

		return estacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Calendar getFechaNac() {
		return fechaNac;
	}
	
	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
}
