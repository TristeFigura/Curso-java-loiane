package curso.java.aula12;
import java.util.Scanner;


public class LeituraDadosTeclado {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);
		
		System.out.println("Digite seu  primeiro nome:");
		String primeiroNome = scan.next();
		System.out.println("Seu primeiro nome �: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade); 
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble();
		System.out.println("Sua idade �: " + altura);*/
		
		System.out.println("Digite seu primeiro nome, idade, profiss�o, altura e se tem filhos");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		String profissao = scan.next();
		double altura = scan.nextDouble();
		boolean temFilhos = scan.nextBoolean();
		
		System.out.println("Seus dados s�o:");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Profiss�o: " + profissao);
		System.out.println("Altura: " + altura);
		System.out.println("Tem filhos: " + temFilhos);
		
	}

}
