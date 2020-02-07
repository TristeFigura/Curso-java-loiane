package curso.java.aula19;
import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		double qtd0 = 0;
		double qtd1 = 0;
		double porc0 = 0;
		double porc1 = 0;
		
		for (int i = 0; i < vetorA.length; i++)
		{
			vetorA[i] = (int) Math.round(Math.random()*1); //*1 muda conforme necessidade de limitar os valores aleatórios
			if (vetorA[i] == 0)
			{
				qtd0++;
			}
			else if (vetorA[i] == 1)
			{
				qtd1++;
			}
		}
		porc0 = (qtd0/vetorA.length)*100;
		porc1 = (qtd1/vetorA.length)*100;
		
		for (int i = 0; i < vetorA.length; i++)
		{
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Porcentagem de 0: " + porc0);
		System.out.println("Porcentagem de 1: " + porc1);
		
	}

}
