package curso.java.aula19;
import java.util.Scanner;

public class Exercicio35 {
		
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int[10];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor do vetor A na posição " + (i+1) + ".");
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Divisores de: " + vetorA[i]);
					for (int j = 1; j <= vetorA[i]; j++)
					{
						if (vetorA[i] % j == 0)
						{
							System.out.print(j + " ");
						}
					}
					System.out.println();
				}
			}

}
