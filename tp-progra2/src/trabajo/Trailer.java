package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(int iD, int pesoMax, int volMax, boolean refrigeracion, int kmViaje, float seguro) {
		super(iD, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = seguro;
	}
	
	
	
}
