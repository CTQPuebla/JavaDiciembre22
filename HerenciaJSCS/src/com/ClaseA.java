package com;

public class ClaseA {

	int numero;
	String texto;
	public ClaseA(int numero, String texto) {
		super();
		this.numero = numero;
		this.texto = texto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
	@Override
	public String toString() {
		return "ClaseA [numero=" + numero + ", texto=" + texto + "]";
	}
	public void primerMetodo() {
		System.out.println("Impresion desde Clase A");
	}
	
	//metodo nativo
	public void metodoOriginal() {
		System.out.println("Texto original");
		
		
	}
	
}
