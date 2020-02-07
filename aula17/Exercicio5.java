package curso.java.aula17;
import java.util.Scanner;

public class Exercicio5 {
	
			public static void main(String[] args) {
				
					Scanner scan = new Scanner(System.in);
				
				double popA;
				double popB;
				double taxaA;
				double taxaB;
				int i;
				
				System.out.println("Entre com a população A: ");
				popA = scan.nextDouble();
				System.out.println("Entre com a taxa de crescimento anual A: ");
				taxaA = scan.nextDouble();
				System.out.println("Entre com a população B: ");
				popB = scan.nextDouble();
				System.out.println("Entre com a taxa de crescimento anual B: ");
				taxaB = scan.nextDouble();
				
				for (i = 0; popA <= popB; i++)
				{
					popA += (taxaA*popA);
					popB += (taxaB*popB);
					
				}
				System.out.println("Em " + i + " anos a população A ultrassará a B");
				
			}
			
}
