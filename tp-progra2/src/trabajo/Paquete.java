package trabajo;

public class Paquete {

	private double peso;
	private double volumen;
	private String destino;
	private boolean refrigeracion;

	public Paquete(String destino, double peso, double volumen, boolean refrigeracion) {

		this.peso = peso;
		this.volumen = volumen;
		this.destino = destino;
		this.refrigeracion = refrigeracion;
	}

	public double getVolumen() {
		return volumen;
	}

}
