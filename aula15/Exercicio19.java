package curso.java.aula15;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero:");
		double n1 = scan.nextDouble();
		
		System.out.println("Entre com outro n�mero:");
		double n2 = scan.nextDouble();
		
		
		System.out.println("Qual opera��o deseja realizar? \n multiplica��o \n divis�o \n soma \n subtra��o \n potencia��o \n radicia��o");
		String opera��o = scan.next();
		
		/* String divis�o = scan.next();
		String soma = scan.next();
		String subtra��o = scan.next();
		String potencia��o = scan.next();
		String radicia��o = scan.next(); */
		
		if (opera��o.equalsIgnoreCase("multiplica��o"))
		{
			System.out.println(n1*n2);
			if (n1*n2 >= 0)
			{
				System.out.println("Resultado positivo");
			}
			else
			{
				System.out.println("Resultado negativo");
			}
			if (n1*n2 % 2 == 0)
			{
				System.out.println("Resultado par");
			}
			else
			{
				System.out.println("Resultado �mpar");
			}
				
		}
		if (opera��o.equalsIgnoreCase("divis�o"))
		{
			if (n2 != 0)
			{
				System.out.println(n1/n2);
				if (n1*n2 >= 0)
				{
				System.out.println("Resultado positivo");
				}
				else
				{
				System.out.println("Resultado negativo");
				}
				if (n1/n2 % 2 == 0)
				{
				System.out.println("Resultado par");
				}
				else
				{
				System.out.println("Resultado �mpar");
				}
			}
			else
			{
				System.out.println("Divis�o por zero � indeterminada.");
			}
				
		}
		if (opera��o.equalsIgnoreCase("soma"))
		{
			System.out.println(n1+n2);
			if (n1+n2 >= 0)
			{
				System.out.println("Resultado positivo");
			}
			else
			{
				System.out.println("Resultado negativo");
			}
			if (n1*n2 % 2 == 0)
			{
				System.out.println("Resultado par");
			}
			else
			{
				System.out.println("Resultado �mpar");
			}
				
		}
		if (opera��o.equalsIgnoreCase("subtra��o"))
		{
			System.out.println(n1-n2);
			if (n1-n2 >= 0)
			{
				System.out.println("Resultado positivo");
			}
			else
			{
				System.out.println("Resultado negativo");
			}
			if (n1*n2 % 2 == 0)
			{
				System.out.println("Resultado par");
			}
			else
			{
				System.out.println("Resultado �mpar");
			}
				
		}
		
	

	}

}
