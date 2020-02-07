package curso.java.aula13;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		
		double area;
		
		System.out.println("Insira o raio do círculo: ");
		double raio = s.nextDouble();
		
		area = (raio*raio)*Math.PI;

		System.out.println("A área do círculo é: " + area);
	}

}
	