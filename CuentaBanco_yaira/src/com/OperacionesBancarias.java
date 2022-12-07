package com;

public interface OperacionesBancarias {
	
	Cuenta buscar(String nombreUser, String nip);
	Ticket retirar(String nombreUser, String nip, double monto);
	Ticket depositar(String nombreUser, String nip, double monto);
	Object transferir(double monto, String cuentaOrigen, String nipCuenta0, String cuentaDestino, String nipCuentaD);
	Object[] buscar(String numCuenta);


}
