package com;

public class Usuario {

	String nombre;
	String direccion;
	String fechaNacimiento;
	String telefono;
	String rfc;
	
		public Usuario () {
		
	}


	public Usuario(String nombre, String direccion, String fechaNacimiento, String telefono, String rfc) {
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.rfc = rfc;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getRfc() {
		return rfc;
	}


	public void setRfc(String rfc) {
		this.rfc = rfc;
	}


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", direccion=" + direccion + ", fechaNacimiento=" + fechaNacimiento
				+ ", telefono=" + telefono + ", rfc=" + rfc + "]";
	}
	
	
	
	
}
