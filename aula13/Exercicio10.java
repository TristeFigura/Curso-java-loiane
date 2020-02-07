package curso.java.aula13;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira a temperatura em graus Celsius: ");
		double c = scan.nextDouble();
		
		double f = (9*c + 160) / 5;
		
		System.out.println("A temperatura em Farenheit é: " + f);

	}

}
