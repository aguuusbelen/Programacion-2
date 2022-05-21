package trabajo;

public class Transporte {
	
	private String idTransporte;
	private int pesoMax;
	private int volMax;
	private boolean refrigeracion;
	private int kmViaje;
	protected float seguro;
	
	
	public Transporte(String idTransporte, int pesoMax, int volMax, boolean refrigeracion, int kmViaje) {
		
		this.idTransporte = idTransporte;
		this.pesoMax = pesoMax;
		this.volMax = volMax;
		this.refrigeracion = refrigeracion;
		this.kmViaje = kmViaje;
		
		
	}


	@Override
	public String toString() {
		return "Transporte [ID=" + id + ", pesoMax=" + pesoMax + ", volMax=" + volMax + ", refrigeracion="
				+ refrigeracion + ", kmViaje=" + kmViaje + ", seguro=" + seguro + "]";
	}
}
