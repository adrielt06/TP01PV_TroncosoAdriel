package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private double diametro;
	private double precio;
	private double area;
	private boolean especial;
	
	private final int ADICIONAL_20 = 500;
	private final int ADICIONAL_30 = 750;
	private final int ADICIONAL_40 = 1000;
	
	public void mostrarDatos() {
		System.out.println("\nDiametro = "+this.diametro);
		System.out.println("Ingredientes especiales = "+this.especial);
		System.out.println("Precio Pizza = "+ this.precio+"$");
		System.out.println("Area de pizza = "+ this.area);
		System.out.println("----------------------------------------");
	}
	
	public double calcularPrecio() {
		double precio=0;
		if(this.diametro==20) {
			if(this.especial==true) {
				precio=4500+ADICIONAL_20;
			}else{
				precio=4500;
			}
		}
		if(this.diametro==30) {
			if(this.especial==true) {
				precio= 4800+ADICIONAL_30;
			}else {
				precio=4800;
			}
		}
		if(this.diametro==40) {
			if(this.especial==true) {
				precio= 5500+ADICIONAL_40;
			}else {
				precio=5500;
			}
		}
		return precio;
	}
	
	public double calcularArea() {
		return Math.pow(Math.PI*(this.diametro/2), 2);
	}
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	
	
}
