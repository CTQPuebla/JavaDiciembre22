package com;

public class Main {
public static void main(String[] args) {
	
	ClaseA o1 = new ClaseA(5, "Cinco");
	o1.primerMetodo();
	o1.metodoOriginal();
	
	ClaseB o2 = new ClaseB();
	o2.primerMetodo();
	o2.metodoOriginal();
	Persona persona1 =new Persona("Dulce", "Femenino", 21);
	persona1.edad = 21;
	persona1.setSexo("Femenino");
	
	System.out.println(persona1.getNombre());
	System.out.println(persona1.getEdad());
	
	
}

}
