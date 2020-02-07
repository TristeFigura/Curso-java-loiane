package curso.java.aula15;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Em qual turno você estuda? M = matutino, V = vespertino e N = noturno");
		String turno = scan.next();
		
		if (turno.length() > 1)
		{
			System.out.println("Não é uma letra válida");
		}	
		if (turno.equalsIgnoreCase("m"))
		{
			System.out.println("Bom dia!");
		}
		else if (turno.equalsIgnoreCase("v"))
		{
			System.out.println("Boa tarde!");
		}
		else if (turno.equalsIgnoreCase("n"))
		{
			System.out.println("Boa noite!");
		}
		else
		{
			System.out.println("Entrada inválida");
		}
	}

}
