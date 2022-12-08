package com;

public class Principal {

	public static void main(String[] args) {
		ClaseA o1 = new ClaseA(5, "Cinco");
		o1.primerMetodo();
//		o1.segundoMétodo(); //No se puede acceder porque no
							//es bidireccional la herencia
		o1.metodoOriginal();
		
		ClaseB o2 = new ClaseB();
		o2.primerMetodo();
		o2.metodoOriginal();
		
		Persona persona1 = new Persona("Mario", "M", 15);
		persona1.edad = 10; //Acceso a un atributo protected
		persona1.nombre = "Wala"; //Acceso a un atributo público
//		persona1.sexo = "fem"; //Forma incorrecta de acceder a
							   //atributo privado
		persona1.setSexo("Femenino"); //Acceso correcto a un
									 //atributo private
		

	}

}
