package curso.java.aula17;
import java.util.Scanner;

public class Exercicio34 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			double harmonica = 0;
			double n;
			double i;
			
			System.out.println("Entre com n-�simo termo da s�rie harm�nica.");
			n = scan.nextDouble();
			
			for (i = 1; i <= n; i++)
			{
				harmonica += 1/i;
				System.out.println(1 + "/" + i + " = " + harmonica);
			}
		}
}
