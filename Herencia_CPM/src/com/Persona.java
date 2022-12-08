package com;

public class Persona {
	
	//ATRIBUTOS
	public String nombre;
	private String sexo;
	protected int edad;
	
	
	//MODIFICADORES DE ACCESO
	// private - acceso solo desde el interior de la propia clase
	// public - acceso desde dentro y cualquier lugar externo de la clase
	// protected - acceso desde el interior y algun lugar externo dentro del mimso paquete
	
	
	
	
	//CONSTRUCTORES
	public Persona() {
		
	}

	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	//GETTERS AND SETTERS
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
	
	//METODOS PROPIOS
	public void pensar() {
		System.out.println("thinking ...");
	}

}
