package trabajo;

public class Flete extends Transporte{
	private int acompa�ante;
	private int costoAcompa�ante;
	
	public Flete(String matricula, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje, int acompa�ante) {
		super(matricula, pesoMax, volumenMax, refrigeracion, kmViaje);
		this.acompa�ante = acompa�ante;
		
		
		
	}
	
	

}
