package com;

public class Ticket {

	String Fecha;
	double monto;
	String Direccion;
	String nombreUser;
	String digitos;
	double saldoDisponible;
	String tipoOperacion;
	
	public Ticket() {
		
	}

	public Ticket(String fecha, double monto, String direccion, String nombreUser, String digitos,
			double saldoDisponible, String tipoOperacion) {
		super();
		Fecha = fecha;
		this.monto = monto;
		Direccion = direccion;
		this.nombreUser = nombreUser;
		this.digitos = digitos;
		this.saldoDisponible = saldoDisponible;
		this.tipoOperacion = tipoOperacion;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getNombreUser() {
		return nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	public String getDigitos() {
		return digitos;
	}

	public void setDigitos(String digitos) {
		this.digitos = digitos;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	@Override
	public String toString() {
		return "Ticket \nFecha=" + Fecha + ", \nmonto=" + monto + ", \nDireccion=" + Direccion + ", \nnombreUser=" + nombreUser
				+ ", \ndigitos=" + digitos + ", \nsaldoDisponible=" + saldoDisponible + ", \ntipoOperacion=" + tipoOperacion
				+ "\n";
	}
	
	
}
