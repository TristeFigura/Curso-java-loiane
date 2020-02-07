package curso.java.aula17;
import java.util.Scanner;

public class Exercicio18 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int num;
				int c, i;
				int primo = 0;
				boolean valido = true;
				
				System.out.println("Entre com um número: ");
				num = scan.nextInt();
				
				for (i = 2; i < num; i++)
				{
					if (num % i == 0)
					{
						System.out.println("Não é primo, divisível por " + i);
						valido = false;
					}
					
				}
				
				if (valido)
				{
					System.out.println("É primo.");
				}
		
			
			}
}
