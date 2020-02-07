package curso.java.aula17;
import java.util.Scanner;

public class Exercicio10 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int a, b, i;
			int t = 0;
			System.out.println("Entre com o primeiro número: ");
			a = scan.nextInt();
			System.out.println("Entre com o segundo número: ");
			b = scan.nextInt();
			
			
			for (i = a; i < b; i++)
				{
				System.out.println("Os número do intervalo são: " + i);
				t += i;
				}
			System.out.println("A soma do intervalo é: " + t);
		}

}
