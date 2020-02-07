package curso.java.aula17;
import java.util.Scanner;

public class Exercicio32 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int cod, qtd;
			int total = 0;
			String output = "";
			boolean naoTerminar = true;
			
			do
			{
				System.out.println("Digite o código e a quantidade. Digite 0 0 para sair.");
				cod = scan.nextInt();
				qtd = scan.nextInt();
				
				if (cod == 0 && qtd == 0)
				{
					naoTerminar = false;
				}
				else
				{
					switch(cod)
					{
					case 100: System.out.println("Cachorro quente" + "\n" + "Preço = 1,2" + " x " + qtd + " = " + (qtd*1.2)); total += qtd*1.2; break;
					case 101: System.out.println("Bauru Simples" + "\n" + "Preço = 1,3" + " x " + qtd + " = " + (qtd*1.3)); total += qtd*1.3; break;
					case 102: System.out.println("Bauru com ovo" + "\n" + "Preço = 1,5" + " x " + qtd + " = " + (qtd*1.5)); total += qtd*1.5; break;
					case 103: System.out.println("Hambúrguer" + "\n" + "Preço = 1,2" + " x " + qtd + " = " + (qtd*1.2)); total += qtd*1.2; break;
					case 104: System.out.println("Cheeseburguer" + "\n" + "Preço = 1,3" + " x " + qtd + " = " + (qtd*1.3)); total += qtd*1.3; break;
					case 105: System.out.println("Refrigerante" + "\n" + "Preço = 1" + " x " + qtd + " = " + (qtd*1)); total += qtd*1; break;
					}
				}
			
				
			}
			while(naoTerminar);
				
			System.out.println("Valor total do pedido: R$ " + total);
		}

}
