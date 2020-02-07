package curso.java.aula13;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do arquivo em MB e a velocidade de download em Mbps separados por espaço: ");
		double tamanho = scan.nextDouble();
		double velocidade = scan.nextDouble();
		
		double tempo = (tamanho * velocidade) / 60;
		System.out.println("O tempo para download em minutos é: " + tempo);

	}

}
