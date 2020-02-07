package curso.java.aula17;
import java.util.Scanner;

public class Exercicio16 {
	
		public static void main(String[] args) {
			
		
			
		
			double primeiro = 1;
			double segundo = 1;
			double prox = 0;
			
		
			
			System.out.println(primeiro);
			System.out.println(segundo);
			
			while (prox <= 500)
			{
				prox = primeiro + segundo;
				primeiro = segundo;
				segundo = prox;
				System.out.println(prox);
			}
		}

}
