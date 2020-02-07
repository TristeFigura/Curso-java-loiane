package curso.java.aula17;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i, a;
		int b = 0;
		
		System.out.println("Entre com o número correspondente a tabuada: ");
		a = scan.nextInt();
		
		for (i = 0; i <= 10; i++)
		{
			b = a * i;
			System.out.println("Segue tabuada de " + a + " x " + i + " = " + b);
		}
	}
}
