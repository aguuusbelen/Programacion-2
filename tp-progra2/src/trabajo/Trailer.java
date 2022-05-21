package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(String matricula, int pesoMax, int volMax, boolean refrigeracion, int kmViaje, float seguro) {
		super(matricula, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = seguro;
	}
	
	
	
}
