package curso.java.aula31alt;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Velocidade velocidade = new Velocidade();
		
		
		System.out.println("Entre com o tempo.");
		velocidade.tempo = scan.nextDouble();
		System.out.println("Entre com a dist�ncia.");
		velocidade.distancia = scan.nextDouble();
		
		
		System.out.println("A velocidade escalar m�dia � de: " + velocidade.velocidadeEscalarMedia());
		

	}

}
