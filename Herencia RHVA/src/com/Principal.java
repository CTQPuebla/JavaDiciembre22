package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		ClaseA o1 = new ClaseA(5,"cinco");
//		o1.primerMetodo();
//		o1.metodoOriginal();
//		
//	
//		ClaseB o2 = new ClaseB(6,"seis");
//		o2.primerMetodo();
//		o2.metodoOriginal();

		Persona persona1 = new Persona("maeio", "M", 15);
		
		//persona1.sexo ="masculino"; //forma incorrcta de acceder a un atributo privado
		persona1.setSexo("femenino"); //acceso a un atributo private
		
		persona1.nombre = "laura"; //acceso a un atributo publico
		persona1.edad = 20; //acceso a un atributo protected
		
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		
		
		
	}
	
}
