package curso.java.aula17;
import java.util.Scanner;


public class Exercicio1 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int nota;
			boolean valido = false;
			
			do
			{
			System.out.println("Entre com uma nota entre zero e dez: ");
			nota = scan.nextInt();
				if (nota <= 10 && nota >= 0)
				{
					valido = true;
				}
				else
				{
					System.out.println("Nota inválida.");
				}
			}
			while (valido == false);
			
			System.out.println("A nota digitada foi " + nota);
			
		}

}
