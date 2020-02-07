package curso.java.aula17;
import java.util.Scanner;

public class Exercicio13 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			double base, exp;
			
			double resultado = 1;
		
			
			System.out.println("Entre com a base: ");
			base = scan.nextDouble();
			System.out.println("Entre com o expoente: ");
			exp = scan.nextDouble();
			
			for (int i = 1; i <= exp; i++)
			{
				resultado *= base;
			}
			
			System.out.println(resultado);
		}

}
