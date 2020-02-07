package curso.java.aula15;
import java.util.Scanner;


public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número correspodente a um ano:");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0)
		{
			System.out.println("Este é um ano bissexto.");
		}
		else
		{
			System.out.println("Este não é um ano bissexto.");
		}

	}

}
