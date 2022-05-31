package trabajo;

import java.util.HashSet;

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
	private String destino;

	public Transporte(String matricula, double cargaMax, double capacidad, double costoKm) {
		this.matricula = matricula;
		this.capacidad = capacidad;
		this.cargaMax = cargaMax;
		this.cargaActual = 0;
		this.costoKm = costoKm;
		this.paquetes = new HashSet<>();
		this.estaEnViaje = false;
		this.destino = "";
	}

	public double getSeguro() {
		return seguro;
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
		paquetes.removeAll(paquetes);
	}

	public double costoViaje() {
		return 0;
	}

	public double getCostoKm() {
		return costoKm;
	}

	@Override
	public String toString() {
		return "Transporte [ID=" + matricula + ", pesoMax=" + capacidad + ", volMax=" + cargaMax + ", refrigeracion="
				+ tieneRefrigeracion + ", kmViaje=" + costoKm + ", seguro=" + seguro + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		} else if (!this.getClass().equals(obj.getClass())) {
			return false;
		}
		Transporte t = (Transporte) obj;
		boolean one = this.getClass().getTypeName().equals(t.getClass().getTypeName());
		boolean two = this.destino.equals(t.destino);
		boolean tree = this.cargaActual == t.cargaActual;
		boolean four = this.paquetes.size() == t.paquetes.size();
		return this.getClass().getTypeName().equals(t.getClass().getTypeName()) && this.destino.equals(t.destino)
				&& this.paquetes.size() == t.paquetes.size();
	}
}
