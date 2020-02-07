package curso.java.aula17;
import java.util.Scanner;

public class Exercicio17 {
		
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int num;
			int fat = 1;
			int i;
			
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			
			for (i = 1; i <= num; i++)
			{
				fat *= i;
			}
			System.out.println(fat);
		}

}
