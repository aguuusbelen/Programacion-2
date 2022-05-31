package trabajo;

public class Flete extends Transporte {
	private double cantAcompaniantes;
	private double costoPorAcompaniante;

	public Flete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes,
			double costoPorAcompaniante) {
		super(matricula, cargaMax, capacidad, costoKm, false);
		this.cantAcompaniantes = cantAcompaniantes;
		this.costoPorAcompaniante = costoPorAcompaniante;
	}

	@Override
	public double costoViaje() {
		return cantAcompaniantes * costoPorAcompaniante;
	}
}
