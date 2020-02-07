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
						System.out.println("A turma não pode ter mais que 40 alunos.");
					}
				}
				
				double média = soma/turma;
				System.out.println("A média de alunos por turma é: " + média);
			}

}
