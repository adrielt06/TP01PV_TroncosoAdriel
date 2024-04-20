package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio17.util.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu menu = new Menu();
		List<Jugador> jugadores = new ArrayList<>();
		
		menu.generarMenu(jugadores);
		
		System.out.println("FIN DE PROGRAMA");
	}

}
