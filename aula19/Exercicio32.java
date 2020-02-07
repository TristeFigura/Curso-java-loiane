package curso.java.aula19;
import java.util.Scanner;

public class Exercicio32 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[5];
				int tab = 0;
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor da posição " + (i+1) + " do vetor A. ");
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Tabuada de " + vetorA[i]);
					
					for (int j = 0; j <= 10; j++)
					{
						tab = vetorA[i] * j;
						System.out.print(vetorA[i] + " x " + j + " = " + tab + "   ");
					}
					
					System.out.println();
				}
			}

}
