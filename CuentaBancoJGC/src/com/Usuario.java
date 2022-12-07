package com;

public class Usuario {
	String nombre;
	String direccion;
	//No se registra la edad, si no la fecha de nacimiento ya
	//que es un dato estático
	String fechaNac;
	String telefono;
	String rfc;
	
	public Usuario() {
		
	}

	public Usuario(String nombre, String direccion, String fechaNac, String telefono, String rfc) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaNac = fechaNac;
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

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
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
		return "Usuario [nombre=" + nombre + ", direccion=" + direccion + ", fechaNac=" + fechaNac + ", telefono="
				+ telefono + ", rfc=" + rfc + "]";
	}
	
}
