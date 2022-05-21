package trabajo;

public class Flete extends Transporte{
	private int acompaniante;
	private int costoAcompaniante;
	
	public Flete(String matricula, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompaniante) {
		super(matricula, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompaniante = acompaniante;
		
		
		
	}
	
	

}
