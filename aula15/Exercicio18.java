package curso.java.aula15;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número inteiro: ");
		int a = scan.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("Este é um número par.");
		}
		else
		{
			System.out.println("Este é um número ímpar.");
		}

	}

}
