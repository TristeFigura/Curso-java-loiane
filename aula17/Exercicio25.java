package curso.java.aula17;
import java.util.Scanner;

public class Exercicio25 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
		
				System.out.println("Lojas Tabajara");
				
				boolean sair = false;
				int qntProd;
				double valorProd, valorPag, troco;
				double soma = 0;
				String prox;
				do 
				{
					System.out.println("Entre com a quantidade de produtos da compra: ");
					qntProd = scan.nextInt();
				
					for (int i = 0; i < qntProd; i++)
					{
						System.out.println("Entre com o valor do " + (i+1) + "° produto:");
						valorProd = scan.nextDouble();
						soma += valorProd;
					}
					
					System.out.println("Valor total da compra: " + soma);
					System.out.println("Entre com o valor do pagamento: ");
					valorPag = scan.nextDouble();
					troco = valorPag - soma;
					System.out.println("Valor do troco: " + troco);
					
					System.out.println("Próxima compra?");
					prox = scan.next();
					if (prox.equalsIgnoreCase("0"))
					{
						sair = true;
					}
					else
					{
						System.out.println("Próxima compra!");
					}
					
			
				}
				while(sair == false);
			}

}
