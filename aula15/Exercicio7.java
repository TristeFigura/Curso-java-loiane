package curso.java.aula15;
import java.util.Scanner;


public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com 3 n�meros separados por espa�o:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a > b && a > c && b > c)
		{
			System.out.println("O maior n�mero �: " + a);
			System.out.println("O menor n�mero �: " + c);
		}
		if (a > b && a > c && b < c)
		{
			System.out.println("O maior n�mero �: " + a);
			System.out.println("O menor n�mero �: " + b);
		}
		if (b > a && b > c && a > c)
		{
			System.out.println("O maior n�mero �: " + b);
			System.out.println("O menor n�mero �: " + c);
		}
		if (b > a && b > c && a < c)
		{
			System.out.println("O maior n�mero �: " + b);
			System.out.println("O menor n�mero �: " + a);
		}
		if (c > a && c > b && a > b)
		{
			System.out.println("O maior n�mero �: " + c);
			System.out.println("O menor n�mero �: " + b);
		}
		if (c > a && c > b  && a < b)
		{
			System.out.println("O maior n�mero �: " + c);
			System.out.println("O menor n�mero �: " + a);
		}
	}

}