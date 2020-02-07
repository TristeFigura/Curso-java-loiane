package curso.java.aula17;
import java.util.Scanner;


public class Exercicio4 {
		
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				double popA = 80000;
				double popB = 200000;
				double taxaA = 0.03;
				double taxaB = 0.015;
				int i;
				
				for (i = 0; popA <= popB; i++)
				{
					popA += (taxaA*popA);
					popB += (taxaB*popB);
					
				}
				System.out.println("Em " + i + " anos a população A ultrassará a B");
				
			}

}
