package curso.java.aula13;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor de sua hora de trabalho: ");
		double hora = scan.nextDouble();
		System.out.println("Insira o n�mero de horas trabalhadas no m�s: ");
		double mes = scan.nextDouble();
		
		double salario = hora * mes;
		
		System.out.println("Seu sal�rio mensal � de: " + salario + " reais");

	}

}
