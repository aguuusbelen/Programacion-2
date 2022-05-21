package trabajo;

public class Flete extends Transporte{
	private int acompañante;
	private int costoAcompañante;
	
	public Flete(String matricula, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompañante) {
		super(matricula, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompañante = acompañante;
		
		
		
	}
	
	

}
