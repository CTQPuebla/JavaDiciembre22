package com;

public class Cuenta {
	
//	Usuario, password, Clabe, tipo de cuenta, #, vencimiento, saldoDisponible, max, min
	
	Usuario user;
	String nip;
	String clabe;
	String tipoCuenta;
	String numeroCuenta;
	String vencimiento;
	double saldoDisponible;
	double min;
	double max;
	
	
	public Cuenta() {
		
	}

	public Cuenta(Usuario user, String nip, String clabe, String tipoCuenta, String numeroCuenta, String vencimiento,
			double min, double max, int i) {
		
		this.user = user;
		this.nip = nip;
		this.clabe = clabe;
		this.tipoCuenta = tipoCuenta;
		this.numeroCuenta = numeroCuenta;
		this.vencimiento = vencimiento;
		this.saldoDisponible = saldoDisponible;
		this.min = min;
		this.max = max;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getClabe() {
		return clabe;
	}

	public void setClabe(String clabe) {
		this.clabe = clabe;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	@Override
	public String toString() {
		return "Cuenta [user=" + user + ", nip=" + nip + ", clabe=" + clabe + ", tipoCuenta=" + tipoCuenta
				+ ", numeroCuenta=" + numeroCuenta + ", vencimiento=" + vencimiento + ", saldoDisponible="
				+ saldoDisponible + ", min=" + min + ", max=" + max + "]";
	}

}