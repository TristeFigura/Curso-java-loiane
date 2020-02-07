package curso.java.aula17;
import java.util.Scanner;

public class Exercicio14 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int num;
			int par = 0;
			int ímpar = 0;
			
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Entre com um número.");
				num = scan.nextInt();
				if (num % 2 == 0)
				{
					par++;
				}
				else
				{
					ímpar++;
				}
			}
			
			System.out.println("A quantidade de números pares é: " + par);
			System.out.println("A quantidade de números ímpares é: " + ímpar);
		}

}
