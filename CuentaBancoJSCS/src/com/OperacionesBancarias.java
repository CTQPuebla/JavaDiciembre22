package com;

public interface OperacionesBancarias {

	Object[] buscar(String nombreuser, String nip);
	Ticket retirar(String nombreuser, String nip,double monto);
	Ticket depositar(String nombreuser, String nip,double monto);
	Object transferir(double monto, String cuentaOrigen, String nipCuentaO, String cuentaDestino, String nipCuentaD);
	
	
	
}
