package com;

public class Cuenta {
	//Usuario, NIP, CLABE, tipoCuenta, numCuenta, vencimiento,
	//saldoDisponible, max, min
	Usuario user;
	String nip;
	String clabe;
	String tipoCuenta;
	String numCuenta;
	String vencimiento;
	double saldoDisponible, max, min;
	
	public Cuenta() {
		
	}

	public Cuenta(Usuario user, String nip, String clabe, String tipoCuenta, String numCuenta, String vencimiento,
			double saldoDisponible, double max, double min) {
		super();
		this.user = user;
		this.nip = nip;
		this.clabe = clabe;
		this.tipoCuenta = tipoCuenta;
		this.numCuenta = numCuenta;
		this.vencimiento = vencimiento;
		this.saldoDisponible = saldoDisponible;
		this.max = max;
		this.min = min;
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

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
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

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	
	@Override
	public String toString() {
		return "Cuenta [user=" + user + ", nip=" + nip + ", clabe=" + clabe + ", tipoCuenta=" + tipoCuenta
				+ ", numCuenta=" + numCuenta + ", vencimiento=" + vencimiento + ", saldoDisponible=" + saldoDisponible
				+ ", max=" + max + ", min=" + min + "]";
	}
	
	
	
}
