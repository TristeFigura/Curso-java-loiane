package curso.java.aula19;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[10];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++)
		{
			System.out.println("Entre com o valor do vetor na posição: " + (i+1));
			vetorA[i] = scan.nextDouble();
		}
		
		for (int i = 0; i < vetorB.length; i++)
		{
			System.out.println("Entre com o valor do vetor na posição:" + (i+1));
			vetorB[i] = scan.nextDouble();
			vetorC[i] = vetorA[i] - vetorB[i];
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
