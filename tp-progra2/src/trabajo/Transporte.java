package trabajo;

import java.util.HashSet;

public abstract class Transporte {
	private String matricula;
	private double capacidad; // peso
	private double cargaMax; // volumen
	private double cargaActual;
	private boolean tieneRefrigeracion;
	private double costoKm;
	private HashSet<Paquete> paquetes;
	private boolean estaEnViaje;
	private String destino;

	public Transporte(String matricula, double cargaMax, double capacidad, double costoKm, boolean tieneRefrigeracion) {
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.cargaMax = cargaMax;
		this.cargaActual = 0;
		this.costoKm = costoKm;
		this.paquetes = new HashSet<>();
		this.estaEnViaje = false;
		this.destino = "";
		this.tieneRefrigeracion = tieneRefrigeracion;
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

	public boolean tieneRefrigeracion() {
		return tieneRefrigeracion;
	}

	public void setEstaEnViaje(boolean estaEnViaje) {
		this.estaEnViaje = estaEnViaje;
	}

	public HashSet<Paquete> getPaquetes() {
		return paquetes;
	}

	public void eliminarPaquete() {
		paquetes.removeAll(paquetes);
	}

	public double costoViaje() {
		return 0;
	}

	public double getCostoKm() {
		return costoKm;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Transporte [ID=" + matricula + ", pesoMax=" + capacidad + ", volMax=" + cargaMax + ", refrigeracion="
				+ tieneRefrigeracion + ", kmViaje=" + costoKm + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Transporte t = (Transporte) obj;
		return this.getClass().getTypeName().equals(t.getClass().getTypeName()) && this.destino.equals(t.destino)
				&& this.cargaActual == t.cargaActual;
	}
}
