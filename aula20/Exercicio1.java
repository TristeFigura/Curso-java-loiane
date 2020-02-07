package curso.java.aula20;
import java.util.Scanner;

public class Exercicio1 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				double[][] matrizM = new double[4][4];
				
				double maior = matrizM[0][0];
				
				int col = 0;
				int linha = 0;
				
			
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						matrizM[i][j] = Math.round(Math.random()*9);
							
					}
				}
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						if (matrizM[i][j] > maior)
						{
							maior = matrizM[i][j];
							linha = i;
							col = j;
							
						}
							
					}
				}
				
				for (int i = 0; i < matrizM.length; i++)
				{
					for (int j = 0; j < matrizM[i].length; j++)
					{
						System.out.print(matrizM[i][j] + " ");
							
					}
				}
				
				System.out.println();
				System.out.println("O maior elemento é: " + maior + " na linha " + linha + " e na coluna " + col);
				
				
			}

}
