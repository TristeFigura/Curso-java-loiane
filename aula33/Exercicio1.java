package curso.java.aula33;

import curso.java.aula33.Lampada;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
		lampada.mudarEstado();
		lampada.mostrarEstado();
	}

}
