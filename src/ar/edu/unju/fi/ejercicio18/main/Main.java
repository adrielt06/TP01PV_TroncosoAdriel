package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio18.model.Pais;
import ar.edu.unju.fi.ejercicio18.util.Menu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pais> paises = new ArrayList<>();
		
		Pais pais1 = new Pais("P-01", "Argentina");
		paises.add(pais1);
		Pais pais2 = new Pais("P-02", "Chile");
		paises.add(pais2);
		Pais pais3 = new Pais("P-03", "Brasil");
		paises.add(pais3);
		Pais pais4 = new Pais("P-04", "Paraguay");
		paises.add(pais4);
		Pais pais5 = new Pais("P-05", "Uruguay");
		paises.add(pais5);
		
		Menu menu = new Menu();
		
		menu.generarMenu(paises);
		
		System.out.println("FIN DE PROGRAMA");
	}

}
