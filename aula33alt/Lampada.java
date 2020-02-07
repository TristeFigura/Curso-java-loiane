package curso.java.aula33alt;

public class Lampada {
	
	private String marca;
	private String tipo;
	private String corDaLuz;
	private double potenciaW;
	private int tensao;
	private boolean ligada;
	
	public Lampada() {
	}

	public Lampada(String marca, String tipo, String corDaLuz, double potenciaW, int tensao, boolean ligada) {
		this.marca = marca;
		this.tipo = tipo;
		this.corDaLuz = corDaLuz;
		this.potenciaW = potenciaW;
		this.tensao = tensao;
		this.ligada = ligada;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCorDaLuz() {
		return corDaLuz;
	}

	public void setCorDaLuz(String corDaLuz) {
		this.corDaLuz = corDaLuz;
	}

	public double getPotenciaW() {
		return potenciaW;
	}

	public void setPotenciaW(double potenciaW) {
		this.potenciaW = potenciaW;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	
	

}
