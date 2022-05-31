package trabajo;

import java.util.HashSet;
import java.util.List;

public abstract class Transporte {

	private String matricula;
	private double capacidad; // peso
	private double cargaMax; // volumen
	private double cargaActual;
	protected boolean tieneRefrigeracion;
	private double costoKm;
	protected double seguro;
	private HashSet<Paquete> paquetes;
	private boolean estaEnViaje;
	

	public Transporte(String matricula, double cargaMax, double capacidad, double costoKm) {

		this.matricula = matricula;
		this.capacidad = capacidad;
		this.cargaMax = cargaMax;
		this.cargaActual = 0;
		this.costoKm = costoKm;
		this.paquetes = new HashSet<>();
		this.estaEnViaje = false;
		

	}

	public String getMatricula() {
		return matricula;
	}

	public void cargarPaquete(Paquete p) {
		if (cargaActual <= cargaMax) {
			paquetes.add(p);
			cargaActual = cargaActual + p.getVolumen();
		}
	}

	public double getCargaActual() {
		return cargaActual;
	}
	
	public boolean isEstaEnViaje() {
		return estaEnViaje;
	}

	public void setEstaEnViaje(boolean estaEnViaje) {
		this.estaEnViaje = estaEnViaje;
	}
	

	public HashSet<Paquete> getPaquetes() {
		return paquetes;
	}
	
	public void eliminarPaquete() {
		//		if (paquetes.size() != 0) {
		//			for (Paquete p: paquetes) {
		//				paquetes.remove(p);
		//			}
		//		}

		for (Paquete p: paquetes) {
			if (paquetes.size() != 0) {
				paquetes.remove(p);
			}

		}


	}


	@Override
	public String toString() {
		return "Transporte [ID=" + matricula + ", pesoMax=" + capacidad + ", volMax=" + cargaMax + ", refrigeracion="
				+ tieneRefrigeracion + ", kmViaje=" + costoKm + ", seguro=" + seguro + "]";
	}

	

	

}
