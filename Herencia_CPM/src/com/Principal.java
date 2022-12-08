package com;

public class Principal {
	
	public static void main(String[] args) {
		
		A o1 = new A(5, "cinco");
		o1.primerMetodo();
		o1.metodoOriginal();
		
		B o2 = new B();
		o2.primerMetodo();
		o2.metodoOriginal();
//		o2.segundoMetodo();
		
		Persona persona1 = new Persona("Mario","M", 15);
		
//		persona1.sexo = "masculino"; //forma incorrecta de acceder a un atributo privado
		persona1.setSexo("femenino"); //acceso correcto a un atributo private
		
		persona1.nombre = "Laura"; //acceso a un atributo publico;
		persona1.edad = 20; //acceso a un atributo protected
		
		
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getEdad());
		
	}

}
