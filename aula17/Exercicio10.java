package curso.java.aula17;
import java.util.Scanner;

public class Exercicio10 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int a, b, i;
			int t = 0;
			System.out.println("Entre com o primeiro n�mero: ");
			a = scan.nextInt();
			System.out.println("Entre com o segundo n�mero: ");
			b = scan.nextInt();
			
			
			for (i = a; i < b; i++)
				{
				System.out.println("Os n�mero do intervalo s�o: " + i);
				t += i;
				}
			System.out.println("A soma do intervalo �: " + t);
		}

}
