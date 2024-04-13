package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private int descuento;
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularDescuento() {
		double precio = this.precio;
		precio = precio - (precio * ((double)this.descuento / 100d));
		return precio;
	}
	
	public void mostrarDatos() {
		System.out.println("\n**DATOS DE PRODUCTO**");
		System.out.println("Nombre de producto: "+this.nombre);
		System.out.println("Codigo de producto: "+this.codigo);
		System.out.println("Precio de producto: $"+this.precio);
		System.out.println("Descuento de producto: "+this.descuento+"%");
		System.out.println("Precio con descuento: $"+calcularDescuento());
		System.out.println("-------------------------------");
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	
	
}
