package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private String legajo;
	private double salario;
	
	public final double SAL_MINIMO = 210000.00;
	public final double AUMENTO = 20000.00;
	
	public Empleado(String nombre, String legajo, double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario>=SAL_MINIMO) {
			this.salario = salario;
		}else{
			this.salario=SAL_MINIMO;
		}
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre del empleado: "+this.nombre);
		System.out.println("Legajo: "+this.legajo);
		System.out.println("Salario $: "+this.salario);
	}
	
	public void darAumento() {
		this.salario += AUMENTO;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario>=SAL_MINIMO) {
			this.salario = salario;
		}else{
			this.salario=SAL_MINIMO;
		}
	}

	public double getSAL_MINIMO() {
		return SAL_MINIMO;
	}

	public double getAUMENTO() {
		return AUMENTO;
	}
	
	
	
}
