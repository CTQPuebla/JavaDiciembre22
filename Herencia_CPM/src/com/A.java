package com;

public class A {
	//ATRIBUTOS
	int num1;
	String texto;
	
	//CONSTRUCTORES
	public A() {
		
	}
	
	public A(int num1, String texto) {
		super();
		this.num1 = num1;
		this.texto = texto;
	}
	
	//GETTERS AND SETTERS
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
		return "A [num1=" + num1 + ", texto=" + texto + "]";
	}
	
	
	//COMPORTAMIENTO PROPIO DE LA CLASE
	public void primerMetodo() {
		System.out.println("Impresion desde la clase A");
	}
	//metodo nativo
	public void metodoOriginal() {
		System.out.println("Texto original");
	}

}
