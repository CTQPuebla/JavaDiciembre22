package com;

public class Ticket {
	
	String fecha;
	double monto;
	String direccion;
	String nombreUser;
	String digitos;
	double saldoDisponible;
	String tipoOperacion;
	
	
	public Ticket() {
		
	}

	public Ticket(String fecha, double monto, String direccion, String nombreUser, String digitos,
			double saldoDisponible, String tipoOperacion) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.direccion = direccion;
		this.nombreUser = nombreUser;
		this.digitos = digitos;
		this.saldoDisponible = saldoDisponible;
		this.tipoOperacion = tipoOperacion;
	}

	
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		return "Ticket [fecha=" + fecha + ", monto=" + monto + ", direccion=" + direccion + ", nombreUser=" + nombreUser
				+ ", digitos=" + digitos + ", saldoDisponible=" + saldoDisponible + ", tipoOperacion=" + tipoOperacion
				+ "]";
	}

	
}
