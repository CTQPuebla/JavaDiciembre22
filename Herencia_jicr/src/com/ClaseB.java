package com;


//Clase hija de A (hereda de A)
public class ClaseB extends ClaseA {
	
	public ClaseB () {
		
	}

	
	public void segundoMetodo () {
		System.out.println("Impresion desde la clase B");
	}
	@Override //sobre escritura
	
	public void metodoOriginal() {
		System.out.println("texto de la 8");
	}
	
	public void otroMetodo() {
		System.out.println("Otra cosa");
	}
}
