package curso.java.aula35;

public class Somatorio {
	
	public static int sum(int n) {
		
		if (n == 1) {
			return n;
		}
		
		return n + sum(n-1);
	}

	
		public static void main(String[] args) {
			
			for (int i = 1; i <= 10; i++) {
			System.out.print(sum(i) + " ");
			}
			
			System.out.println(sum(10));
		}
}
