package curso.java.aula20;
import java.util.Random;

public class Exercicio2 {
	
			public static void main(String[] args) {
				
				double[][] numerosAl = new double [10][10];
				Random numeroRandom = new Random();
				double linhaMaior = Integer.MIN_VALUE;
				double linhaMenor = Integer.MAX_VALUE;
				double colMaior = Integer.MIN_VALUE;
				double colMenor = Integer.MAX_VALUE;
				
				
				for (int i = 0; i < numerosAl.length; i++)
				{
					for (int j = 0; j < numerosAl[i].length; j++)
					{
						numerosAl[i][j] = numeroRandom.nextInt(100);
					}
				}
				
				for (int i = 0; i < numerosAl.length; i++)
				{
					for (int j = 0; j < numerosAl[i].length; j++)
					{
						if (numerosAl[5][j] > linhaMaior)
						{
							linhaMaior = numerosAl[5][j];
						}
						else if (numerosAl[5][j] < linhaMenor)
						{
							linhaMenor = numerosAl[5][j];
						}
						else if (numerosAl[i][7] > colMaior)
						{
							colMaior = numerosAl[i][7];
						}
						else if (numerosAl[i][7] < colMenor)
						{
							colMenor = numerosAl[i][7];
						}
					}
				}
				
				for (int i = 0; i < numerosAl.length; i++)
				{
					for (int j = 0; j < numerosAl[i].length; j++)
					{
						System.out.print(numerosAl[i][j] + " ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println("Maior elemento da linha 5: " + linhaMaior);
				System.out.println("Menor elemento da linha 5: " + linhaMenor);
				System.out.println("Maior elemento da coluna 7: " + colMaior);
				System.out.println("Menor elemento da coluna 7: " + colMenor);
				
				
				
				
				
			}

}
