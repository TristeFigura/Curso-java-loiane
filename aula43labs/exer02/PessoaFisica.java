package curso.java.aula43labs.exer02;

public class PessoaFisica {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double calcularImposto(double rendaBruta) {
		if (rendaBruta > 1400 && rendaBruta <= 2100) {
			return (rendaBruta*0.1)-100;
		} else if (rendaBruta > 2100 && rendaBruta <= 2800) {
				return (rendaBruta*0.15)-270;
		} else if (rendaBruta > 2800 && rendaBruta <= 3600) {
			return (rendaBruta*0.25)-500;
		} else if (rendaBruta > 3600) {
			return (rendaBruta*0.3)-700;
		}
		
		return 0;
	}

	@Override
	public String toString() {
		String s = "Nome: " + nome + "\n";
		return s;
	}
}
