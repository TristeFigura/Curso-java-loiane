package curso.java.aula20;
import java.util.Scanner;

public class Exercicio3 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int[][] matrizM = new int[3][3];
				int par = 0;
				int impar = 0;
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						System.out.println("Entre com o valor da matriz na posição " + i + " - " + j);
						matrizM[i][j] = scan.nextInt();
					}
				}
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						System.out.print(matrizM[i][j] + " ");
					}
					System.out.println();
				}
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						if (matrizM[i][j] % 2 == 0)
						{
							par++;
						}
						else
						{
							impar++;
						}
					}
				}
				
				System.out.println("Quantidade de números pares: " + par);
				System.out.println("Quantidade de números ímpares: " + impar);
			}

}
