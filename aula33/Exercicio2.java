package curso.java.aula33;

import curso.java.aula27.ContaCorrente2;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);
		
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(10);
		if (saqueEfetuado)
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.getSaldo());
		}
		else
		{
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
			
		}
		
		saqueEfetuado = conta.realizarSaque(500);
		
		if (saqueEfetuado)
		{
			System.out.println("Saque efetuado com sucesso");
			System.out.println("Saldo atual da conta = " + conta.getSaldo());
		}
		else
		{
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
			
		}
		System.out.println("Depósito de 500 reais");
		conta.depositar(500);
		System.out.println("Saldo atual da conta = " + conta.getSaldo());
		
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
