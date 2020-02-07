package curso.java.aula13;
import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite dois números separados por espaço");
		double a = s.nextDouble();
		double b = s.nextDouble();
		
		System.out.println("A soma dos dois valores é: " + (a + b));
		

	}

}
