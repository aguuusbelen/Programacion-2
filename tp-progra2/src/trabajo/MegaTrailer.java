package trabajo;

public class MegaTrailer extends Transporte {
	
	private int comida;
	
	public MegaTrailer(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int comida) {
		super(iD, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.seguro = true;
		this.comida = comida;
	}

}
