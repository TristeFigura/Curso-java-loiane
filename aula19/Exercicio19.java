package curso.java.aula19;
import java.util.Scanner;

public class Exercicio19 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			double[] result  = new double[10];
			double[] notas1 = new double[result.length];
			double[] notas2 = new double[result.length];
			int numNota = 2;
			
			
			for (int i = 0; i < result.length; i++)
			{
				System.out.println("Entre com a primeira nota do aluno n°: " + (i+1));
				notas1[i] = scan.nextDouble();
				
				System.out.println("Entre com a segunda nota do aluno n°: " + (i+1));
				notas2[i] = scan.nextDouble();
				
				result[i] = (notas1[i] + notas2[i])/numNota;
			}
			
			for (int i = 0; i < result.length; i++)
			{
				if (result[i] >= 7)
				{
					System.out.println("Aluno aprovado. Nota " + result[i]);
				}
				else
				{
					System.out.println("Aluno reprovado. Nota " + result[i]);
				}
			}
				
			
		}

}
