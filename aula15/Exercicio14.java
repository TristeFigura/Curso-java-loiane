package curso.java.aula15;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com duas notas separadas por espaço:");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media <= 10 && media > 9)
		{
			System.out.println("Notas: " + nota1 +" E "+ nota2);
			System.out.println("Média das notas: " + media + " APROVADO");
		}
		else if (media <= 9 && media > 7.5)
		{
			System.out.println("Nota: B");
		}
		else if (media <= 7.5 && media > 6)
		{
			System.out.println("Nota: C");
		}
		else if (media <= 6 && media > 4)
		{
			System.out.println("Nota: D");
		}
		else if (media <= 4 && media > 0)
		{
			System.out.println("Nota: E");
		}
		else
		{
			System.out.println("Entrada inválida.");
		}

	}

}
