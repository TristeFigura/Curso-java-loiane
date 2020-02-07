package curso.java.aula15;
import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sexo F para feminino, M para masculino: ");
		String sexo = scan.next();
		
		if (sexo.equalsIgnoreCase("f"))
		{
			System.out.println("F - feminino");
		}
		else if (sexo.equalsIgnoreCase("m"))
		{
			System.out.println("M - masculino");
		}
		else
		{
			System.out.println("Sexo inválido");
		}
	}

}
