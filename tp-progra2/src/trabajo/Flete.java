package trabajo;

public class Flete extends Transporte{
	private int acompaņante;
	private int costoAcompaņante;
	
	public Flete(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompaņante) {
		super(iD, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompaņante = acompaņante;
		
		
		
	}
	
	

}
