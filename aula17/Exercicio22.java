package curso.java.aula17;
import java.util.Scanner;

public class Exercicio22 {

		public static void main(String[] args) 
		{
			
			Scanner scan = new Scanner(System.in);
			
			int qntCd, valorCd;
			double soma = 0;
		
			
			System.out.println("Entre com a quantidade de CDs: ");
			qntCd = scan.nextInt();
			
			for (int i = 0; i < qntCd; i++) 
			{
				System.out.println("Entre com o valor de cada CD:");
				valorCd = scan.nextInt();
				soma += valorCd;
			}
			double m�dia = soma/qntCd;
			
			System.out.println("Valor total da cole��o: " + soma);
			System.out.println("Valor m�dio de cada CD: " + m�dia);
		}
}
