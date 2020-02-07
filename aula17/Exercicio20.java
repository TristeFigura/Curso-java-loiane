package curso.java.aula17;
import java.util.Scanner;


public class Exercicio20 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				int numPessoas, i, idade;
				int soma = 0;
				
				System.out.println("Entre com o número de pessoas: ");
				numPessoas = scan.nextInt();
				
				for (i = 0; i < numPessoas; i++)
				{
					System.out.println("Entre com a idade das pessoas individualmente: ");
					idade = scan.nextInt();
					soma += idade;
				}
				
				double média = soma/numPessoas;
				
				System.out.println(soma);
				System.out.println(média);
				
				if (média > 0 && média <= 25)
				{
					System.out.println("A turma é jovem!");
				}
				else if (média >= 26 && média <= 60)
				{
					System.out.println("A turma é adulta!");
				}
				else if (média > 60)
				{
					System.out.println("A turma é idosa!");
				}
				
			}

}
