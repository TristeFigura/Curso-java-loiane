package curso.java.aula15;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Entre com um valor: ");
		double valor = s.nextDouble();
		
		if (valor >= 0)
		{
			System.out.println("O valor é positivo");
		}
		else
		{
			System.out.println("O valor é negativo");
		}
	}

}
