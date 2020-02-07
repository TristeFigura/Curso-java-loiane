package curso.java.aula17;
import java.util.Scanner;

public class Exercicio27 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			double temperatura;
			double soma = 0;
			double media = 0;
			int i = 0;
			String continuar;
			boolean valido = true;
			double tempMax = Double.MIN_VALUE;
			double tempMin = Double.MAX_VALUE;
			do
			{
				System.out.println("Deseja informar nova temperatura? S/N");
				continuar = scan.next();
				if (continuar.equalsIgnoreCase("S"))
				{
				System.out.println("Entre com a temperatura: ");
				temperatura = scan.nextDouble();
				soma += temperatura;
				i++;
					if (temperatura > tempMax)
					{
						tempMax = temperatura;
					}
					if (temperatura < tempMin)
					{
						tempMin = temperatura;
					}
				}
				else if (continuar.equalsIgnoreCase("N"))
				{
					media = soma/i;
					System.out.println("Menor temperatura : " + tempMin + " Maior temperatura : " + tempMax);
					System.out.println("Temperatura média: " + media);
					valido = false;
;				}
				else
				{
					System.out.println("Entre com uma opção válida.");
				}
			}
			while(valido == true);
		}

}
