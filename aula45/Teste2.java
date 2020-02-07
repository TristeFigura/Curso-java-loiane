package curso.java.aula45;

public class Teste2 {
	
		public static void main(String[] args) {
			
			//exemplo 1: ok
			//retorno do m�todo pode referenciar String
			Object obj1 = obterString();
			String s1 = (String) obj1;
			
			//exemplo 2: ok
			//obj2 referencia String explicitamente
			Object obj2 = "Minha String";
			String s2 = (String) obj2;
			
			//exemplo 3: falha em tempo de execu��o
			//obj3 n�o referencia String
			Object obj3 = new Object();
			String s3 = (String) obj3;
			
			//exemplo 4: falha em tempo de compila��o
			//obj4 nunca referencia String j� que retorno do m�todo � int
			Object obj4 = obterInteiro();
			String s4 = (String) obj4;
		}
		
		public static String obterString() {
			return "minha String";
		}
		
		public static int obterInteiro() {
			return 1;
		}

}
