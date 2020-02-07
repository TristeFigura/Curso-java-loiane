package curso.java.aula19;
import java.util.Scanner;

public class Exercicio25 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[10];
				int[] vetorB = new int[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor da posição " + (i+1) + ".");
					vetorA[i] = scan.nextInt();
					if (vetorA[i] % 2 == 0)
					{
						vetorB[i] = 1;
					}
					else
					{
						vetorB[i] = 0;
					}
				}
				
				System.out.println("Vetor A: ");
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				System.out.println();
				System.out.println("Vetor B: ");
				
				for (int i = 0; i < vetorB.length; i++)
				{
					System.out.print(vetorB[i] + " ");
				}
				
				
			}

}
