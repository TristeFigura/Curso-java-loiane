package curso.java.aula17;
import java.util.Scanner;

public class Exercicio33 {
	
			public static void main(String[] args) {
				
				Scanner scan = new Scanner(System.in);
				
				int t, i;
				double s = 0;
				double n = 1;
				double m = 1;
				System.out.println("Entre com o n-ésimo termo da série.");
				t = scan.nextInt();
				
				for (i = 0; i < t; i++)
				{
					
					s += (n/m);
					n++;
					m += 2;
					System.out.println(n + " " + m);
				}
				
				System.out.println(s);
			}

}
