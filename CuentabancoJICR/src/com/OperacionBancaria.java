package com;

public interface OperacionBancaria {
	
	Object[] buscar(String nombreUser, String nip);
	Ticket retirar (String nombreUser, String nip, double monto);
	Ticket depositar (String nombreUser, String nip, double monto);
	Object transferir (double monto,String cuentaOrigen, String nipCuentaO, String cuentaDestino, String nipCuentaD);
}
