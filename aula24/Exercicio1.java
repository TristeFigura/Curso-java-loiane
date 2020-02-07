package curso.java.aula24;

public class Exercicio1 {

	public static void main(String[] args) {
				
				Luz lampada = new Luz();
				
				lampada.marca = "Kian";
				lampada.corDaLuz = "Branca";
				lampada.tipo = "led";
				lampada.potenciaW = 6;
				lampada.tensao = 127;
				
				
				System.out.println(lampada.marca);
				System.out.println(lampada.tipo);
				System.out.println(lampada.tensao);

	}

}
