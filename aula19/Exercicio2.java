package curso.java.aula19;
import java.util.Scanner;


public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entre com o valor da posi��o do vetor: " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i] * 2;
		}
		
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
