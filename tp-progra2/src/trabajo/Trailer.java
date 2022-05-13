package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(int id, int pesoMax, int volMax, boolean refrigeracion, int kmViaje, float seguro) {
		super(id, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = seguro;
	}
	
	
	
}
