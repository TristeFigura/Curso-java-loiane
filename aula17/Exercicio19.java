package curso.java.aula17;
import java.util.Scanner;

public class Exercicio19 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int numNotas;
			int i;
			double notas;
			int soma = 0;
			
			System.out.println("Entre com o n�mero de notas. ");
			numNotas = scan.nextInt();
			
			for (i = 0; i < numNotas; i++)
			{
				System.out.println("Entre com as notas: ");
				notas = scan.nextDouble();
				soma += notas;
			}
			double m�dia = soma/numNotas;
			System.out.println("A m�dia das notas �: " + m�dia);

		}

}
