package com;

public class ClaseB extends ClaseA {
public ClaseB() {
}
public void segundoMetodo() {
	System.out.println("Impresion del segundo metodo");
	
}
@Override // sobreescritura
public void metodoOriginal() {
	System.out.println("Texto de la B");
}

}
