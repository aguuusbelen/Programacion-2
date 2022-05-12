package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(int iD, int pesoMax, int volMax, boolean refrigeracion, int kmViaje) {
		super(iD, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = true;
	}
	
	
	
}
