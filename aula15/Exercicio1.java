package curso.java.aula15;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		double a = scan.nextDouble();
		
		System.out.println("Digite outro n�mero:");
		double b = scan.nextDouble();
		
		if (a > b)
		{
			System.out.println("O maior n�mero � " + a);
		}
		else
		{
			System.out.println("O maior n�mero � " + b);
		}
			
		

	}

}
