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
				System.out.println("Posi��o do array inv�lida");
				System.exit(0); //System.exit(0); ao terminar execu��o do programa dentro do try ou catch, finally
				//n�o � executado!
			}
			finally {
				System.out.println("Essa linha � impressa sempre ap�s o try ou catch");
				System.out.println();
				
			}
		}


	}
}
