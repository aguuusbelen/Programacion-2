package trabajo;

import java.util.HashSet;

public class Deposito {
	private HashSet<Paquete> paquetes; 
	private boolean refrigeracion;
	private Integer capacidad;
	
	public Deposito (boolean refrigeracion, int capacidad) {
		this.refrigeracion = refrigeracion;
		this.capacidad = capacidad;
		this.paquetes = new HashSet<>();
	}
	
	public void agregarPaquete (Paquete paquete) {	      
			paquetes.add(paquete);
			capacidad = capacidad -1;	
	}
	
	public boolean tieneCapacidad() {
		return paquetes.size() < capacidad;
	}

	public boolean tieneRefrigeracion() {
		return refrigeracion;
	}

	
	
	
}
