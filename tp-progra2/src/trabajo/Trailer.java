package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje) {
		super(iD, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.seguro = true;
	}
	
	
	
}
