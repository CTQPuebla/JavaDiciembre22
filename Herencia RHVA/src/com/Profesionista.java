package com;

public abstract class Profesionista extends Persona{
	
//no puedes crear objetos de una clase abstracta 
// una clase abstracta es aquella que tiene un metodo abstracto
	
	String carrera;
	String titulo;
	String cedula;
	
	public Profesionista( ) {
		
	}

	public Profesionista(String carrera, String titulo, String cedula) {
		super();
		this.carrera = carrera;
		this.titulo = titulo;
		this.cedula = cedula;
	}
	
	

	public Profesionista(String nombre, String sexo, int edad, Object x, String carrera, String titulo, String cedula) {
		super(nombre, sexo, edad);
		this.carrera = carrera;
		this.titulo = titulo;
		this.cedula = cedula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	//metodo abstracto es un cuerpo sin implementacion
	public abstract void trabajar();
	
	
}
