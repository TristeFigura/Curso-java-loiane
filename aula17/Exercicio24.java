package curso.java.aula17;
import java.util.Scanner;

public class Exercicio24 {
		
		public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			double precoPao = 0;
			double precoTab = 0;
			
			System.out.println("Entre com o preço atual do pão.");
			precoPao = scan.nextDouble();
			
			for (int i = 1; i <= 50; i++)
			{
				precoTab = precoPao*i;
				System.out.println(i + " - R$ " + precoTab);
			}
		}

}
