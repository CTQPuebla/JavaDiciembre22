package com;
      //Clase hija A (hereda A)
public class ClaseB extends ClaseA {

	public ClaseB(int numero, String texto) {
		super(numero, texto);
		
	}
	
	public void segundoMetodo() {
		System.out.println("impresion desde la clase B");
		
		
		}
	@Override  //sobreescritura
	public void metodoOriginal() {
		System.out.println("Texto original");
		
}
	
	public void otroMetodo() {
		System.out.println("Otra cosa");
	}
}
