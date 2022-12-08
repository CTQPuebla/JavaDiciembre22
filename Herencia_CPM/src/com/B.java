package com;

//Clase jiha de A (hereda de A)
public class B extends A { 
	
	public B() {
		
	}

	public void segundoMetodo() {
		System.out.println("Impresion desde la clase B");
	}
	
	@Override //sobre-escritura
	public void metodoOriginal() {
		System.out.println("Texto de la B");
	}
	
	public void otroMetodo() {
		System.out.println("Otra cosa");
	}
}
