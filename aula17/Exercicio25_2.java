package curso.java.aula17;
import java.util.Scanner;

public class Exercicio25_2 {
		
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Lojas Tabajara");
				boolean sair = false;
				String continuarCompra;
				double qtdProdutos;
				do
				{
					System.out.println("Deseja informar uma nova compra?  S/N");
					continuarCompra = scan.next();
					if (continuarCompra.equalsIgnoreCase("s"))
					{
						System.out.println("Digite a quantidade de produtos da compra: ");
					}
					else
					{
						sair = true; 
					}
				
					
				}
				while(sair == true);
				
				
			}

}
