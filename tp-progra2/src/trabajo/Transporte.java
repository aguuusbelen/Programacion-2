package trabajo;

import java.util.HashSet;

public abstract class Transporte {
	
	private String matricula;
	private double capacidad; //peso
	private double cargaMax;  //volumen
	protected boolean tieneRefrigeracion;
	private double costoKm;
	protected double seguro;
	private HashSet<Paquete> paquetes;
	
	
	public Transporte(String matricula, double cargaMax, double capacidad, double costoKm) {
		
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.cargaMax = cargaMax;
		this.costoKm = costoKm;
		this.paquetes = new HashSet<>();
	
	}

	public String getMatricula() {
		return matricula;
	}
	
	public boolean estaEnViaje() {
		boolean estaEnViaje = false;
		return estaEnViaje;
	}
	
	public void cargarPaquete() {  //tiene que ser abstracto para que cada uno verifique su propia capacidad?
		// reco
		
	}


	@Override
	public String toString() {
		return "Transporte [ID=" + matricula + ", pesoMax=" + capacidad + ", volMax=" + cargaMax + ", refrigeracion="
				+ tieneRefrigeracion + ", kmViaje=" + costoKm + ", seguro=" + seguro + "]";
	}

	public int volumen() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
