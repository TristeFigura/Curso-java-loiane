package curso.java.aula19;
import java.util.Scanner;

public class Exercicio26 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[10];
				int[] vetorB = new int[vetorA.length];
				int[] vetorC = new int[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor do vetor A na posição " + (i+1) + ".");
					vetorA[i] = scan.nextInt();
					System.out.println("Entre com o valor do vetor B na posição " + (i+1) + ".");
					vetorB[i] = scan.nextInt();
					if (vetorA[i] > vetorB[i])
					{
						vetorC[i] = 1;
					}
					else if (vetorA[i] == vetorB[i])
					{
						vetorC[i] = 0;
					}
					else if (vetorA[i] < vetorB[i])
					{
						vetorC[i] = -1;
					}
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				System.out.println();
				
				for (int i = 0; i < vetorB.length; i++)
				{
					System.out.print(vetorB[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorC.length; i++)
				{
					System.out.print(vetorC[i] + " ");
				}
			}

}
