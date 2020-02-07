package curso.java.aula15;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número:");
		double n1 = scan.nextDouble();
		
		System.out.println("Entre com outro número:");
		double n2 = scan.nextDouble();
		
		
		System.out.println("Qual operação deseja realizar? \n multiplicação \n divisão \n soma \n subtração \n potenciação \n radiciação");
		String operação = scan.next();
		
		/* String divisão = scan.next();
		String soma = scan.next();
		String subtração = scan.next();
		String potenciação = scan.next();
		String radiciação = scan.next(); */
		
		if (operação.equalsIgnoreCase("multiplicação"))
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
				System.out.println("Resultado ímpar");
			}
				
		}
		if (operação.equalsIgnoreCase("divisão"))
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
				System.out.println("Resultado ímpar");
				}
			}
			else
			{
				System.out.println("Divisão por zero é indeterminada.");
			}
				
		}
		if (operação.equalsIgnoreCase("soma"))
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
				System.out.println("Resultado ímpar");
			}
				
		}
		if (operação.equalsIgnoreCase("subtração"))
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
				System.out.println("Resultado ímpar");
			}
				
		}
		
	

	}

}
