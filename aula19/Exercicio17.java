package curso.java.aula19;
import java.util.Scanner;

public class Exercicio17 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] vetorA = new int[10];
			int cont = 0;
			
			for (int i = 0; i < vetorA.length; i++)
			{
				System.out.println("Entre com a idade: ");
				vetorA[i] = scan.nextInt();
				if (vetorA[i] > 35)
				{
					cont++;
				}
			}
			
			System.out.println("Número de pessoas acima de 35 anos: " + cont + ".");
		}

}
