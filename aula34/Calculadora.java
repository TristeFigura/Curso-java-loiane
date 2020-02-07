package curso.java.aula34;

public class Calculadora {
	

	public static double num1, num2;
	
	
	public Calculadora() {
		num1 = 0;
		num2 = 3;
	}
	
	
	public static double somar(double num1, double num2) {
		return num1 + num2;
	}
	
	public static double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public static double dividir(double num1, double num2) {
			return num1 / num2;
	}
	
	public static double elevar(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static double fatorial(double num1) {
		double fat = 1;
		if (num1 != 0) {
			for (double i = num1; i > 0; i--) {
			fat *= i;
			}
		}
		else if (num1 == 0) {
			fat = 1;
		}
		return fat;
	}
	
	public static void imprimirResultado() {
		System.out.println(somar(num1,num2));
		System.out.println(subtrair(num1,num2));
		System.out.println(elevar(num1,num2));
		System.out.println(dividir(num1,num2));
		System.out.println(fatorial(num1));
	}

}
