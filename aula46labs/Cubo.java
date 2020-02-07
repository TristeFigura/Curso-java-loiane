package curso.java.aula46labs;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

	private int lado;

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularVolume() {
		return 6*(lado*lado);
	}

	@Override
	public double calcularArea() {
		return lado*lado*lado;
	}
	
}
