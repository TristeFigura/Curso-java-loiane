package curso.java.aula17;
import java.util.Scanner;

public class Exercicio8 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int num;
			int cont = 1;
			double soma = 0;
			
			for (cont = 0; cont < 5; cont++)
			{
				System.out.println("Entre com um n�mero: ");
				num = scan.nextInt();
				
				soma += num;
			}
			
			double media = soma / cont;
			
			System.out.println("A soma dos 5 n�mero �: " + soma);
			System.out.println("A m�dia dos 5 n�meros �: " + media);
			
		}
}
