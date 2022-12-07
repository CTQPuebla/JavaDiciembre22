package com;

public interface OperacionesBancarias {
	
	Object[] buscar(String nombreUser);
	Object[] buscar(String nombreUser, String nip);
	Ticket retirar(String nombreUser, String nip, double monto);
	Ticket depositar(String nombreUser, String nip, double monto);
	Object transferir(double monto, String cuentaOrigen, String nipCuentaO, String cuentaDestino);
	
}
