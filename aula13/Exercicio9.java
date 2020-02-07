package curso.java.aula13;
import java.util.Scanner;


public class Exercicio9 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Insira a temperatura em Farenheit: ");
			double f = scan.nextDouble();
			
			double celsius = (5 * (f - 32) / 9);
			
			System.out.println("A temperatura em Celsius é: " + celsius);
			
		}
}
