package trabajo;

public class Trailer extends Transporte {
	
	public Trailer(String matricula, double cargaMax, double capacidad, boolean refrigeracion, double costoKm, double segCarga) {
		super(matricula, cargaMax, capacidad, costoKm);
		this.seguro = segCarga;
		this.tieneRefrigeracion = refrigeracion;
		
	}
	
	
	
}
