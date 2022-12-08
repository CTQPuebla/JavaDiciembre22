package com;

public class Persona {
	
//	String nombre;
//	String sexo;
//	int edad;
//	Object x;

	
	//Vacio
	public Persona() {
		
	}

	//Todos los atributos
	public Persona(String nombre, String sexo, int edad) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	//Getters & Setters
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
	
	//Metodos propios
	
	public void pensar() {
		System.out.println("thinking...");
	}

	public String nombre;
	private String sexo;
	protected int edad;
	
	
	
	
	
}
