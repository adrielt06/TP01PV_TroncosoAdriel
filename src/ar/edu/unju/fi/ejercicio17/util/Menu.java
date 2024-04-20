package ar.edu.unju.fi.ejercicio17.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Menu {
	private int opcion;
	
	public void generarMenu(List<Jugador> jugadores) {
		Scanner sc = new Scanner(System.in);
		do {
			imprimirMenu();
			setOpcion(elegirOpcion(sc));
			switch(this.opcion) {
			case 1:
				jugadores = altaJugador(jugadores,sc);
				System.out.println("*CARGA REALIZADA CON EXITO*");
				break;
			case 2:
				mostrarJugador(jugadores, sc);
				break;
			case 3:
				mostrarJugadores(jugadores);
				break;
			case 4:
				jugadores = modificarJugador(jugadores,sc);
				break;
			case 5:
				jugadores = eliminarJugador(jugadores,sc);
				break;
			case 6:
				System.out.println("El ArrayList de jugadores tiene "+ jugadores.size()+" jugadores cargados.");
				break;
			case 7:
				mostrarPorNacionalidad(jugadores,sc);
				break;
			case 8:
				sc.close();
				break;
			}
			
		}while(opcion != 8);
	}
	
	private void mostrarPorNacionalidad(List<Jugador> jugadores, Scanner sc) {
		if (!jugadores.isEmpty()) {
			System.out.print("Ingrese la nacionalidad de los jugadores que desea mostrar: ");
			String nac = sc.nextLine();
			for (Jugador a : jugadores) {
				if (a.getNacionalidad().equalsIgnoreCase(nac)) {
					System.out.println(a.toString());
				}
			} 
		}else {
			System.out.println("ERROR: La lista de jugadores esta vacia.");
		}
	}
	
	private List<Jugador> eliminarJugador(List<Jugador> jugadores, Scanner sc){
		boolean encontrado = false;
		if (!jugadores.isEmpty()) {
			System.out.print("Ingrese el nombre del jugador a buscar: ");
			String nombre = sc.nextLine();
			System.out.print("Ingrese el apellido del jugador a buscar: ");
			String apellido = sc.nextLine();
			
			Iterator<Jugador> iterador = jugadores.iterator();
			
			while(iterador.hasNext()) {
				Jugador a = iterador.next();
				if(a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido)) {
					System.out.println("**JUGADOR ENCONTRADO Y ELIMINADO CORRECTAMENTE**");
					jugadores.remove(a);
					encontrado = true;
					break;
				}
			}
			if(!encontrado) {
				System.out.println("ERROR: No se ha encontrado el jugador.");
			}
		}else {
			System.out.println("ERROR: La lista de jugadores esta vacia.");
		}
		
		return jugadores;
	}
	
	private List<Jugador> modificarJugador(List<Jugador> jugadores, Scanner sc){
		boolean encontrado = false;
		if (!jugadores.isEmpty()) {
			System.out.print("Ingrese el nombre del jugador a modificar: ");
			String nombre = sc.nextLine();
			System.out.print("Ingrese el apellido del jugador a modificar: ");
			String apellido = sc.nextLine();
			for(Jugador a:jugadores) {
				if(a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido)) {
					encontrado = true;
					System.out.println("**JUGADOR A MODIFICAR ENCONTRADO**");
					System.out.println("*INGRESE NUEVOS DATOS PARA JUGADOR*");
					int i = jugadores.indexOf(a);
					jugadores.remove(i);
					Jugador jugador = new Jugador();
					
					System.out.print("Ingrese nombre de jugador: ");
					jugador.setNombre(sc.nextLine());
					
					System.out.print("Ingrese apellido de jugador: ");
					jugador.setApellido(sc.nextLine());
					
					jugador.setFechaNac(validarFecha(sc));
					
					System.out.print("Ingrese nacionalidad de jugador: ");
					jugador.setNacionalidad(sc.nextLine());
					
					jugador.setEstatura(validarEstatura(sc));
					
					jugador.setPeso(validarPeso(sc));
					
					do {
						System.out.print("Ingrese posicion del jugador (delantero, medio, defensa, arquero): ");
						jugador.setPosicion(sc.nextLine());
						if(!jugador.getPosicion().equalsIgnoreCase("delantero") && 
								!jugador.getPosicion().equalsIgnoreCase("medio") && 
								!jugador.getPosicion().equalsIgnoreCase("defensa") && 
								!jugador.getPosicion().equalsIgnoreCase("arquero")) {
							System.out.println("ERROR: debe ingresar una de las posiciones validas, intente nuevamente.");
						}
					} while (!jugador.getPosicion().equalsIgnoreCase("delantero") && 
						       !jugador.getPosicion().equalsIgnoreCase("medio") && 
						       !jugador.getPosicion().equalsIgnoreCase("defensa") && 
						       !jugador.getPosicion().equalsIgnoreCase("arquero"));
					jugadores.add(jugador);
					System.out.println("**CAMBIOS REALIZADOS CORRECTAMENTE**");
					break;
				}
			}
			if(!encontrado) {
				System.out.println("ERROR: No se ha encontrado el jugador.");
			}
		}else {
			System.out.println("ERROR: La lista de jugadores esta vacia.");
		}
		
		return jugadores;
	}
	
	private void mostrarJugadores(List<Jugador> jugadores) {
		if (!jugadores.isEmpty()) {
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			System.out.println("**LISTA DE JUGADORES ORDENADA POR APELLIDO**");
			for (Jugador a : jugadores) {
				System.out.println(a.toString());
			}
		}else{
				System.out.println("ERROR: La lista de jugadores esta vacia.");
			}
		}
	
	private void mostrarJugador(List<Jugador> jugadores, Scanner sc) {
		boolean encontrado = false;
		if (!jugadores.isEmpty()) {
			System.out.print("Ingrese el nombre del jugador a buscar: ");
			String nombre = sc.nextLine();
			System.out.print("Ingrese el apellido del jugador a buscar: ");
			String apellido = sc.nextLine();
			for(Jugador a:jugadores) {
				if(a.getNombre().equalsIgnoreCase(nombre) && a.getApellido().equalsIgnoreCase(apellido)) {
					System.out.println("**Datos de jugador encontrados**");
					System.out.println(a.toString());
					encontrado = true;
				}
			}
			if(!encontrado) {
				System.out.println("ERROR: No se ha encontrado el jugador.");
			}
		}else {
			System.out.println("ERROR: La lista de jugadores esta vacia.");
		}
	}
	
	private List<Jugador> altaJugador(List<Jugador> jugadores, Scanner sc) {
		Jugador jugador = new Jugador();
		
		System.out.print("Ingrese nombre de jugador: ");
		jugador.setNombre(sc.nextLine());
		
		System.out.print("Ingrese apellido de jugador: ");
		jugador.setApellido(sc.nextLine());
		
		jugador.setFechaNac(validarFecha(sc));
		
		System.out.print("Ingrese nacionalidad de jugador: ");
		jugador.setNacionalidad(sc.nextLine());
		
		jugador.setEstatura(validarEstatura(sc));
		
		jugador.setPeso(validarPeso(sc));
		
		do {
			System.out.print("Ingrese posicion del jugador (delantero, medio, defensa, arquero): ");
			jugador.setPosicion(sc.nextLine());
			if(!jugador.getPosicion().equalsIgnoreCase("delantero") && 
					!jugador.getPosicion().equalsIgnoreCase("medio") && 
					!jugador.getPosicion().equalsIgnoreCase("defensa") && 
					!jugador.getPosicion().equalsIgnoreCase("arquero")) {
				System.out.println("ERROR: debe ingresar una de las posiciones validas, intente nuevamente.");
			}
		} while (!jugador.getPosicion().equalsIgnoreCase("delantero") && 
			       !jugador.getPosicion().equalsIgnoreCase("medio") && 
			       !jugador.getPosicion().equalsIgnoreCase("defensa") && 
			       !jugador.getPosicion().equalsIgnoreCase("arquero"));
		
		jugadores.add(jugador);
		
		return jugadores;
	}
	
	
	private float validarPeso(Scanner sc) {
		float peso = 0.0f;
		boolean valido = false;
		while (!valido) {
			System.out.print("Ingrese el peso del jugador: ");
			try {
				peso = sc.nextFloat();
				sc.nextLine();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
				sc.nextLine();
			} 
		}
		return peso;
	}
	
	private float validarEstatura(Scanner sc) {
		float est = 0.0f;
		boolean valido = false;
		while (!valido) {
			System.out.print("Ingrese la estatura del jugador: ");
			try {
				est = sc.nextFloat();
				sc.nextLine();
				valido = true;
			} catch (InputMismatchException e) {
				System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
				sc.nextLine();
			}
		}
		return est;
	}
	
	private LocalDate validarFecha(Scanner sc) {
		LocalDate fechaNac = LocalDate.now();
		boolean valido = false;
		while (!valido) {
			System.out.print("Ingrese fecha de nacimiento de jugador(dd/mm/yyyy): ");
			try {
				String fechaNacString = sc.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/yyyy");
				fechaNac = LocalDate.parse(fechaNacString, formatter);
				valido = true;
			} catch (DateTimeParseException e) {
				System.out.println("ERROR: Formato de fecha incorrecto, intente nuevamente.");
			} 
		}
		return fechaNac;
	}
	
	private void imprimirMenu() {
		System.out.println("---------------------------");
		System.out.println("** MENU DE OPCIONES **");
		System.out.println("1 – Alta de jugador.");
		System.out.println("2 – Mostrar los datos del jugador.");
		System.out.println("3 – Mostrar todos los jugadores ordenados por apellido.");
		System.out.println("4 – Modificar los datos de un jugador.");
		System.out.println("5 – Eliminar un jugador.");
		System.out.println("6 – Mostrar la cantidad total de jugadores.");
		System.out.println("7 – Mostrar la cantidad de jugadores que pertenecen a una nacionalidad.");
		System.out.println("8 – Salir.");
		System.out.println("---------------------------");
	}
	
	private int elegirOpcion(Scanner sc) {
		int opc;
		try {
			do {
				System.out.print("Elija una opcion: ");
				opc = sc.nextInt();
				sc.nextLine();
				if(opc < 1 || opc > 8) {
					System.out.println("ERROR: Debe ingresar una opcion en el rango [1-8]");
				}
			} while (opc < 1 || opc > 8);
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR: Debe ingresar un numero, intente nuevamente.");
			sc.nextLine();
			return elegirOpcion(sc);
		}
		return opc;
	}
	
	public int getOpcion() {
		return opcion;
	}
	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
}
