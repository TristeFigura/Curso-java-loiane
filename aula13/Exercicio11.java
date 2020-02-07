package curso.java.aula13;
import java.util.Scanner;


public class Exercicio11 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com dois números inteiros e um número real separados por espaço: ");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		double real = scan.nextDouble();
		
		double a = ((int1 * 2) * (int2 / 2));
		double b = ((int1 * 3) + real);
		double c = (real*real*real);
		
		System.out.println("Produto do dobro do primeiro com metade do segundo: " + a);
		System.out.println("Soma do triplo do primeiro com o terceiro: " + b);
		System.out.println("O terceiro ao cubo: " + c);
		
		

	}

}
