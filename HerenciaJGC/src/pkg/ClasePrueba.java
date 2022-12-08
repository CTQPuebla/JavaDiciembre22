package pkg;

import com.Persona;

public class ClasePrueba {
	public static void main(String[] args) {
		Persona p = new Persona();
		p.nombre = "yoyoyoyoy"; //Acesible por ser public
//		p.sexo = "ayayaya"; //No accesible por ser private
//		p.edad = 10000; //No accesible por ser protected
						//(fuera del paquete com)
	}
	
}
