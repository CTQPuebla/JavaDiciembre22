package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		Usuario juanC = new Usuario("Juan Carlos", "La Margarita", "05/02/1986", "2254558579", "JCLAJS56");
		Usuario rominaD = new Usuario("Romina Dominguez", "Enrique Segoviano", "28/08/2000", "5552220088", "RDG4545L");
		Usuario cristianoR = new Usuario("Cristiano Ronaldo", "Portugal", "05/02/1985", "1234567890", "CRDA568Q");
		
		Cuenta debitoJuanC = new Cuenta(juanC, "1234", "458796615545L5", "Debito", "544545635", "12/12/2050", 50000, 1000, 100000);
		Cuenta ahorroRominaD = new Cuenta(rominaD, "4556", "4565421135458", "Ahorros", "55658988", "12/12/2050", 20000, 1000, 50000);
		Cuenta debitoCristianoR = new Cuenta(cristianoR, "9878", "987854564565", "Debito", "12879635", "12/12/2050", 150000, 50000, 1000000);
		Cuenta creditoCristianoR = new Cuenta(cristianoR, "9878", "5558789665448", "Credito", "99658755", "12/12/2050", 100000, 5000, 200000);
		Cuenta ahorroCristianoR = new Cuenta(cristianoR, "9878", "332445454812", "Ahorro", "88254633", "12/12/2050", 3000000, 100000, 10000000);
		
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(debitoJuanC);
		cuentas.add(ahorroRominaD);
		cuentas.add(debitoJuanC);
		cuentas.add(creditoCristianoR);
		cuentas.add(ahorroCristianoR);
		
		//System.out.println(debitoJuanC);
		
		Cajero cajero = new Cajero("Cholula, Pue", cuentas);
		
		System.out.println(cajero.depositar("Juan Carlos", "1234", 10000));
		System.out.println(cajero.transferir(10000,"544545635" , "1234", "88254633"));
		System.out.println(cajero.buscar("88254633")[1]);
		
		
		
		
	}

}
