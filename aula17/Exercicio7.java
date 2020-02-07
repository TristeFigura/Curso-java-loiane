package curso.java.aula17;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			
			if (num > maior)
			{
				maior = num;
			}
		}
		
		System.out.println(maior);
		
	
		
			
	}

}
