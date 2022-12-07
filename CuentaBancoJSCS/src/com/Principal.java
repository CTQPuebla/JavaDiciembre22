package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Usuario samael = new Usuario("Samael catalan", "Centro", "17/01/2002", "7443127402", "CASA170102HGRTLM1");
		Usuario ricardo = new Usuario("RIcardo Avendaño", "Puebla ceteq", "05/06/1993", "2225489644", "rica2525HPTK5");
		Usuario lobato = new Usuario("Angel Lobato", "Caleta", "14/09/1998", "7445856598", "ANHGFGK554");
		
		Cuenta debitoSamael = new Cuenta(samael, "1701", "54151512512326542", "Debito","7251652255", "07/12/2022", 1000000, 50000,2000000 );
		Cuenta ahorroRicardo = new Cuenta(ricardo, "5285", "84611346554135", "Ahorro", "5522878888","08/12/2022", 50000, 2000, 100000);
		
		
		
		List<Cuenta> cuentas = new ArrayList<Cuenta>();
		cuentas.add(debitoSamael);
		
		
		Cajero cajero= new Cajero("Cholula, Puebla", cuentas);
		
		
		
	}
	
}
