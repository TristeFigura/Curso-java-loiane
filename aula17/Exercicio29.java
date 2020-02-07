package curso.java.aula17;
import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num, i, j;
		
		System.out.println("Entre com um número.");
		num = scan.nextInt();
		
		for (i = 1; i <= num; i++)
		{
			boolean primo = true;
			
			for (j = 2; j < i; j++)
			{
				if (i % j == 0)
				{
					primo = false;
				}
			}
			if (primo)
			{
			System.out.println("Os números primo nesse intervalo são: " + i);
			}
		}
	}

}