package curso.java.aula27;

public class Lampada {
	
	String marca;
	String tipo;
	String corDaLuz;
	double potenciaW;
	int tensao;
	boolean ligada;
	
		void ligar() {
				ligada = true;
		}
		
		void desligar() {
				ligada = false;
		}

		void mostrarEstado() 
		{
			if (ligada)
			{
				System.out.println("A lâmpada está ligada");
			}
			else
			{
				System.out.println("A lâmpada está desligada");
			}
		}
		
		void mudarEstado()
		{
			if (ligada)
			{
				desligar();
			}
			else
			{
				ligar();
			}
		}
}
