package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;
import java.time.Period;

public class Jugador {
	private String nombre;
	private String apellido;
	private LocalDate fechaNac;
	private String nacionalidad;
	private float estatura;
	private float peso;
	private String posicion;
	
	public int calcularEdad() {
		int anios;
		Period edad = Period.between(this.fechaNac, LocalDate.now());
		anios = edad.getYears();
		return anios;
	}
	
	@Override
	public String toString() {
		return "Jugador [apellido=" + apellido + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", nacionalidad="
				+ nacionalidad + ", estatura=" + estatura + ", peso=" + peso + ", posicion=" + posicion + ", edad=" + calcularEdad() +"]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public float getEstatura() {
		return estatura;
	}
	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
}
