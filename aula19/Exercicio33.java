package curso.java.aula19;
import java.util.Scanner;

public class Exercicio33 {
	
			public static void main(String[] args) {
				
					Scanner scan = new Scanner(System.in);
					
					int[] vetorA = new int[10];
					boolean primo = true;
					
					for (int i = 0; i < vetorA.length; i++)
					{
						System.out.println("Entre com o valor da posição " + (i+1) + " do vetor A. ");
						vetorA[i] = scan.nextInt();
					}
					
					for (int i = 0; i < vetorA.length; i++)
					{
						primo = true;
						
						for (int j = 2; j < vetorA[i]; j++)
						{
							if (vetorA[i] % j == 0)
							{
								primo = false;
								break;
							}
						
						}
						
						String msg = "";
						if (primo)
						{
							msg = " Primo";
						}
						else
						{
							msg = " Não é primo";
						}
						System.out.println(vetorA[i] + msg);
					}
					
					
			}

}
