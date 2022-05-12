package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements IEmpresa {
	
	private int cuit;
	private String nombre;
	private List<Deposito> depositos;


	public Empresa (int cuit, String nombre, int capacidadDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.depositos = new ArrayList<>(); 						//creamos una lista en el caso de que en algun momento se quieran agregar mas depositos
		Deposito deposito1 = new Deposito(true, capacidadDeposito); //creamos los dos depositos (el refrigerado y el que no) y los agregamos a la lista
		this.depositos.add(deposito1);       						
		Deposito deposito2 = new Deposito(false, capacidadDeposito);
		this.depositos.add(deposito2);
		
	}
	
	@Override
	public boolean agregarPaquete(String destino, int volumen, int peso, boolean refrigeracion) {
		Paquete paquete = new Paquete(peso, volumen, destino, refrigeracion);
		if (refrigeracion) {
			depositos.get(0).agregarPaquete(paquete);
		} else {
			depositos.get(1).agregarPaquete(paquete);
		}
		return true;
	}
	

	@Override
	public void agregarTransporte(String ID, int pesoMax, int volMax, boolean refrigeracion) {
		
		
	}


	@Override
	public void asignarDestino(String ID, String destino, int cantKm) {
		// TODO Auto-generated method stub
		
	}


	
	
	



}
