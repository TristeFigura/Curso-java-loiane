package curso.java.aula27;

public class Exercicio2_1 {
	
		public static void main(String[] args) {
			
			ContaCorrente2 conta = new ContaCorrente2();
			conta.numero = "123456";
			conta.agencia = "1234";
			conta.especial = true;
			conta.limiteEspecial = 500;
			conta.valorEspecialUsado = 0;
			conta.saldo = -10;
			
			System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
			
			boolean saqueEfetuado = conta.realizarSaque(10);
			if (saqueEfetuado)
			{
				System.out.println("Saque efetuado com sucesso");
				System.out.println("Saldo atual da conta = " + conta.saldo);
			}
			else
			{
				System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
				
			}
			
			saqueEfetuado = conta.realizarSaque(500);
			
			if (saqueEfetuado)
			{
				System.out.println("Saque efetuado com sucesso");
				System.out.println("Saldo atual da conta = " + conta.saldo);
			}
			else
			{
				System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
				
			}
			System.out.println("Depósito de 500 reais");
			conta.depositar(500);
			System.out.println("Saldo atual da conta = " + conta.saldo);
			
			conta.consultarSaldo();
			
			if (conta.verificarUsoChequeEspecial())
			{
				System.out.println("Está usando cheque especial");
			}
			else
			{
				System.out.println("Não está usando cheque especial");
			}
			conta.consultarSaldo();
			saqueEfetuado = conta.realizarSaque(600);
			conta.consultarSaldo();
			if (conta.verificarUsoChequeEspecial())
			{
				System.out.println("Está usando cheque especial");
			}
			else
			{
				System.out.println("Não está usando cheque especial");
			}
		}

}
