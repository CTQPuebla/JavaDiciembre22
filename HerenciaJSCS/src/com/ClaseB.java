package com;

public class ClaseB extends ClaseA{

	public ClaseB(int numero, String texto) {
		super(numero, texto);
		// TODO Auto-generated constructor stub
	}

	public void segundoMetodo() {
		System.out.println("Impresion desde Clase B");
	}

	@Override // sobreescritura
	public void metodoOriginal() {
		System.out.println("Texto de la B");
		
	}
	
	public void otroMetodo() {
		System.out.println("Otra cosa");
	}
	
}
