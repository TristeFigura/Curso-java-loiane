package curso.java.aula19;
import java.util.Scanner;

public class Exercicio37 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[15];
				int[] vetorB = new int[vetorA.length];
				int fat = 1;
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor do vetor A na posição " + (i+1) + ".");
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorA.length; i++)
				{
					vetorB[i] = 1;
					System.out.print("Fatorial de: " + vetorA[i] + " = ");
					for (int j = 1; j <= vetorA[i]; j++)
					{
						vetorB[i] *= j;
					}
					System.out.print(vetorB[i] + " ");
					System.out.println();
				}
				
				
			}

}
