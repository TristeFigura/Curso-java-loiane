package curso.java.aula43labs.exer02alt;

public class Teste {

	public static void main(String[] args) {
	
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("249.877.713-06");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("84.178.285/0001-45");
		
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("410.307.738-74");
		
		PessoaJuridica p4 = new PessoaJuridica(); 
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("50.500.434/0001-29");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("406.010.360-85");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 04");
		p6.setRendaBruta(4000);
		p6.setCnpj("49.662.858/0001-00");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}

}
