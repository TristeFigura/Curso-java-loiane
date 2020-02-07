package curso.java.aula13;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Digite as 4 notas separadas por espaço: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		
		double MEDIA = (a + b + c + d)/4;
		
		System.out.println("A média das notas é: " + MEDIA);
		

	}

}
