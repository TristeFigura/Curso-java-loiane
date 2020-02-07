package curso.java.aula29;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		
		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);
		
		Carro2 carro2 = new Carro2();
			
		
	}

}
