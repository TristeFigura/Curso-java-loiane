package curso.java.aula49;

public class FinalllyPegadinha {
	
	public static void main(String[] args) {

		int[] numeros = {4, 8, 16, 32, 64, 128};
		int[] demon = {2, 0, 4, 8, 0};

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = "  + (numeros[i]/demon[i]));
			}
			catch (ArithmeticException e1) {
				System.out.println("Erro ao dividir por zero");
				System.exit(0);
			}
			catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("Posição do array inválida");
				System.exit(0); //System.exit(0); ao terminar execução do programa dentro do try ou catch, finally
				//não é executado!
			}
			finally {
				System.out.println("Essa linha é impressa sempre após o try ou catch");
				System.out.println();
				
			}
		}


	}
}
