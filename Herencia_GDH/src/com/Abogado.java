package com;

public class Abogado extends Profesionista implements Metodos{
	
	String especialidad;
	
	public Abogado() {
		
	}
		
	//atributos

	public Abogado(String especialidad) {
		super();
		this.especialidad = especialidad;
	}

	//Getters & Setters

	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarImpuestos() {
		// TODO Auto-generated method stub
		
	}
	
	

}
