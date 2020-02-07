package curso.java.aula15;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o valor da hora de trabalho:");
		double valorHora = scan.nextDouble();
		System.out.println("Entre com a quantidade de horas trabalhadas:");
		double qntHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qntHora;
		double sindicato = salarioBruto * 0.03;
		double FGTS = salarioBruto * 0.11;
		
		
		
		if (salarioBruto <= 900)
		{
			System.out.println("Salário Bruto: " + salarioBruto);
			
		}

	}

}
