package trabajo;

public class MegaTrailer extends Transporte {
	
	private float comida;
	
	public MegaTrailer(int iD, int pesoMax, int volMax, boolean refrigeracion, int kmViaje, float comida, float seguro) {
		super(iD, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = seguro;
		this.comida = comida;
	}

}
