package curso.java.aula19;
import java.util.Scanner;

public class Exercicio6 {
		
			public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entre com o valor do vetor na posi��o: " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++)
		{
			System.out.println("Entre com o valor do vetor na posi��o:" + (i+1));
			vetorB[i] = scan.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
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
