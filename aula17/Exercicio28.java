package curso.java.aula17;
import java.util.Scanner;

public class Exercicio28 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int num, i;
			int b = 0;
			System.out.println("Programa para verificar se um número é primo.");
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			
			for (i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					b++;
					System.out.println("O número é divisível por: " + i + ". Logo não é um número primo.");
				}
				
			}
			
			if (b == 0)
			{
				System.out.println(num + ", é um número primo.");
			}
		}

}
