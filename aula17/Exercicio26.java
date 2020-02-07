package curso.java.aula17;
import java.util.Scanner;

public class Exercicio26 {
		
		public static void main(String[] args)  {
			
			Scanner scan = new Scanner(System.in);
			
			int num, i;
			int fat = 1;
			System.out.println("Programa para cálculo de fatorial.");
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			System.out.println("Fatorial de: " + num);
			System.out.print(num + "! = ");
			for (i = num; i > 1; i--)
			{
				fat *= i;
				System.out.print(i + ".");
			}
			System.out.print("1 = " + fat);
		}

}
