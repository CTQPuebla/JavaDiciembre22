package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		//3 usuarios
		Usuario aleC = new Usuario("Ale Cabrera", "Las Cruces", "07/07/1999", "5545894623", "CAA990707");
		Usuario deyaG = new Usuario("Deyanira Guzmán", "La Progreso", "16/06/1996", "7442968512", "GUD960616");
		Usuario vaneGB = new Usuario("Vanessa Guzbrera", "Cuaji", "25/05/2005", "7445235678", "GBV050525");

		//5 cuentas
		Cuenta ahorroaleG = new Cuenta(aleC, "0707", "124578895612457845", "Ahorro", "4152124589", "07/07/2025", 50000, 10000, 100000);
		Cuenta ahorrodeyaG = new Cuenta(deyaG, "0606", "125689457856231245", "Ahorro", "4152112233", "16/06/2025", 60000, 10000, 100000);
		Cuenta creditodeyaG = new Cuenta(deyaG, "0606", "235645784578451257", "Credito", "4152558899", "16/06/2025", 60000, 10000, 100000);
		Cuenta ahorrovaneGB = new Cuenta(vaneGB, "2525", "562356457812457845", "Ahorro", "4152004466", "25/05/2025", 40000, 10000, 100000);
		Cuenta creditovaneGB = new Cuenta(vaneGB, "2525", "457845125689457812", "Credito", "4152780055", "25/05/2025", 40000, 10000, 100000);

		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(ahorroaleG);
		cuentas.add(ahorrodeyaG);
		cuentas.add(creditodeyaG);
		cuentas.add(ahorrovaneGB);
		cuentas.add(creditovaneGB);
		
		//1 cajero
		Cajero cajero = new Cajero("Cholula, Puebla", cuentas);
		
		//Realizando operaciones
//		System.out.println(cajero.depositar("Ale Cabrera", 0707, 10000));
//		System.out.println(cajero.transferir(10000, "4152112233", 0606, "4152124589"));
		System.out.println(cajero.buscar("4152124589")[1]);
		
	}

}
