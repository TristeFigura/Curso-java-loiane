package curso.java.aula19;
import java.util.Scanner;

public class Exercicio8 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[3];
				int[] vetorB = new int[vetorA.length];
				int[] vetorC = new int[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor da posição do vetor A: " + (i+1));
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorB.length; i++)
				{
					System.out.println("Entre com o valor da posição do vetor B: " + (i+1));
					vetorB[i] = scan.nextInt();
					
					vetorC[i] = vetorA[i] * vetorB[i];
				}
				
				for (int i = 0; i < vetorA[i]; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorB[i]; i++)
				{
					System.out.print(vetorB[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorC[i]; i++)
				{
					System.out.print(vetorC[i] + " ");
				}
								
				
			}

}
