package curso.java.aula13;
import java.util.Scanner;


public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com sua altura em metros: ");
		double altura = scan.nextDouble();
		
		double ideal = ((72.7*altura) - 58);
		
		System.out.println("Seu peso ideal é: " + ideal);
	}
}
