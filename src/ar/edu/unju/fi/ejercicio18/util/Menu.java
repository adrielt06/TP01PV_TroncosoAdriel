package ar.edu.unju.fi.ejercicio18.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Menu {
	private int opcion;
	private List<DestinoTuristico> destinos;
	
	public void generarMenu(List<Pais> paises) {
		Scanner sc = new Scanner(System.in);
		destinos = new ArrayList<>();
		do {
			imprimirMenu();
			setOpcion(elegirOpcion(sc));
			switch(this.opcion) {
			case 1:
				altaDestinoTuristico(paises, sc);
				System.out.println("**DESTINO AGREGADO CORRECTAMENTE**");
				break;
			case 2:
				mostrarDestinos();
				break;
			case 3:
				modificarPaisDeDestino(paises,sc);
				break;
			case 4:
				destinos.clear();
				System.out.println("**ARRAYLIST DE DESTINOS LIMPIADO CORRECTAMENTE**");
				break;
			case 5:
				eliminarDestino(sc);
				break;
			case 6:
				mostrarDestinosPorNombre();
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosPorPais(paises, sc);
				break;
			case 9:
				sc.close();
				break;
			}
			
		}while(opcion != 9);
	}
	
	private void mostrarDestinosPorPais(List<Pais> paises, Scanner sc) {
		if(!destinos.isEmpty()) {
			Pais pais = validarPais(paises, sc);
			System.out.println("**LISTA DE DESTINOS EN PAIS: "+pais.getNombre()+"**");
			for(DestinoTuristico d:destinos) {
				if(d.getPais().equals(pais)) {
					System.out.println(d.toString());
				}
			}
		}else {
			System.out.println("ERROR: La lista de destinos turisticos esta vacia.");
		}
	}
	
	private void mostrarPaises(List<Pais> paises) {
		System.out.println("**LISTA DE PAISES**");
		for(Pais a:paises) {
			System.out.println(a.toString());
		}
	}
	
	private void mostrarDestinosPorNombre() {
		if(!destinos.isEmpty()) {
			destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
			System.out.println("**LISTA DE DESTINOS ORDENADA POR NOMBRE**");
			for(DestinoTuristico a:destinos) {
				System.out.println(a.toString());
			}
		}else {
			System.out.println("ERROR: La lista de destinos turisticos esta vacia.");
		}
	}
	
	private void eliminarDestino(Scanner sc) {
		boolean encontrado = false;
		if(!destinos.isEmpty()) {
			System.out.print("Ingrese el codigo del destino a eliminar: ");
			String cod = sc.nextLine();
			Iterator<DestinoTuristico> iterador = destinos.iterator();
			
			while(iterador.hasNext()) {
				DestinoTuristico a = iterador.next();
				if(a.getCodigo().equalsIgnoreCase(cod)) {
					destinos.remove(a);
					System.out.println("**DESTINO ELIMINADO CORRECTAMENTE**");
					encontrado = true;
					break;
					}
			}
			if(!encontrado) {
				System.out.println("ERROR: el codigo ingresado no corresponde a ningun destino.");
			}
		}else {
			System.out.println("ERROR: La lista de destinos turisticos esta vacia.");
		}
	}
	
	private void modificarPaisDeDestino(List<Pais> paises, Scanner sc) {
		boolean encontrado = false;
		if (!destinos.isEmpty()) {
			System.out.print("Ingrese el codigo del destino turistico que desea modificar: ");
			String cod = sc.nextLine();
			for (DestinoTuristico a : destinos) {
				if (a.getCodigo().equalsIgnoreCase(cod)) {
					encontrado = true;
					int i = destinos.indexOf(a);
					System.out.println("**DESTINO ENCONTRADO**");
					System.out.println(a.toString());
					a.setPais(validarPais(paises, sc));
					destinos.set(i, a);
					System.out.println("**CAMBIO REALIZADO CORRECTAMENTE**");
					break;
				}
			}
			if (!encontrado) {
				System.out.println("ERROR: el codigo de destino turistico ingresado no existe.");
			}
		}else {
			System.out.println("ERROR: La lista de destinos turisticos esta vacia.");
		}
	}
	
	private void mostrarDestinos() {
		if (!destinos.isEmpty()) {
			System.out.println("**LISTA DE DESTINOS**");
			for (DestinoTuristico a : destinos) {
				System.out.println(a.toString());
			}
		}else{
				System.out.println("ERROR: La lista de destinos turisticos esta vacia.");
		}
	}

	private void altaDestinoTuristico(List<Pais> paises, Scanner sc){
		DestinoTuristico destino = new DestinoTuristico();
		
		destino.setCodigo(validarCodDestino(destinos, sc)); 
		
		System.out.print("Ingrese el nombre para el destino turistico: ");
		destino.setNombre(sc.nextLine());
		
		destino.setPrecio(validarPrecio(sc));
		
		destino.setPais(validarPais(paises, sc));
		
		destino.setCantDias(validarDias(sc));
		
		destinos.add(destino);
	}
	
	private String validarCodDestino(List<DestinoTuristico> destinos, Scanner sc) {
		boolean repetido = false;
		String cod;
		do {
			System.out.print("Ingrese el codigo para el destino turistico: ");
			cod = sc.nextLine();
			repetido = false;
			for (DestinoTuristico a : destinos) {
				if(a.getCodigo().equalsIgnoreCase(cod)) {
					repetido = true;
					System.out.println("ERROR: El codigo ingresado ya esta en uso.");
				}
			}
		} while (repetido);
		return cod;
	}
	
	private int validarDias(Scanner sc) {
		int dias = 0;
		boolean valido = false;
		while (!valido) {
			System.out.print("Ingrese la cantidad de dias del destino turistico: ");
			try {
				dias = sc.nextInt();
				sc.nextLine();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
				sc.nextLine();
			} 
		}
		return dias;
	}
	
	private Pais validarPais(List<Pais> paises, Scanner sc) {
		boolean encontrado = false;
		Pais valido = new Pais();
		while(!encontrado) {
			System.out.print("Ingrese el codigo del pais del destino turistico: ");
			String codPais = sc.nextLine();
			for(Pais a:paises) {
				if(a.getCodigo().equalsIgnoreCase(codPais)) {
					System.out.println("El codigo es valido.");
					valido = a;
					encontrado = true;
				}
			}
			if(!encontrado) {
				System.out.println("ERROR: el codigo ingresado no corresponde a un pais valido.");
			}
		}
		return valido;
	}
	
	private double validarPrecio(Scanner sc) {
		double prec = 0.0d;
		boolean valido = false;
		while (!valido) {
			System.out.print("Ingrese el precio del destino turistico: ");
			try {
				prec = sc.nextDouble();
				sc.nextLine();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
				sc.nextLine();
			} 
		}
		return prec;
	}
	
	private int elegirOpcion(Scanner sc) {
		int opc;
		try {
			do {
				System.out.print("Elija una opcion: ");
				opc = sc.nextInt();
				sc.nextLine();
				if(opc < 1 || opc > 9) {
					System.out.println("ERROR: Debe ingresar una opcion en el rango [1-9]");
				}
			} while (opc < 1 || opc > 9);
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
			sc.nextLine();
			return elegirOpcion(sc);
		}
		return opc;
	}
	
	private void imprimirMenu() {
		System.out.println("---------------------------");
		System.out.println("** MENU DE OPCIONES **");
		System.out.println("1 – Alta de destino turistico.");
		System.out.println("2 – Mostrar todos los destinos turisticos.");
		System.out.println("3 – Modificar el pais de un destino turistico.");
		System.out.println("4 – Limpiar el ArrayList de destino turistico.");
		System.out.println("5 – Eliminar un destino turistico.");
		System.out.println("6 – Mostrar los destinos turisticos ordenados por nombre.");
		System.out.println("7 – Mostrar todos los paises.");
		System.out.println("8 – Mostrar los destinos turisticos que pertenecen a un pais.");
		System.out.println("9 – Salir.");
		System.out.println("---------------------------");
	}
	
	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	
	
}
