package curso.java.aula52labs;

public class AgendaCheiaExeption extends Exception {
	
	@Override
	public String getMessage() {
		return "Agenda já está cheia";
	}

}
