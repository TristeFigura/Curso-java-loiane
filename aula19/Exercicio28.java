package curso.java.aula19;
import java.util.Scanner;

public class Exercicio28 {
		
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[10];
				int[] vetorB = new int[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor do vetor na posição " + (i+1) + ".");
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorA.length; i++)
				{
					vetorB[i] = vetorA[vetorA.length -1 - i];
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				
				System.out.println();
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorB[i] + " ");
				}
				
			}

}
