package pkg;

import com.Persona;

public class ClasePrueba {
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.nombre = "fsdfsdf"; //accesible por ser public
//		p.sexo = "sdfsdf"; //no accesible por ser private
//		p.edad = 38; //no accesible por ser protected (fuera del paquete com)
		
	}

}
