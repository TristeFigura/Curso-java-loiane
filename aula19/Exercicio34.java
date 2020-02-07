package curso.java.aula19;
import java.util.Scanner;

public class Exercicio34 {
	
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
					System.out.println("Números pares até: " + vetorA[i]);
					for (int j = 0; j <= vetorA[i]; j++)
					{
						if (j % 2 == 0)
						{
							System.out.print(j + " ");
						}
					}
					
					System.out.println();
				}
			
		}

}
