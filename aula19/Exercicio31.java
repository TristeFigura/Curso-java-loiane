package curso.java.aula19;
import java.util.Scanner;

public class Exercicio31 {

			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[20];
				int[] vetorB = new int[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor da posição " + (i+1) + " do vetor A. ");
					vetorA[i] = scan.nextInt();
				}
				
				int posPar = 0;
				
				for (int i = 0; i < vetorA.length; i++)
				{
					if (vetorA[i] % 2 == 0)
					{
						vetorB[posPar] = vetorA[i];
						posPar++;
					}
				}
				
				int posImpar = posPar;
				
				for (int i = 0; i < vetorA.length; i++)
				{
					if (vetorA[i] % 2 != 0)
					{
						vetorB[posImpar] = vetorA[i];
						posImpar++;
					}
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
