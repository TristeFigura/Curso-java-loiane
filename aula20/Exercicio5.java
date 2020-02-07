package curso.java.aula20;
import java.util.Scanner;

public class Exercicio5 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			String[][][] compromissos = new String[12][31][8];
			boolean sair = false;
			byte opcao;
			int mes = 0;
			int dia = 0;
			int hora = 0;
			
			while(!sair)
			{
				System.out.println("Digite 1 para adicionar compromisso.");
				System.out.println("Digite 2 para consultar compromisso.");
				System.out.println("Digite 0 para sair.");
				opcao = scan.nextByte();
				if (opcao == 1)
				{
					boolean mesValido = false;
					while (!mesValido)
					{
					System.out.println("Entre com o mês.");
					mes = scan.nextInt();
							if (mes >= 1 && mes <= 12)
							{
								mesValido = true;
							}
							else
							{
								System.out.println("Mês inválido, digite novamente.");
							}
					}
					
					boolean diaValido = false;
					while (!diaValido)
					{
						System.out.println("Entre com o dia.");
						dia = scan.nextInt();
						if (dia >= 1 && dia <= 31)
						{
							diaValido = true;
						}
						else
						{
							System.out.println("Dia inválido, digite novamente.");
						}
					}
					
					boolean horaValida = false;
					while (!horaValida)
					{
						System.out.println("Entre com a hora.");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 8)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválida, digite novamente;");
						}
					}
					
					dia--;
					hora--;
					mes--;
					System.out.println("Digite o compromisso: ");
					compromissos[mes][dia][hora] = scan.next();
				}
				
				else if (opcao == 2)
				{
					boolean mesValido = false;
					while (!mesValido)
					{
					System.out.println("Entre com o mês.");
					mes = scan.nextInt();
							if (mes >= 1 && mes <= 12)
							{
								mesValido = true;
							}
							else
							{
								System.out.println("Mês inválido, digite novamente.");
							}
					}
					
					boolean diaValido = false;
					while (!diaValido)
					{
						System.out.println("Entre com o dia.");
						dia = scan.nextInt();
						if (dia >= 1 && dia <= 31)
						{
							diaValido = true;
						}
						else
						{
							System.out.println("Dia inválido, digite novamente.");
						}
					}
					
					boolean horaValida = false;
					while (!horaValida)
					{
						System.out.println("Entre com a hora.");
						hora = scan.nextInt();
						if (hora >= 0 && hora <= 24)
						{
							horaValida = true;
						}
						else
						{
							System.out.println("Hora inválida, digite novamente;");
						}
					}
					
					dia--;
					hora--;
					mes--;
					System.out.println("O compromisso agendado é: ");
					System.out.println(compromissos[mes][dia][hora]);
				}
			
				else if (opcao == 0)
				{
				sair = true;
				}
				else
				{
				System.out.println("Opção inválida, digite novamente.");
				}
			}
		}

}
