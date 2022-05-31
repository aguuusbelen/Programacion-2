package trabajo;

public class MegaTrailer extends Transporte {
	private double costoComida;
	private double costoFijo;
	private double seguro;

	public MegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion, double costoKm,
			double segCarga, double costoFijo, double costoComida) {
		super(matricula, cargaMax, capacidad, costoKm);
		this.tieneRefrigeracion = tieneRefrigeracion;
		this.seguro = segCarga;
		this.costoComida = costoComida;
		this.costoFijo = costoFijo;
	}

	@Override
	public double costoViaje() {
		return costoComida + costoFijo + seguro;
	}
}
