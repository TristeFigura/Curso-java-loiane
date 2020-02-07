package curso.java.aula34;

public class Contador {
	
	private static int cont;

	public Contador() {
		cont++;
	}

	
	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	
	
	public static void incrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont = 0;
	}
	
	public static int obterValor() {
		return cont;
	}
	

}
