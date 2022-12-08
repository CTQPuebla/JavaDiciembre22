package com;

public class Principal {

	public static void main(String[] args) {
		
		
		Persona persona1 = new Persona("Jose", "M", 20);
		persona1.getEdad();
		//persona1.sexo ="masculino"; // forma incorrecta de acceder a un atributo privado
		persona1.setSexo("Masculino");//acceso correct0o a un atributo publico
		
		persona1.nombre ="Ismael";//acceso a un atributo publico
		persona1.edad = 20;//acceso a un atributo protected
		persona1.setSexo("Masculino");
		
		
		
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		
//		ClaseA o1 = new ClaseA(5,"cinco");
//		o1.primerMetodo();
//		o1.metodoOriginal();
//		
//		ClaseB o2 = new ClaseB(6, "seis");
//		o2.primerMetodo();
//		o2.metodoOriginal();
		
		
		
		
	}
	
	
	
}
