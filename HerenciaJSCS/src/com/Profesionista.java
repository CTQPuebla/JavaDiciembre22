package com;

public abstract class Profesionista extends Persona {
// no puedes crear objectos de una clase abstracta, no se puede  implementar
	//tiene al menos un metodo abstracto
	String carrera;
	String titulo;
	String cedula;
	
	public Profesionista() {
		
	}

	public Profesionista(String carrera, String titulo, String cedula) {
		this.carrera = carrera;
		this.titulo = titulo;
		this.cedula = cedula;
	}
	
	

	public Profesionista(String nombre, String sexo, int edad, String carrera, String titulo, String cedula) {
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
	
	//Metodo abstracto no tiene cuerpo--algo que no esta definido
	public abstract void trabajar();
	
	
}
