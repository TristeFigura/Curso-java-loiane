package curso.java.aula17;
import java.util.Scanner;

public class Exercicio28 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int num, i;
			int b = 0;
			System.out.println("Programa para verificar se um n�mero � primo.");
			System.out.println("Entre com um n�mero: ");
			num = scan.nextInt();
			
			for (i = 2; i < num; i++)
			{
				if (num % i == 0)
				{
					b++;
					System.out.println("O n�mero � divis�vel por: " + i + ". Logo n�o � um n�mero primo.");
				}
				
			}
			
			if (b == 0)
			{
				System.out.println(num + ", � um n�mero primo.");
			}
		}

}
