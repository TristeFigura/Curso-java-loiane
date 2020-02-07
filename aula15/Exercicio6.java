package curso.java.aula15;
import java.util.Scanner;


public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com 3 números separados por espaço:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a > b && a > c)
		{
			System.out.println("O maior número é: " + a);
		}
		if (b > a && b > c)
		{
			System.out.println("O maior número é: " + b);
		}
		if (c > a && c > b)
		{
			System.out.println("O maior número é: " + c);
		}
	}

}
