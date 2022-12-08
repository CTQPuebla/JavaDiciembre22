package com;

public class Persona {
	
	public String nombre;
	private String sexo;
	public int edad;
	Object x;
	
//	modificadores de acceso}
//	probate - acceso solo desde el interior de la propia clase
//	public - acceso desde dentro y cualquier lugar externo de la clase
//	protected - acceso desde el interior y algún lugar externo dentro del mismo paquete
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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


//métodos propios

	public void pensar() {
		
	}
	
}