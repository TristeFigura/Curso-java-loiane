package curso.java.aula17;
import java.util.Scanner;


public class Exercicio20 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				int numPessoas, i, idade;
				int soma = 0;
				
				System.out.println("Entre com o n�mero de pessoas: ");
				numPessoas = scan.nextInt();
				
				for (i = 0; i < numPessoas; i++)
				{
					System.out.println("Entre com a idade das pessoas individualmente: ");
					idade = scan.nextInt();
					soma += idade;
				}
				
				double m�dia = soma/numPessoas;
				
				System.out.println(soma);
				System.out.println(m�dia);
				
				if (m�dia > 0 && m�dia <= 25)
				{
					System.out.println("A turma � jovem!");
				}
				else if (m�dia >= 26 && m�dia <= 60)
				{
					System.out.println("A turma � adulta!");
				}
				else if (m�dia > 60)
				{
					System.out.println("A turma � idosa!");
				}
				
			}

}
