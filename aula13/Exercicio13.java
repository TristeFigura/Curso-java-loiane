package curso.java.aula13;

import java.util.Scanner;


public class Exercicio13 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira quanto voc� recebe por hora e o n�mero de horas trabalhadas: ");
		double valorHora = scan.nextDouble();
		double numHora = scan.nextDouble();
		
		double salario = valorHora * numHora;
		double IR = salario * 0.11;
		double INSS = salario * 0.08;
		double sindicato = salario * 0.05;
		double liquido = salario - IR - INSS - sindicato;
		
		System.out.println("Sal�rio bruto: " + salario + " INSS: " + INSS + " Sindicato: " + sindicato + " Sal�rio l�quido: "  + liquido);
	
		
		
	}

}
