package curso.java.aula15;
import java.util.Scanner;

public class Exercicio19_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		double num1 = scan.nextInt();
		
		System.out.println("Entre com o segundo número:");
		double num2 = scan.nextInt();
		
		System.out.println("Entre com a operação ( + - / *): ");
		String operação = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operação)
		{
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Operação inválida"); valida = false;
		}
		if (valida)
		{
			System.out.println("Resultado: " + resultado);
			
			if (resultado >= 0)
			{
				System.out.println("Resultado positivo");
			}
			else
			{
				System.out.println("Resultado negativo");
			}
			if (resultado % 2 == 0)
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
