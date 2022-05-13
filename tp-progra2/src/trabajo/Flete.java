package trabajo;

public class Flete extends Transporte{
	private int acompañante;
	private int costoAcompañante;
	
	public Flete(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompañante) {
		super(iD, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompañante = acompañante;
		
		
		
	}
	
	

}
