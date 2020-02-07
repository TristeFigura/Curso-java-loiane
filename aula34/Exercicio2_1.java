package curso.java.aula34;

public class Exercicio2_1 {
	
		public static void main(String[] args) {
			
			imprimirTela(Calculadora2.somar(1, 2));
			imprimirTela(Calculadora2.subtrair(2, 1));
			imprimirTela(Calculadora2.multiplicar(2, 2));
			imprimirTela(Calculadora2.dividir(4, 2));
			imprimirTela(Calculadora2.potencia(2, 3));
			
		}
		
		static void imprimirTela(int num) {
			System.out.println(num);
		}

}
