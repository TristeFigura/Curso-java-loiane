package curso.java.aula17;
import java.util.Scanner;

public class Exercicio14 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int num;
			int par = 0;
			int �mpar = 0;
			
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Entre com um n�mero.");
				num = scan.nextInt();
				if (num % 2 == 0)
				{
					par++;
				}
				else
				{
					�mpar++;
				}
			}
			
			System.out.println("A quantidade de n�meros pares �: " + par);
			System.out.println("A quantidade de n�meros �mpares �: " + �mpar);
		}

}
