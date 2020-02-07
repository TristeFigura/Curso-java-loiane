package curso.java.aula17;
import java.util.Scanner;

public class Exercicio3 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			boolean infoValidas = false;
			String nome;
			int idade;
			double salario;
			String sexo;
			String estadoCivil;
			
			do
			{
				System.out.println("Entre com o nome:");
				nome = scan.next();
				
				if (nome.length() >= 3)
				{
					infoValidas = true;
				}
				else
				{
					System.out.println("Digite um nome com mais de três caracteres.");
				}
			}
			while (infoValidas == false);
			
				infoValidas = false;
			do
			{
				System.out.println("Entre com a idade: ");
				idade = scan.nextInt();
				
				if (idade > 0 && idade < 150)
				{
					infoValidas = true;
				}
				else
				{
					System.out.println("A idade deve estar entre 0 e 150, digite novamente.");
				}
			}
			while (infoValidas == false);
			
				infoValidas = false;
			do
			{
				System.out.println("Entre com o salário: ");
				salario = scan.nextInt();
				
				if (salario > 0)
				{
					infoValidas = true;
				}
				else
				{
					System.out.println("O salário deve ser positivo.");
				}
			}
			while (infoValidas == false);
			
				infoValidas = false;
				
			do
			{
				System.out.println("Entre com o sexo F = feminino ou M = masculino.");
				sexo = scan.next();
				
				if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M"))
				{
					infoValidas = true;
				}
				else
				{
					System.out.println("Sexo inválido, digite novamente.");
				}
			}
			while (infoValidas == false);
			
				infoValidas = false;
				
			do
			{
				System.out.println("Entre com o estado civil s = solteiro, c = casado, v = viúvo e d = divorciado.");
				estadoCivil = scan.next();
				
				if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") 
						|| estadoCivil.equalsIgnoreCase("d"))
				{
					infoValidas = true;
				}
				else
				{
					System.out.println("Entrada inválida, digite novamente.");
				}
			}
			while (infoValidas == false);
			
			System.out.println("Nome: " + nome);
			System.out.println("Idade: " + idade);
			System.out.println("Salário: " + salario);
			System.out.println("Sexo: " + sexo);
			System.out.println("Estado Civil: " + estadoCivil);
		}
}
