package com;

public class Principal {

		public static void main(String[] args) {
		
//		ClaseA o1 = new ClaseA(5, "cinco");
//		o1.primerMetodo();
//		o1.metodoOriginal();
		
//		ClaseB o2 = new ClaseB();
//		o2.primerMetodo();
//		o2.metodoOriginal();

		Persona persona1 = new Persona("Mario", "M", 15);
		
//		persona1.sexo("masculino"); forma incorrecta de acceder al atributo privado
		persona1.setSexo("femenino"); //forma correcta
		
		persona1.nombre = "Laura"; //acceso a un atributo público
		persona1.edad = 20; //acceso a un atributo protected
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		
	}	
}

