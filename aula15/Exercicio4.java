package curso.java.aula15;
import java.util.Scanner;


public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String letra = scan.next();
		
		/* if (letra.equalsIgnoreCase("a"))
		{
			System.out.println("� uma vogal!");
		}
		else if (letra.equalsIgnoreCase("e"))
		{
			System.out.println("� uma vogal!");
		}
		else if (letra.equalsIgnoreCase("i"))
		{
			System.out.println("� uma vogal!");
		}
		else if (letra.equalsIgnoreCase("o"))
		{
			System.out.println("� uma vogal!");
		}
		else if (letra.equalsIgnoreCase("u"))
		{
			System.out.println("� uma vogal!");
		}
		else
		{
			System.out.println("� uma consoante!");
		}
		*/
	

	
		//Com switch
	if (letra.length() > 1)
	{
		System.out.println("N�o � uma letra v�lida");
	}
	else
	{
	switch (letra) {
	case "a": System.out.println("Vogal"); break;
	case "A": System.out.println("Vogal"); break;
	case "e": System.out.println("Vogal"); break;
	case "i": System.out.println("Vogal"); break;
	case "o": System.out.println("Vogal"); break;
	case "u": System.out.println("Vogal"); break;
	default: System.out.println("Consoante");
		}	
	}
	}
}
