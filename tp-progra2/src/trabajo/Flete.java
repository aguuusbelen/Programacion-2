package trabajo;

public class Flete extends Transporte{
	private int acompaņante;
	private int costoAcompaņante;
	
	public Flete(String matricula, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompaņante) {
		super(matricula, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompaņante = acompaņante;
		
		
		
	}
	
	

}
