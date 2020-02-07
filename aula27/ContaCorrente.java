package curso.java.aula27;
import java.util.Scanner;

public class ContaCorrente {
	
	Scanner scan = new Scanner(System.in);
	String numConta;
	double saldo;
	boolean statusEspecial;
	double limite;
	boolean saque;
	int valorSaque;
	boolean continuar = false;
	Byte opcao;
	
	void infoConta()
	{
		System.out.println("N�mero da conta " + numConta);
	}
	void menu()
	{
		while (!continuar)
		{
			System.out.println("Bem vindo ao Banco dos Mercen�rios");
			System.out.println("Para saques, digite 1.");
			System.out.println("Para dep�sitos, digite 2.");
			System.out.println("Para consultar saldo, digite 3.");
			System.out.println("Para sair, digite 4.");
			opcao = scan.nextByte();
				if (opcao == 1)
				{
					if (saldo >= 0)
					{
						System.out.println("Entre com o valor do saque.");
						valorSaque = scan.nextInt();
						if (valorSaque > saldo)
						{
							boolean cont2 = false;
							while(!cont2)
							{
								System.out.println("Valor do saque maior que o saldo dispon�vel.");
								System.out.println("Deseja utilizar o cheque especial? S/N");
								String chequeEsp = scan.next();
								if (chequeEsp.equalsIgnoreCase("S"))
								{
									cont2 = true;
									if (valorSaque > limite)
									{
									System.out.println("N�o foi poss�vel realizar o saque, excedeu o limite.");
									}
									else if (valorSaque < limite)
									{
											cont2 = true;
											System.out.println("Saque realizado com sucesso.");
											limite -= valorSaque;
									}
								}
								else if (chequeEsp.equalsIgnoreCase("N"))
								{
									cont2 = true;
									System.out.println("Sa� daqui, quebrado.");
								}
								else
								{
									System.out.println("Entrada inv�lida.");
								}
							}
						}
						else if (valorSaque <= saldo)
						{
							System.out.println("Saque realizado com sucesso.");
							saldo -= valorSaque;
						}
					}
				}
				
				else if (opcao == 2)
				{
					System.out.println("Entre com o valor do dep�sito.");
					int valorDeposito = scan.nextInt();
					saldo += valorDeposito;
					System.out.println("Dep�sito realizado com sucesso.");
				}
				
				else if (opcao == 3)
				{
					System.out.println("Saldo = " + saldo);
					System.out.println("Limite cheque especial = " + limite);
				}
				
				else if (opcao == 4)
				{
					System.out.println("Vai tarde!!");
					continuar = true;
				}
				else
				{
					System.out.println("Entrada inv�lida, digite novamente.");
				}
			
		}
	}

	
		
}
