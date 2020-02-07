package curso.java.aula31alt;
import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Velocidade velocidade = new Velocidade();
		
		
		System.out.println("Entre com o tempo.");
		velocidade.tempo = scan.nextDouble();
		System.out.println("Entre com a distância.");
		velocidade.distancia = scan.nextDouble();
		
		
		System.out.println("A velocidade escalar média é de: " + velocidade.velocidadeEscalarMedia());
		

	}

}
