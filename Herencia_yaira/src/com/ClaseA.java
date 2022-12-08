package com;

public class ClaseA {
	
	int numero1;
	String texto;
	
	public ClaseA() {
		
	}

	public ClaseA(int numero1, String texto) {
		super();
		this.numero1 = numero1;
		this.texto = texto;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "ClaseA [numero1=" + numero1 + ", texto=" + texto + "]";
	}

	public void primerMetodo() {
		System.out.println("Impresión desde la Clase A");
	}
	
	public void metodoOriginal() {
		System.out.println("Impresión");
		
	
	}
}

