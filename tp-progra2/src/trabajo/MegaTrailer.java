package trabajo;

public class MegaTrailer extends Transporte {
	
	private float comida;
	
	public MegaTrailer(int id, int pesoMax, int volMax, boolean refrigeracion, int kmViaje, float comida, float seguro) {
		super(id, pesoMax, volMax, refrigeracion, kmViaje);
		this.seguro = seguro;
		this.comida = comida;
	}

}
