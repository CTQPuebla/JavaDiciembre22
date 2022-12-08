package com;

//Clase hija de A (hereda de A)
public class ClaseB extends ClaseA{
	public ClaseB() {}
	
	public void segundoMetodo() {
		System.out.println("Impresion de la clase B");
		
	}
	
	@Override //Sobreescritura
	public void metodoOriginal() {
		System.out.println("Texto de la B");
	}
	
	
	public void otroMetodo() {
		System.out.println("Otra cosa");
	}
}
