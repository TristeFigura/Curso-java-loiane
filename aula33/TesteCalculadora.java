package curso.java.aula33;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		
		System.out.println(calc.soma(4, 6));
		
			

	}

}
