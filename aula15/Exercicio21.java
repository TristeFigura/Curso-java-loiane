package curso.java.aula15;
import java.util.Scanner;


public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de litros:");
		double litro = scan.nextDouble();
		
		System.out.println("Entre com o tipo do combustível: A - álcool; G - Gasolina:");
		String tipo = scan.next();
		
		double gasolina = 2.5;
		double alcool = 1.9;
		double desc = 0;
		
		if (litro <= 20 && tipo.equalsIgnoreCase("A"))
		{
			desc = (litro * alcool) * 0.03 ;
			System.out.println("Valor a ser pago: " + ((litro*alcool) - desc));
		}
		else if (litro > 20 && tipo.equalsIgnoreCase("A"))
		{
			desc = (litro * alcool) * 0.05 ;
			System.out.println("Valor a ser pago: " + ((litro*alcool) - desc));
		}
		else if (litro <= 20 && tipo.equalsIgnoreCase("G"))
		{
			desc = (litro * gasolina) * 0.04 ;
			System.out.println("Valor a ser pago: " + ((litro*gasolina) - desc));
		}
		else if (litro > 20 && tipo.equalsIgnoreCase("G"))
		{
			desc = (litro * gasolina) * 0.06 ;
			System.out.println("Valor a ser pago: " + ((litro*gasolina) - desc));
		}
		else
		{
			System.out.println("Entrada inválida.");
		}

	}

}
