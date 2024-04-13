package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		Scanner sc = new Scanner(System.in);
		
		while (i<=3) {
			System.out.println("***PRODUCTO "+i+"***");
			Producto producto = crearProducto(sc);
			producto.mostrarDatos();
			i++;
		}
		
		sc.close();
		System.out.println("FIN DE PROGRAMA");
	
	}
	
	public static Producto crearProducto(Scanner sc) {
		Producto producto = new Producto();
		System.out.print("\nIngrese nombre de producto: ");
		String nombre = sc.nextLine();
		producto.setNombre(nombre);
		
		System.out.print("Ingrese codigo de producto: ");
		String codigo = sc.nextLine();
		producto.setCodigo(codigo);
		
		System.out.print("Ingrese precio de producto: ");
		producto.setPrecio(sc.nextDouble());
		
		do {
			System.out.print("Ingrese descuento de producto (0 a 50%): ");
			producto.setDescuento(sc.nextInt());
			sc.nextLine();
			if(producto.getDescuento() > 50 || producto.getDescuento() < 0) {
				System.out.println("ERROR: El descuento debe estar entre el 0 y 50%.");
			}
		}while(producto.getDescuento() > 50 || producto.getDescuento() < 0);
		
		return producto;
		
	}

}
