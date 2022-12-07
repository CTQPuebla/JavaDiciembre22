package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario ("Joseph","11 poniente 710", "13/01/1999","2216265325","CARJ990113KW2");
		Usuario u2 = new Usuario ("Pedro","23 poniente ", "18/03/1994","2216434325","HJHP940318JKI");
		
		
		Cuenta c1 = new Cuenta (u1, "2345","34872388992","debito","12938482","10/26",25000,1000,100000);
		Cuenta c2 = new Cuenta  (u2, "23465","34872388993","debito","12938483","10/27",60000,1000,100000);
		
		List<Cuenta> cuentas = new ArrayList <Cuenta> ();
		cuentas.add(c1);
		cuentas.add(c2);

	System.out.println(c1);
	
	Cajero cajero = new Cajero ("Cholula", cuentas);
	
	System.out.println(cajero.depositar("Joseph", "2345", 10000));

	}

}
