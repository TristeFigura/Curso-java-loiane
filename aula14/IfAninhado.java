package curso.java.aula14;
import java.util.Scanner;
public class IfAninhado {

	public static void main(String[] args) {
	
			Scanner s = new Scanner(System.in);
			
			System.out.println("Entre com o preço do item");
			double valor = s.nextDouble();
			
			if (valor <= 10)
			{
				System.out.println("Está barato, pode comprar");
			}
			 else if (valor > 10 && valor < 15)
			 {
				System.out.println("Você pode pedir uns desconto");
			 }
			 else if (valor >= 15 && valor < 17)
			 {
				 System.out.println("Pode pesquisar mais")	 ;
			 }
			 else //valor >= 17
			 {
				 System.out.println("MUITO CARO");
			 }

	}

}
