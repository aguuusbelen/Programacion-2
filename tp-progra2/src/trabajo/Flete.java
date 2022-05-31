package trabajo;

public class Flete extends Transporte {
	private double cantAcompaniantes;
	private double costoPorAcompaniante;
	private boolean tieneRefrigeracion;

	public Flete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes,
			double costoPorAcompaniante) {
		super(matricula, cargaMax, capacidad, costoKm);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoPorAcompaniante = costoPorAcompaniante;
		this.tieneRefrigeracion = false;
	}

	public boolean isTieneRefrigeracion() {
		return tieneRefrigeracion;
	}

	@Override
	public double costoViaje() {
		return cantAcompaniantes * costoPorAcompaniante;
	}
}
