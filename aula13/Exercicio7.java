package curso.java.aula13;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira o tamanho do lado do quadrado: ");
		double lado = s.nextDouble();
		
		double area = lado*lado;
		
		System.out.println("A área do quadrado é: " + area);
		

		
	}

}
