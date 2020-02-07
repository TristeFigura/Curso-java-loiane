package curso.java.aula15;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de kilos de morango:");
		double kgMorango = scan.nextDouble();
		
		System.out.println("Entre com a quantidade de kilos de maça:");
		double kgMaca = scan.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
	
		
		if (kgMorango <= 5)
		{
			precoMorango = 2.5;
		}
		else
		{
			precoMorango = 2.2;
		}
		
		if (kgMaca <= 5)
		{
			precoMaca = 1.8;
		}
		else
		{
			precoMaca = 1.5;
		}
		
		double desconto = 0;
		double totalMaca = kgMaca*precoMaca;
		double totalMorango = kgMorango*precoMorango;
		double precoTotal = totalMaca + totalMorango;
		
		if (kgMorango + kgMaca > 8 || precoTotal > 25)
		{
			desconto = precoTotal * 0.1;
		}
		
		System.out.println("O valor total da compra é: " + (precoTotal - desconto));
	}

}
