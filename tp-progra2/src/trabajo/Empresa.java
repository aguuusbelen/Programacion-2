package trabajo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Empresa {

	private String cuit;
	private String nombre;
	private List<Deposito> depositos;
	private List<Transporte> transportes;
	private List<Destino> destinos;
	private HashMap<String, String> destinosAsignados;

	public Empresa(String cuit, String nombre, int capacidadDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositos = new ArrayList<>();
		Deposito deposito1 = new Deposito(true, capacidadDeposito);
		this.depositos.add(deposito1);
		Deposito deposito2 = new Deposito(false, capacidadDeposito);
		this.depositos.add(deposito2);
		this.transportes = new ArrayList<>();
		this.destinos = new ArrayList<>();
		this.destinosAsignados = new HashMap<>();
	}

	public void agregarDestino(String destino, int km) {
		for (Destino d : destinos) {
			if (d.getDestino().equals(destino)) {
				throw new RuntimeException("El destino ya existe");
			}
		}
		Destino destino_ = new Destino(destino, km);
		this.destinos.add(destino_);
	}

	public void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga, double costoFijo, double costoComida) {
		if (!existeMatricula(matricula)) {
			MegaTrailer transporte = new MegaTrailer(matricula, cargaMax, capacidad, tieneRefrigeracion, costoKm,
					segCarga, costoFijo, costoComida);
			transportes.add(transporte);
		}
	}

	public void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga) {
		if (!existeMatricula(matricula)) {
			Trailer transporte = new Trailer(matricula, cargaMax, capacidad, tieneRefrigeracion, costoKm, segCarga);
			transportes.add(transporte);
		}
	}

	public void agregarFlete(String matricula, double cargaMax, double capacidad, double costoKm, int cantAcompaniantes,
			double costoPorAcompaniante) {
		if (!existeMatricula(matricula)) {
			Flete transporte = new Flete(matricula, cargaMax, capacidad, costoKm, cantAcompaniantes,
					costoPorAcompaniante);
			transportes.add(transporte);
		}
	}

	public void asignarDestino(String matricula, String destino) {
		if (existeDestino(destino) && existeMatricula(matricula)) {
			Transporte transporte = buscarTransporte(matricula);
			if (!transporte.isEstaEnViaje()) {
				if (transporte instanceof Trailer && obtenerKmDestino(matricula) < 500) {
					destinosAsignados.put(matricula, destino);
					transporte.setDestino(destino);
				} else if (transporte instanceof MegaTrailer && obtenerKmDestino(matricula) > 500) {
					destinosAsignados.put(matricula, destino);
					transporte.setDestino(destino);
				} else {
					destinosAsignados.put(matricula, destino);
					transporte.setDestino(destino);
				}
			}
		} else {
			throw new RuntimeException("No existe la matricula o el destino que se quiere asignar");
		}
	}

	public boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		Paquete paquete = new Paquete(destino, peso, volumen, necesitaRefrigeracion);
		for (Deposito d : depositos) {
			if ((necesitaRefrigeracion && d.tieneRefrigeracion())
					|| (!necesitaRefrigeracion && !d.tieneRefrigeracion())) {
				if (d.tieneCapacidad() && paquete.getVolumen() < d.getCapacidad()) {
					d.agregarPaquete(paquete);
					return true;
				}
			}
		}
		return false;
	}

	public double cargarTransporte(String matricula) {
		if (existeMatricula(matricula) && tieneAsignadoDestino(matricula)) {
			Transporte transporte = buscarTransporte(matricula);
			if (!transporte.isEstaEnViaje()) {
				for (Deposito d : depositos) {
					if ((d.tieneRefrigeracion() && transporte.tieneRefrigeracion())
							|| !d.tieneRefrigeracion() && !transporte.tieneRefrigeracion()) {
						Iterator<Paquete> iterador = d.getPaquetes().iterator();
						while (!d.getPaquetes().isEmpty() && iterador.hasNext()) {
							Paquete p = iterador.next();
							transporte.cargarPaquete(p);
							iterador.remove();
							d.aumentarCapacidad();
						}
						return transporte.getCargaActual();
					}
				}
			}
		}
		throw new RuntimeException("No se puede cargar el transporte");
	}

	public void iniciarViaje(String matricula) {
		Transporte transporte = buscarTransporte(matricula);

		if (transporte.isEstaEnViaje() || !tieneAsignadoDestino(matricula) || transporte.getPaquetes().size() < 1) {
			throw new RuntimeException("No tiene mercaderia cargada o ya esta en viaje");
		} else {
			transporte.setEstaEnViaje(true);
		}
	}

	public void finalizarViaje(String matricula) {
		Transporte transporte = buscarTransporte(matricula);
		if (!transporte.isEstaEnViaje()) {
			throw new RuntimeException("No esta en viaje");
		} else {
			transporte.eliminarPaquete();
			destinosAsignados.remove(matricula);
			transporte.setEstaEnViaje(false);
			transporte.setDestino("");
		}
	}

	public double obtenerCostoViaje(String matricula) {
		Transporte transporte = buscarTransporte(matricula);
		if (!transporte.isEstaEnViaje()) {
			throw new RuntimeException("No esta en viaje");
		} else {
			return transporte.getCostoKm() * obtenerKmDestino(matricula) + transporte.costoViaje();
		}
	}

	public String obtenerTransporteIgual(String matricula) {
		Transporte transporte = buscarTransporte(matricula);
		for (Transporte t : transportes) {
			if (t.getMatricula() != matricula && t.equals(transporte)) {
				return t.getMatricula();
			}
		}
		return null;
	}

	private boolean tieneAsignadoDestino(String matricula) {
		return destinosAsignados.containsKey(matricula);
	}

	private Transporte buscarTransporte(String matricula) {
		for (Transporte t : transportes) {
			if (t.getMatricula().equals(matricula)) {
				return t;
			}
		}
		return null;
	}

	private double obtenerKmDestino(String matricula) {
		String destino = destinosAsignados.get(matricula);
		for (Destino d : destinos) {
			if (d.getDestino().equals(destino)) {
				return d.getKm();
			}
		}
		return 0;
	}

	private boolean existeMatricula(String matricula) {
		for (Transporte t : transportes) {
			if (t.getMatricula().equals(matricula)) {
				return true;
			}
		}
		return false;
	}

	private boolean existeDestino(String destino) {
		for (Destino d : destinos) {
			if (d.getDestino().equals(destino)) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public String toString() {
		return "Empresa: " + nombre + "\nCuit: " + cuit + "\nCantidad de depositos: " + depositos.size() + "\nCantidad de transportes: "
				+ transportes.size();
	}
	
	
}	
