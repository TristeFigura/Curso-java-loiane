package curso.java.aula17;

public class Exercicio23 {

		public static void main(String[] args) {
			
			double preço = 0;
			
			for (int i = 1; i <= 50; i++)
			{
				preço = 1.99 * i;
				System.out.println(i + " - R$ " + preço);
			}
		}
}
