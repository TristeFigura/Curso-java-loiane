package curso.java.aula15;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com três números separados por espaço:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
	if 	(a <= b && a <= c && b <= c)
		// c b a
	{
		System.out.println(c + " - " + b + " - " + a);
	}
	else if (a <= b && a <= c && c <= b)
		// b c a
	{
		System.out.println(b + " - " + c + " - " + a);
	}
	else if (b <= a && b <= c && c <= a)
		// a c b
	{
		System.out.println(a + " - " + c + " - " + b);
	}
	else if (b <= a && b <= c && a <= c)
		// c a b
	{
		System.out.println(c + " - " + a + " - " + b);
	}
	else if (c <= a && c <= b && b <= a)
		// a b c
	{
		System.out.println(a + " - " + b + " - " + c);
	}
	else if (c <= a && c <= b && a <= b)
		// b a c
	{
		System.out.println(b + " - " + a + " - " + c);
	}
 }
}
