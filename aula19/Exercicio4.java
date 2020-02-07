package curso.java.aula19;
import java.util.Scanner;

public class Exercicio4 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				double[] vetorA = new double[15];
				double[] vetorB = new double[vetorA.length];
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.println("Entre com o valor do vetor na posição: " + (i+1));
					vetorA[i] = scan.nextDouble();
					vetorB[i] = Math.sqrt(vetorA[i]); 
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
			}

}
