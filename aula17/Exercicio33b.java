package curso.java.aula17;
import java.util.Scanner;

public class Exercicio33b {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			double n, i, j;
			double soma = 0;
			System.out.println("Digite o e-nésimo termo da série.");
			n = scan.nextDouble();
			
			for (i = 1, j = 1; i <= n; i++, j += 2)
			{
				System.out.print(i + "/" + j + " + ");
				soma += i/j;
			}
			System.out.println(soma);
		}
}
