package curso.java.aula17;
import java.util.Scanner;

public class Exercicio21 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				double turma, aluno;
				double soma = 0;
				
				System.out.println("Entre com a quantidade de turmas: ");
				turma = scan.nextDouble();
				
				for (int i = 0; i < turma; i++)
				{
					System.out.println("Entre com a quantidade de alunos: ");
					aluno = scan.nextInt();
					if (aluno < 40)
					{
						soma += aluno;	
					}
					else if (aluno > 40)
					{
						i--;
						System.out.println("A turma n�o pode ter mais que 40 alunos.");
					}
				}
				
				double m�dia = soma/turma;
				System.out.println("A m�dia de alunos por turma �: " + m�dia);
			}

}
