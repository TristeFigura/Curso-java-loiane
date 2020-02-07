package curso.java.aula19;
import java.util.Scanner;

public class Exercicio24 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[] vetorA = new int [10];
				boolean palindromo = true;
				
				for (int i = 0; i < vetorA.length; i++)
				{
					
					System.out.println("Entre com um número. (Um algarismo por vez)");
					vetorA[i] = scan.nextInt();
				}
				
				for (int i = 0; i < vetorA.length/2; i++)
				{
					if (vetorA[i] != vetorA[vetorA.length - 1 - i])
					{
						palindromo = false;
						break;
					}
				}
				
				System.out.println("Vetor A = ");
				
				for (int i = 0; i < vetorA.length; i++)
				{
					System.out.print(vetorA[i] + " ");
				}
				
				System.out.println();
				
				if (palindromo)
				{
					System.out.println("Palíndromo.");
				}
				else
				{
					System.out.println("Não é palíndromo.");
				}
				
			}

}
