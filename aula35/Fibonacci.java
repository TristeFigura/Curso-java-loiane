package curso.java.aula35;

public class Fibonacci {
	
		public static int seqFib(int n) {
			
			if (n < 2) {
				return 1;
			}
			
			return seqFib(n-1) + seqFib(n-2);
		}
		
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
		System.out.print(seqFib(i) + " ");
		}
	}

}
