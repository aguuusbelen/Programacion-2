package trabajo;

public class Trailer extends Transporte {
	private double seguro;
	
	public Trailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm,
			double segCarga) {
		super(matricula, cargaMax, capacidad, costoKm, tieneRefrigeracion);
		this.seguro = segCarga;
	}

	@Override
	public double costoViaje() {
		return seguro;
	}
}
