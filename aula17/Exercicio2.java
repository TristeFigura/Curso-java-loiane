package curso.java.aula17;
import java.util.Scanner;


public class Exercicio2 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			boolean infoValidas = false;
			
			do 
			{
				System.out.println("Entre com o nome do usuário: ");
				String nomeUser = scan.next();
				
				System.out.println("Entre com a senha: ");
				String senha = scan.next();
				
				if (nomeUser.equalsIgnoreCase(senha))
				{
					System.out.println("Senha igual ao nome de usuário, digite novamente a senha.");
				}
				else
				{
					infoValidas = true;
					System.out.println("Senha e usuários válidos.");
				}
				
			}
			while (infoValidas == false);
		}

}
