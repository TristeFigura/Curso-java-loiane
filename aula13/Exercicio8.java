package curso.java.aula13;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de sua hora de trabalho: ");
		double hora = scan.nextDouble();
		System.out.println("Insira o número de horas trabalhadas no mês: ");
		double mes = scan.nextDouble();
		
		double salario = hora * mes;
		
		System.out.println("Seu salário mensal é de: " + salario + " reais");

	}

}
