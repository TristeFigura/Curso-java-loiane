package curso.java.aula17;
import java.util.Scanner;

public class Exercicio30 {

		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int valorInicial, valorFinal, tab, i;
			int result = 0;
			boolean continuar = true;
			do
			{
				continuar = true;
			System.out.println("Entre com o número da tabuada.");
			tab = scan.nextInt();
			System.out.println("Entre com o valor inicial.");
			valorInicial = scan.nextInt();
			System.out.println("Entre com o valor final.");
			valorFinal = scan.nextInt();
				if (valorInicial > valorFinal)
				{
					continuar = false;
					System.out.println("O valor inicial não pode ser maior que o final. Digite novamente.");
				}
			}
			while (continuar == false);
		
			System.out.println("Montar a tabuada de: " + tab);
			System.out.println("Começar por: " + valorInicial);
			System.out.println("Terminar por: " + valorFinal);
			
			for (i = valorInicial; i <= valorFinal; i++)
			{
				result = tab*i;
				System.out.println(tab + " X " + i + " = " + result);
			}
			
		}
}
