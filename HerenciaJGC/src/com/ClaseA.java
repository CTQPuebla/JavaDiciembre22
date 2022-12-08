package com;

public class ClaseA {
	int num1;
	String texto;
	
	public ClaseA() {

	}

	public ClaseA(int num1, String texto) {
		super();
		this.num1 = num1;
		this.texto = texto;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		return "ClaseA [num1=" + num1 + ", texto=" + texto + "]";
	}
	
	//Comportamiento propio
	public void primerMetodo() {
		System.out.println("Impresión desde la Clase A.");
	}
	
	public void metodoOriginal() {
		System.out.println("Texto original.");
	}
	
}
