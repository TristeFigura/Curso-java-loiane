package curso.java.aula19;
import java.util.Scanner;

public class Exercicio27 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int[] vetorB = new int[vetorA.length];
			
			for (int i = 0; i < vetorA.length; i++)
			{
				System.out.println("Entre com o valor do vetor na posição " + (i+1) + ".");
				vetorA[i] = scan.nextInt();
				if (vetorA[i] < 7)
				{
					vetorB[i] = 'a';
				}
				else if (vetorA[i] == 7)
				{
					vetorB[i] = 'b';
				}
				else if (vetorA[i] > 7 && vetorA[i] < 10)
				{
					vetorB[i] = 'c';
				}
				else if (vetorA[i] == 10)
				{
					vetorB[i] = 'd';
				}
				else if (vetorA[i] > 10)
				{
					vetorB[i] = 'e';
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
		}

}
