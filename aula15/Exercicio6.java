package curso.java.aula15;
import java.util.Scanner;


public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com 3 n�meros separados por espa�o:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		if (a > b && a > c)
		{
			System.out.println("O maior n�mero �: " + a);
		}
		if (b > a && b > c)
		{
			System.out.println("O maior n�mero �: " + b);
		}
		if (c > a && c > b)
		{
			System.out.println("O maior n�mero �: " + c);
		}
	}

}
