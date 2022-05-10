package trabajo;

public class Transporte {
	
	private int ID;
	private int pesoMax;
	private int volumenMax;
	private boolean refrigeracion;
	private int kmViaje;
	protected boolean seguro;
	
	
	public Transporte(int iD, int pesoMax, int volumenMax, boolean refrigeracion, int kmViaje) {
		
		ID = iD;
		this.pesoMax = pesoMax;
		this.volumenMax = volumenMax;
		this.refrigeracion = refrigeracion;
		this.kmViaje = kmViaje;
		
	}
	
	

}
