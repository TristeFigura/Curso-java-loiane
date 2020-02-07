package curso.java.aula17;
import java.util.Scanner;

public class Exercicio15 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			double seq;
			double primeiro = 1;
			double segundo = 1;
			double prox;
			
			System.out.println("Entre com o n-ésimo termo da sequência de Fibonacci.");
			seq = scan.nextInt();
			
			System.out.println(primeiro);
			System.out.println(segundo);
			
			for (int i = 3; i <= seq; i++)
			{
				prox = primeiro + segundo;
				primeiro = segundo;
				segundo = prox;
				System.out.println(prox);
			}
		}

}
