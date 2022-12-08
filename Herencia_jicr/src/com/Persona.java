package com;

public class Persona {

	public String nombre;
	private String sexo;
	protected int edad;
//	Object x;
	//modificadores de acceso 

	public Persona () {
		
	}


	public Persona(String nombre, String sexo, int edad) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	//metodos propios
	public void pensar() {
		System.out.println("thinking...");
	}
	
	
}
