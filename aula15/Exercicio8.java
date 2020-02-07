package curso.java.aula15;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			System.out.println("Entre com o preço dos 3 produtos separados por espaço: ");
			double preco1 = scan.nextDouble();
			double preco2 = scan.nextDouble();
			double preco3 = scan.nextDouble();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												
			if (preco1 < preco2 &&	preco1 < preco3)
			{
				System.out.println("Compre este produto!" + preco1);
			}
			else if (preco2 < preco1 && preco2 < preco3)
			{
				System.out.println("Compre este produto!" + preco2);
			}
			else
			{
				System.out.println("Compre este produto!" + preco3);
			}

	}

}
