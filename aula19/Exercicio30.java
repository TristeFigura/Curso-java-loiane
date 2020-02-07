package curso.java.aula19;
import java.util.Scanner;

public class Exercicio30 {
	
			public static void main (String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[20];
				int[] vetorB = new int[vetorA.length]; //par
				int[] vetorC = new int[vetorA.length]; //ímpar
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor da posição do vetor A " + (i+1));
					vetorA[i] = scan.nextInt();
				}
				
				int posB = 0;
				int posC = 0;
				
				for (int i = 0; i < vetorA.length; i++)
				{
					if (vetorA[i] % 2 == 0)
					{
						vetorB[posB] = vetorA[i];
						posB++;
					}
					else
					{
						vetorC[posC] = vetorA[i];
						posC++;
					}
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < posB; i++)
				{
					System.out.print(vetorB[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < posC; i++)
				{
					System.out.print(vetorC[i] + " ");
				}
			}

}
