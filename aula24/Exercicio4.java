package curso.java.aula24;

import java.util.Date;

public class Exercicio4 {

			public static void main(String[] args) {
				
				LivroDeBiblioteca livro = new LivroDeBiblioteca();
				
				livro.titulo = "Dom Quixote";
				livro.ano = 1785;
				livro.autor = "Miguel de Cervantes";
				livro.peso = 3;
				livro.numPaginas = 328;
				livro.nomeCliente = "Sancho Pança";
				livro.dataEmprestimo = new Date();
				
				System.out.println(livro.nomeCliente);
				System.out.println(livro.dataEmprestimo);
			}
}
