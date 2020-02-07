package curso.java.aula15;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Interrogatório: responda com sim ou não.");
		System.out.println("Telefonou para a vítima?");
		String resp1 = scan.next();
		System.out.println("Esteve no local do crime?");
		String resp2 = scan.next();
		System.out.println("Mora perto da vítima?");
		String resp3 = scan.next();
		System.out.println("Devia para a vítima?");
		String resp4 = scan.next();
		System.out.println("Já trabalhou com a vítima?");
		String resp5 = scan.next();
		
		int cont = 0;
		
		if (resp1.equalsIgnoreCase("sim"))
		{
			cont++;
		}
		if (resp2.equalsIgnoreCase("sim"))
		{
			cont++;
		}
		if (resp3.equalsIgnoreCase("sim"))
		{
			cont++;
		}
		if (resp4.equalsIgnoreCase("sim"))
		{
			cont++;
		}
		if (resp5.equalsIgnoreCase("sim"))
		{
			cont++;
		}
/*
		if (cont == 2)
		{
			System.out.println("Suspeito");
		}
		else if (cont == 3 || cont == 4)
		{
			System.out.println("Cúmplice");
		}
		else if (cont == 5)
		{
			System.out.println("Assassino");
		}
		else if (cont < 2)
		{
			System.out.println("Inocente");
		}
												*/
		
		switch (cont)
		{
		case 0: System.out.println("Inocente"); break;
		case 1: System.out.println("Inocente"); break;
		case 2: System.out.println("Suspeito"); break;
		case 3: System.out.println("Cúmplice"); break;
		case 4: System.out.println("Cúmplice"); break;
		case 5: System.out.println("Assassino"); break;
		default: System.out.println("A vida não tem sentido nem valor,\r\n" + 
				"senão aceitarmos de antemão que ela faz parte de um todo mais amplo complexo do que nós mesmos");
		}
	}
}
