package curso.java.aula42;

public class Professor {
	
	 
	private double salario;
	private String nomeCurso;
	
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	public double calcularSalarioLiquido() {
		return 0;
	}
	
	public String obterEtiquetaEndereco() {
		
		String s = "Endere�o do Professor: ";
		//s += this.getEndereco();
		
		return s;
	}
	//@Override
	public void imprimirEtiquetaEndereco() {
		
		System.out.println("Imprimindo endere�o do professor");
		System.out.println(this.obterEtiquetaEndereco());
		
	}

}
