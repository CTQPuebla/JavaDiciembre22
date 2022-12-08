package com;

public class Abogado extends Profesionista implements Metodos {

	//ATRIBUTOS
	String especialidad;
	
	//CONSTRUCTORES
	public Abogado() {
		
	}
	
	public Abogado(String especialidad) {
		this.especialidad = especialidad;
	}

	//GETTERS AND SETTERS
	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public void trabajar() {
		
	}

	@Override
	public void pagarImpuestos() {
		// TODO Auto-generated method stub
		
	}

}
