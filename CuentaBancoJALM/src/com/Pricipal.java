package com;

import java.util.ArrayList;
import java.util.List;

public class Pricipal {

	public static void main(String[] args) {
		Usuario juanC = new Usuario("Juan Angel", "Cerro Del Silla, Loma Hermosa",
				"01/11/1998", "7444275019", "LOMA981101CY5");
		
		Usuario angelL = new Usuario("Angel Lobato", "Fraccionamiento Las Playas", "1/11/1998", "7444866943", "Loma981101cy5");
		Usuario lionelM = new Usuario("Leonel Messi", "Paris, Francia", "24/Jun/1987", "01 800 PDG", "BARCELONA07");
		Usuario jesusA = new Usuario("Jesus Alberto", "Loma Hermosa, Acapulco", "11/02/2010", "7444612342", "LOMA100211HGRBNN11");
		
		
		Cuenta cuentangel = new Cuenta(angelL, "0111", "01234567899", "Debito", "1234 5678 9101 1123", "01/25", 12500, 5000, 20000);
		Cuenta cuantacreditoangel = new Cuenta(angelL, "0111", "01234567899", "Debito ", "1234 5678 9101 1123", "01/26", 6000, 1000, 10000);
		Cuenta cuentalionel = new Cuenta(lionelM, "1007", "123456789", "Credito", "1478 8520 1321 4569", "02/29", 10000, 1000, 20000);
		Cuenta cuentacreditoLionel = new Cuenta(lionelM, "1452", "0123456789", "Credito", "9876 5432 1001 2345", "03/30", 1000000, 1000, 2000000);
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(cuentangel);
		cuentas.add(cuantacreditoangel);
		cuentas.add(cuentalionel);
		cuentas.add(cuentacreditoLionel);
		
		
		Cajero cajero = new Cajero("Acapulco de Juarez", cuentas);
		System.out.println(cajero.depositar("Angel Lobato", "1234", 10000));
		System.out.println(cajero.transferir(10000,"544545635" , "1234", "88254633"));
		System.out.println(cajero.buscar("88254633")[1]);
		
	}

}
