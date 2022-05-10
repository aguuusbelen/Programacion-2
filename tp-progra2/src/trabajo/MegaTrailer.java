package trabajo;

public class MegaTrailer extends Transporte {
	
	public MegaTrailer(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje) {
		super(iD, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.seguro = true;
	}
	

}
