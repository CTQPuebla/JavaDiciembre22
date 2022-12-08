package com;

//Clase hija de A (herencia de A)
public class ClaseB extends ClaseA {
	
	public ClaseB() {
		
	}
	
	public void segundoMetodo() {
		System.out.println("Impresión desde la clase B.");
	}

	@Override //Sobreescritura
	public void metodoOriginal() {
		System.out.println("Texto desde la clase B.");
	}
	
}
