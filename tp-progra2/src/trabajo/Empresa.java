package trabajo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Empresa implements IEmpresa {
	
	private int cuit;
	private String nombre;
	private List<Deposito> depositos;
	private List<Transporte> transportes;


	public Empresa (int cuit, String nombre, int capacidadDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositos = new ArrayList<>(); 						//creamos una lista en el caso de que en algun momento se quieran agregar mas depositos
		Deposito deposito1 = new Deposito(true, capacidadDeposito); //creamos los dos depositos (el refrigerado y el que no) y los agregamos a la lista
		this.depositos.add(deposito1);       						
		Deposito deposito2 = new Deposito(false, capacidadDeposito);
		this.depositos.add(deposito2);
		this.transportes = new ArrayList<>();
		
	}
	
	@Override
	public boolean agregarPaquete(String destino, int volumen, int peso, boolean refrigeracion) {
		Paquete paquete = new Paquete(peso, volumen, destino, refrigeracion);
		if (refrigeracion) {
			 return depositos.get(0).agregarPaquete(paquete); //devuelve verdadero o falso dependiendo si el paquete se pudo agregar o no al deposito
		} else {
			 return depositos.get(1).agregarPaquete(paquete);
		}
		
	}
	

	@Override
	public void agregarTransporte(String ID, int pesoMax, int volMax, boolean refrigeracion) {
		
		
	}


	@Override
	public void asignarDestino(String ID, String destino, int cantKm) {
	
		
	}

	@Override
	public int cargarMercaderia(String ID) {
		/*if (tieneDestino(ID) && !estaEnViaje(ID)) {
			//lista de deposito --> quito paquetes
			//se agregan paquetes al camion --> hasta llegar al tope del volumen maximo o 
			//hasta agotar los paquetes del deposito (la lista del deposito queda en 0)
			
			//se suman los volumenes de los paquetes
			
		} else {
			//se genera la excepcion 
		}
		return 0; //devuelve la suma de volumen*/
	}
	
	//transporte tiene que tener una lista de paquetes 
	
	@Override
	public void iniciarViaje(String ID) {
		//if (estaEnViaje || !tieneDestino || lista de paquetes esta vacia){
		//	genera excepcion
		//} else{
		//  estaEnViaje = true;
	}
	
	@Override
	public void finalizarViaje(String ID) {
		//if (!estaEnViaje) {
			//se genera excepcion
		//}
		//se eliminan todos los elementos de la lista de paquetes
		//el destino queda en null
		//tieneDestino = false;
	}


	
	
	



}
