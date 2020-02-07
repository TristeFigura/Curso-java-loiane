package curso.java.aula19;
import java.util.Scanner;

public class Exercicio3 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] vetorA = new int[15];
			int[] vetorB = new int[vetorA.length];
			
			for (int i = 0; i < vetorA.length; i++)
			{
				System.out.println("Entre com o valor da posição do vetor: " + (i+1));
				vetorA[i] = scan.nextInt();
				vetorB[i] = vetorA[i] * vetorA[i];
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
