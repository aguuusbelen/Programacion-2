package trabajo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Empresa {
	
	private String cuit;
	private String nombre;
	private List<Deposito> depositos;
	private List<Transporte> transportes;


	public Empresa (String cuit, String nombre, int capacidadDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositos = new ArrayList<>(); 						//creamos una lista en el caso de que en algun momento se quieran agregar mas depositos
		Deposito deposito1 = new Deposito(true, capacidadDeposito); //creamos los dos depositos (el refrigerado y el que no) y los agregamos a la lista
		this.depositos.add(deposito1);       						
		Deposito deposito2 = new Deposito(false, capacidadDeposito);
		this.depositos.add(deposito2);
		this.transportes = new ArrayList<>();
		
	}
	
	public boolean agregarPaquete(String destino, int volumen, int peso, boolean refrigeracion) {
		Paquete paquete = new Paquete(peso, volumen, destino, refrigeracion);
		if (refrigeracion) {
			 return depositos.get(0).agregarPaquete(paquete); //devuelve verdadero o falso dependiendo si el paquete se pudo agregar o no al deposito
		} else {
			 return depositos.get(1).agregarPaquete(paquete);
		}
	}
	

	
	public void agregarTransporte(String idTransporte, int pesoMax, int volMax, boolean refrigeracion) {
		Transporte transporte = new Transporte(idTransporte, pesoMax, volMax, refrigeracion, 60);
		transportes.add(transporte);
	}


	
	public void asignarDestino(String idTransporte, String destino, int cantKm) {
	
		
	}

	
	public int cargarMercaderia(String idTransporte) {
		// 1. Obtener el objeto, existe?
		// 2. Controlas que ya tenga asignado el destino. transporte.get(id).destino != null
		// 3. TENES UNA LISTA DE VIAJES, aca chequeas si esta en camino
		/*if (tieneDestino(ID) && !estaEnViaje(destino)) {
			//lista de deposito --> quito paquetes
			//se agregan paquetes al camion --> hasta llegar al tope del volumen maximo o 
			//hasta agotar los paquetes del deposito (la lista del deposito queda en 0)
			
			//se suman los volumenes de los paquetes
			
		} else {
			//se genera la excepcion 
		}*/
		return 0; //devuelve la suma de volumen
	}
	
	//transporte tiene que tener una lista de paquetes 
	
	
	public void iniciarViaje(String idTransporte) {
		//if (estaEnViaje || !tieneDestino || lista de paquetes esta vacia){
		//	genera excepcion
		//} else{
		//  estaEnViaje = true;
	}
	
	
	public void finalizarViaje(String idTransporte) {
		//if (!estaEnViaje) {
			//se genera excepcion
		//} else {
		//se eliminan todos los elementos de la lista de paquetes
		//el destino queda en null
		//tieneDestino = false; }
	}
	
	
	public int costoViaje(String idTransporte) {
		//if (!estaEnViaje) {
			//se genera excepcion
		//} else {
			//suma costo por km
			//suma extras dependiendo el tipo de vehiculo
		
		
		return 0;
	}

	


}
