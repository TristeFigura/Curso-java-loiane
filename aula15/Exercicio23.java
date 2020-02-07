package curso.java.aula15;
import java.util.Scanner;


public class Exercicio23 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Entre com o tipo da carne:");
		 String tipoCarne = scan.next();
		 
		 System.out.println("Entre com a quantidade do produto em kg:");
		 double qntCarne = scan.nextDouble();
		 
		 System.out.println("Pagamento com o cartão da loja?");
		 String pagamento = scan.next();
		 
		 double fileDuplo;
		 double alcatra;
		 double picanha;
		 double total = 0;
		 double desconto = 0;
		 
		 if (qntCarne <= 5)
		 {
			fileDuplo = 4.9;
			alcatra = 5.9;
			picanha = 6.9;
		 }
		 else
		 {
			fileDuplo = 5.8;
			alcatra = 6.8;
			picanha = 7.8;
		 }
		 
		 if (tipoCarne.equalsIgnoreCase("Filé Duplo"))
		 {
			 total = fileDuplo * qntCarne;
		 }
		 else if (tipoCarne.equalsIgnoreCase("Alcatra"))
		 {
			 total = alcatra * qntCarne;
		 }
		 else if (tipoCarne.equalsIgnoreCase("Picanha"))
		 {
			 total = picanha * qntCarne;
		 }
		 
		 switch (pagamento)
		 {
		 case "sim" : desconto = total * 0.05; break;
		 case "não" : desconto = 0; break;
		 }
		 

		 System.out.println("Cupom fiscal");
		 System.out.println("Descrição: " + tipoCarne + " " + "Quantidade: " + qntCarne + "kg" + " Desconto: " + desconto + " Total: " + (total-desconto));
		 System.out.println("Pagamento com cartão da loja? " + pagamento);
	}

}
