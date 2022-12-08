package com;

public class ClaseA {
	public int numero1;
	public String texto;
	
	//Vacio
	public ClaseA() {
		
	}

	//Atributos --------------------
	public ClaseA(int numero1, String texto) {
		super();
		this.numero1 = numero1;
		this.texto = texto;
	}

	//Getters & Setters ------------
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

	//Debugger
	@Override
	public String toString() {
		return "ClaseA [numero1=" + numero1 + ", texto=" + texto + "]";
	}
	
	// Comportamiento de cada clase ------------------
	public void primerMetodo() {
		System.out.println("Impresion de la clase A");
	}
	//Metodo nativo
	public void metodoOriginal() {
		System.out.println("Texto original");
	}
	
}
