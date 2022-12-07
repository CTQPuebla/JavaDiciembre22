package com;

import java.util.List;

public class Cajero implements OperacionBancaria {

	String direccion;

	List<Cuenta> cuentas;
	//Scanner sc = new Scanner(System.in);

	public Cajero(String string, List<Cuenta> cuentas2) {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object[] buscar(String numCuenta) {
		Object[] respuesta = new Object[2];
		Cuenta cuenta = null; //objeto comodin
		respuesta[0] = 0;
		respuesta[1] = cuenta;
		
		//Para buscar, iteramos a lo largo de la lista
		for (int i = 0; i < cuentas.size(); i++) {
			
			//Pregunta si existe una cuenta con ese usuario y el nip
			if (cuentas.get(i).getNumeroCuenta().equals(numCuenta)) {
				cuenta = cuentas.get(i);//asigna la cuenta encontrada a la variable de salida
				respuesta[1] = cuenta;
				respuesta[0] = i;
				break;
			}
		}		
		return respuesta;
	}
	

	@Override
	public Object[] buscar(String nombreUser, String nip) {
		Object[] respuesta = new Object[2];
		Cuenta cuenta = null; //objeto comodin
		respuesta[0] = 0;
		respuesta[1] = cuenta;
		
		//Para buscar, iteramos a lo largo de la lista
		for (int i = 0; i < cuentas.size(); i++) {
			
			//Pregunta si existe una cuenta con ese usuario y el nip
			if ((cuentas.get(i).getUser().getNombre().equals(nombreUser) || cuentas.get(i).getNumeroCuenta().equals(nombreUser)) 
					&& cuentas.get(i).getNip().equals(nip)) {
				cuenta = cuentas.get(i);//asigna la cuenta encontrada a la variable de salida
				respuesta[1] = cuenta;
				respuesta[0] = i;
				break;
			}	 
		}		
		return respuesta;
	}

	@Override
	public Ticket retirar(String nombreUser, String nip, double monto) {
		
		Ticket ticket = null;
		if (this.buscar(nombreUser, nip)[1] != null) {
			
			//Llenando el objeto con los datos de la cuenta
			Cuenta cuenta = (Cuenta) this.buscar(nombreUser, nip)[1];
			int index = (int) this.buscar(nombreUser, nip)[0];
			
			if(cuenta.getSaldoDisponible() < monto) {
				System.out.println("Saldo insuficiente");
			}else if ((cuenta.getSaldoDisponible() - monto) < cuenta.getMin()) {
				System.out.println("El retiro excede el minimo permitido");
			}else {
				//Retiro
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible()-monto);
				this.cuentas.set(index, cuenta);
				return new Ticket("hoy", monto, this.direccion, nombreUser, digitos(cuenta), cuenta.getSaldoDisponible(), "Retiro");
			}
				
		}else {
			System.out.println("No existe una cuenta con esos datos");
		}
		
		return ticket;
	}

	@Override
	public Ticket depositar(String nombreUser, String nip, double monto) {
		
		Ticket ticket = null;
		
		//Valida que exista la cuenta
		if (this.buscar(nombreUser, nip)[1] != null) {
			
			Cuenta cuenta = (Cuenta) this.buscar(nombreUser, nip)[1]; //Objeto cuenta lleno
			int index = (int) this.buscar(nombreUser, nip)[0];
			
			//Valida que la cantidad por si sola no se pase del maximo permitido
			if (cuenta.getMax() < monto) {
				System.out.println("La cantidad excede el maximo permitido");
				//Validar que el saldo actual mas el monto no se pase del maximo
			}else if ((cuenta.getSaldoDisponible() + monto) > cuenta.getMax()) {
				System.out.println("El saldo disponible mas el deposito se exceden del maximo permitido");
			}else {
				//Deposito
				cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + monto);
				this.cuentas.set(index, cuenta);
				return new Ticket("Hoy", monto, this.direccion, nombreUser, digitos(cuenta), cuenta.getSaldoDisponible(), "Deposito");
			}	
		}else {
			System.out.println("No existe una cuenta con esos datos");
		}
		return ticket;
	}

	@Override
	public Object transferir(double monto, String cuentaOrigen, String nipCuentaO, String cuentaDestino) {
		Ticket ticket = null;
		
		if (this.buscar(cuentaOrigen, nipCuentaO)[1] != null && this.buscar(cuentaDestino)[1] != null)  {
			Cuenta cuentaO = (Cuenta) this.buscar(cuentaOrigen, nipCuentaO)[1];
			Cuenta cuentaD = (Cuenta) this.buscar(cuentaDestino)[1];
			int indexO = (int) this.buscar(cuentaOrigen, nipCuentaO)[0];
			int indexD = (int) this.buscar(cuentaDestino)[0];
			
			if (cuentaO.getSaldoDisponible() < monto) {
				System.out.println("Saldo insuficiente en la cuenta origen");
				System.out.println("Val1");
			}else if ((cuentaO.getSaldoDisponible() - monto) < cuentaO.getMin()) {
				System.out.println("La transferencia excede el minimo permitido en la cuenta origen");
				System.out.println("Val2");
			}else if (cuentaD.getMax() < monto) {
				System.out.println("La transferencia excede el maximo permitido en la cuenta destino");
				System.out.println("Val3");
			}else if ((cuentaD.getSaldoDisponible() + monto) > cuentaD.getMax()) {
				System.out.println("El saldo disponible mas la transferencia exceden el maximo en la cuenta destino");
				System.out.println("Val4");
			}else {
				System.out.println("Transferencia exitosa");
				//Transferencia
				cuentaO.setSaldoDisponible(cuentaO.getSaldoDisponible() - monto);
				cuentaD.setSaldoDisponible(cuentaD.getSaldoDisponible() + monto);
				this.cuentas.set(indexO, cuentaO);
				this.cuentas.set(indexD, cuentaD);
				
				ticket = new Ticket("Hoy", monto,
						this.direccion,
						cuentaO.getUser().getNombre(),
						digitos(cuentaO),
						cuentaO.getSaldoDisponible(),
						"Transferencia");
				return ticket;
			}
		}
		

		return ticket;
	}
	
	//CONSTRUCTOR
	public Cajero(String direccion, List<Cuenta> cuentas) {
		super();
		this.direccion = direccion;
		this.cuentas = cuentas;
	}

	//GETTERS AND SETTERS
	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public List<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}


	@Override
	public String toString() {
		return "Cajero [direccion=" + direccion + ", cuentas=" + cuentas + "]";
	}
	

	

	

}