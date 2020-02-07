package curso.java.aula43labs.exer03;

public class Mamifero extends Animal {
	
		private String alimento;

		public Mamifero() {
			super(); //chamando o construtor padrão da classe Animal " this patas = 4 "
			this.setCor("Castanho");
			this.setAmbiente("Terra");
			this.alimento = "Mel";
		}
		
		public String getAlimento() {
			return alimento;
		}

		public void setAlimento(String alimento) {
			this.alimento = alimento;
		}
		
		@Override
		public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		return s;
		}
		
	
		
}
