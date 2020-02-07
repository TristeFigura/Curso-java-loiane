package curso.java.aula17;
import java.text.DecimalFormat;

public class Exercicio31a {
	
		public static void main(String[] args) {
			
			double aumento = 0.015;
			double salario = 1000;
			salario += (aumento*salario);
			
			DecimalFormat format = new DecimalFormat("###,###.##");
			
			for (int i = 1997; i <= 2015; i++)
			{
				aumento *= 2;
				salario += (aumento*salario);
				System.out.println(i + " = " + format.format(salario) + " - " + aumento +"%");
			}
			
		}

}
