package curso.java.aula15;

import java.util.Scanner;


public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o seu salário atual:");
		double salario = scan.nextDouble();
		
		double novoSalario;
		
		
		if (salario <= 280)
		{
			novoSalario = salario * 1.2;
			System.out.println("Salário atual: " + salario + " Salário com reajuste: " + novoSalario);
			System.out.println("O percentual de aumento foi de 20%, " + (novoSalario-salario) + " reais");
		}
		else if (salario > 280 && salario <= 700)
		{
			novoSalario = salario * 1.15;
			System.out.println("Salário atual: " + salario + " Salário com reajuste: " + novoSalario);
			System.out.println("O percentual de aumento foi de 15%, " + (novoSalario-salario) + " reais");
		}
		else if (salario > 700 && salario < 1500)
		{
			novoSalario = salario * 1.10;
			System.out.println("Salário atual: " + salario + " Salário com reajuste: " + novoSalario);
			System.out.println("O percentual de aumento foi de 10%, " + (novoSalario-salario) + " reais");
		}
		else if (salario >= 1500)
		{
			novoSalario = salario * 1.05;
			System.out.println("Salário atual: " + salario + " Salário com reajuste: " + novoSalario);
			System.out.println("O percentual de aumento foi de 5%, " + (novoSalario-salario) + " reais");
		}

	}

}
