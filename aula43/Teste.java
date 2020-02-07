package curso.java.aula43;

public class Teste {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		aluno.setCurso("Engenharia computação");
		double[] notas = {10,9,8,7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "sancho";
		String s2 = "sancho";
		
		System.out.println(s1.equals(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Engenharia computação");
		double[] notas2 = {10,9,4,5};
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
