package trabajo;

public class Transporte {
	
	private int ID;
	private int pesoMax;
	private int volMax;
	private boolean refrigeracion;
	private int kmViaje;
	protected boolean seguro;
	
	
	public Transporte(int iD, int pesoMax, int volMax, boolean refrigeracion, int kmViaje) {
		
		ID = iD;
		this.pesoMax = pesoMax;
		this.volMax = volMax;
		this.refrigeracion = refrigeracion;
		this.kmViaje = kmViaje;
		
	}
	
	

}
