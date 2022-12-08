package com;

public class Principal {
	public static void main(String[] args) {
		
//		ClaseA o1 = new ClaseA(5, "cinco");
//		o1.primerMetodo();
//		o1.metodoOriginal();
//		
//		ClaseB o2 = new ClaseB();
//		o2.primerMetodo();
//		o2.metodoOriginal();
//		//o2.segundoMetodo();
		
		Persona persona1 = new Persona();
		
		
		//persona1.sexo = "masculino" //Forma incorrecta de acceder a un atributo privado
		persona1.setSexo("Fem"); //acceso correcto a un atributo private
		persona1.nombre = "Laura"; //Acceso a un atributo publico
		persona1.edad=13;
	}

}
