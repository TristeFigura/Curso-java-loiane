package curso.java.aula43labs.exer02;

public class Teste {
	
		public static void main(String[] args) {
			
			System.out.println("***Pessoas Jurídicas***");
			
			System.out.println();
			PessoaJuridica jurid1 = new PessoaJuridica();
			jurid1.setNome("Sancho");
			System.out.print(jurid1);
			imprimirImposto(jurid1.calcularImposto(8500));
			System.out.println();
			
			PessoaJuridica jurid2 = new PessoaJuridica();
			jurid2.setNome("Quixote");
			System.out.print(jurid2);
			imprimirImposto(jurid1.calcularImposto(6350));
			System.out.println();
			
			PessoaJuridica jurid3 = new PessoaJuridica();
			jurid3.setNome("Toboso");
			System.out.print(jurid3);
			imprimirImposto(jurid3.calcularImposto(7355.32));
			System.out.println();
			
			System.out.println("***Pessoas Físicas***");
			
			System.out.println();
			PessoaFisica fisica1 = new PessoaFisica();
			fisica1.setNome("Alpino");
			System.out.print(fisica1);
			imprimirImposto(fisica1.calcularImposto(1800));
			
			System.out.println();
			PessoaFisica fisica2 = new PessoaFisica();
			fisica2.setNome("Dolores");
			System.out.print(fisica2);
			imprimirImposto(fisica2.calcularImposto(5500));
			
			System.out.println();
			PessoaFisica fisica3 = new PessoaFisica();
			fisica3.setNome("Huxley");
			System.out.print(fisica3);
			imprimirImposto(fisica3.calcularImposto(10000));
			
			
		}
	public static void imprimirImposto(double valor) {
		System.out.println("Valor a ser pago: " + valor);
	}
}
