package trabajo;

import java.util.ArrayList;
import java.util.HashMap;
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

	public boolean incorporarPaquete(String destino, double peso, double volumen, boolean necesitaRefrigeracion) {
		Paquete paquete = new Paquete(destino, peso, volumen, necesitaRefrigeracion);
		for (Deposito d : depositos) {
			if (necesitaRefrigeracion && d.tieneRefrigeracion()) {
				if (d.tieneCapacidad()) {
					d.agregarPaquete(paquete);
					return true;
				}
			}
		}
		return false;
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

	public void agregarTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga) {
		if (!existeMatricula(matricula)) {
			Trailer transporte = new Trailer(matricula, cargaMax, capacidad, tieneRefrigeracion, costoKm, segCarga);
			transportes.add(transporte);
		}

	}

	public void agregarMegaTrailer(String matricula, double cargaMax, double capacidad, boolean tieneRefrigeracion,
			double costoKm, double segCarga, double costoFijo, double costoComida) {
		if (!existeMatricula(matricula)) {
			MegaTrailer transporte = new MegaTrailer(matricula, cargaMax, capacidad, tieneRefrigeracion, costoKm,
					segCarga, costoFijo, costoComida);
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

//	public boolean estaEnViaje (String matricula) {
//		// recorrer destinosAsignados y ver si la matricula esta ahi
//		// se me ocurre eso pero no se como es lo de HasMap, HashSet y lrpm
//		// voy a poner a ver videos a ver si sale (?
//	}

	public void asignarDestino(String matricula, String destino) {
		if (existeDestino(destino) && existeMatricula(matricula)) { // && !estaEnViaje(matricula))
			destinosAsignados.put(matricula, destino);
		} else
			throw new RuntimeException("No existe la matricula o el destino que se quiere asignar");
	}

	private boolean tieneAsignadoDestino(String matricula) {
		if (destinosAsignados.containsKey(matricula)) { // esto sirve solo si tenemos en cuenta eliminar del hash las
														// matriculas cuando termine el viaje
			return true;
		} else {
			return false;
		}
	}

	private Transporte buscarTransporte(String matricula) { // necesito algo que me devuelva todos los datos del
															// transporte
		for (Transporte t : transportes) {
			if (t.getMatricula().equals(matricula)) {
				return t;
			}
		}
		return null;
	}

	public double cargarTransporte(String matricula) {
		if (!existeMatricula(matricula) || !tieneAsignadoDestino(matricula) /* ||esta en viaje */) {
			throw new RuntimeException("No se puede cargar el transporte");
		} else {
			Transporte transporte = buscarTransporte(matricula);
			for (Deposito d : depositos) {
				if (d.tieneRefrigeracion() && transporte.tieneRefrigeracion) {
					for (Paquete p : d.getPaquetes()) {
						transporte.cargarPaquete(p);
						//d.eliminarPaquete(p);
					}

				}

				if (!d.tieneRefrigeracion() && !transporte.tieneRefrigeracion) {
					for (Paquete p : d.getPaquetes()) {
						transporte.cargarPaquete(p);
						//d.eliminarPaquete(p);
					}

				}
			}
			return transporte.getCargaActual(); // transporte.volumen();
		}
	}

	public void iniciarViaje(String matricula) {
//		if(matricula.estaEnViaje || !matricula.tieneDestino || matricula.paquete < 1) {
//			throw new RuntimeException ("No tiene mercaderia cargada o ya esta en viaje");
//		}
//		else {
//			matricula.iniciarViaje;
//		}
//		
//		if (estaEnViaje || !tieneDestino || lista de paquetes esta vacia){
//			genera excepcion
//		} else{
//		  estaEnViaje = true;
	}

	public void finalizarViaje(String matricula) {
//		if(!estaEnViaje) {
//			throw new RuntimeException ("No esta en viaje");
//		}
//		else {
//			matricula.paquete = null;
//			matricula.destino = null;
//			matricula.tieneDestino = false;
//		}

		// if (!estaEnViaje) {
		// se genera excepcion
		// } else {
		// se eliminan todos los elementos de la lista de paquetes
		// el destino queda en null
		// tieneDestino = false; }
	}

	public int obtenerCostoViaje(String matricula) {
//		if (!matricula.estaEnViaje) {
//			throw new RuntimeException ("No esta en viaje");
//		}
//		else {
//			
//		}

		// if (!estaEnViaje) {
		// se genera excepcion
		// } else {
		// suma costo por km
		// suma extras dependiendo el tipo de vehiculo

		return 0;
	}

	public String obtenerTransporteIgual(String matricula) {
//		for (Transporte t: transportes) {
//			if(t.getMatricula().destino.equals(matricula.destino) 
//					&& t.getMatricula().carga.equals(matricula.carga){
//				return "Hay transporte igual";
//			}
//		}
		return null;
	}

}
