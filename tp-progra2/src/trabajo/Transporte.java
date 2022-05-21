package trabajo;

public abstract class Transporte {
	
	private String matricula;
	private double capacidad; //peso
	private double cargaMax;  //volumen
	protected boolean tieneRefrigeracion;
	private double costoKm;
	protected double seguro;
	
	
	public Transporte(String matricula, double cargaMax, double capacidad, double costoKm) {
		
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.cargaMax = cargaMax;
		this.costoKm = costoKm;
		
		
	}


	@Override
	public String toString() {
		return "Transporte [ID=" + matricula + ", pesoMax=" + capacidad + ", volMax=" + cargaMax + ", refrigeracion="
				+ tieneRefrigeracion + ", kmViaje=" + costoKm + ", seguro=" + seguro + "]";
	}
}
