package curso.java.aula15;
import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com 3 números separados por espaço:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a > b && a > c && b > c)
		{
			System.out.println("O maior número é: " + a);
			System.out.println("O menor número é: " + c);
		}
		if (a > b && a > c && b < c)
		{
			System.out.println("O maior número é: " + a);
			System.out.println("O menor número é: " + b);
		}
		if (b > a && b > c && a > c)
		{
			System.out.println("O maior número é: " + b);
			System.out.println("O menor número é: " + c);
		}
		if (b > a && b > c && a < c)
		{
			System.out.println("O maior número é: " + b);
			System.out.println("O menor número é: " + a);
		}
		if (c > a && c > b && a > b)
		{
			System.out.println("O maior número é: " + c);
			System.out.println("O menor número é: " + b);
		}
		if (c > a && c > b  && a < b)
		{
			System.out.println("O maior número é: " + c);
			System.out.println("O menor número é: " + a);
		}
	}

}