package curso.java.aula43labs.exer02;

public class PessoaJuridica {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String s = "Nome: " + nome + "\n";
		return s;
	}
	
	public double calcularImposto(double rendaBruta) {
		return rendaBruta*0.1;
	}
	


}
