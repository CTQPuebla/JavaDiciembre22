package com;

public class Persona {

	String nombre;
	String sexo;
	int edad;
	
	
	
	
	
	
	
	//notificadores de acceso
	//private - acceso solo desde el interior de la propia clase
	//public - acceso desde dentro y cualquier y algun lugar externo de la clase
	//protected - acceso desde el interior  y algun lugar externo dentro del mismo paquete
	
	
	//static final
	
	
	
	public Persona() {
		

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


	
	
	//metodos propios
	
	public void pensar() {
		System.out.println("pensador..");
		
	}
	
	
}	
	
