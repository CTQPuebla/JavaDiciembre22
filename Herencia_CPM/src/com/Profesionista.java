package com;

public abstract class Profesionista extends Persona {
	
	//ATRIBUTOS
	String carrera;
	String titulo;
	String Cedula;
	
	//CONSTRUCTORES
	public Profesionista() {
		
	}

	public Profesionista(String carrera, String titulo, String cedula) {
		this.carrera = carrera;
		this.titulo = titulo;
		Cedula = cedula;
	}
	
	
	public Profesionista(String nombre, String sexo, int edad, String carrera, String titulo, String cedula) {
		super(nombre, sexo, edad);
		this.carrera = carrera;
		this.titulo = titulo;
		Cedula = cedula;
	}
	
	
	//GETTERS AND SETTERS
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
		return Cedula;
	}

	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	
	//COMPORTAMIENTO PROPIO
	public abstract void trabajar();
	
}
