package trabajo;

public class Empresa implements IEmpresa {
	
	private int cuit;
	private String nombre;
	private Integer capacidadDeposito;


	public Empresa (int cuit, String nombre, int capacidadDeposito) {
		this.cuit = cuit;
		this.nombre = nombre;
		this.capacidadDeposito = capacidadDeposito;
	}


	@Override
	public void agregarTransporte(String ID, int pesoMax, int volMax, boolean refrigeracion) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void asignarDestino(String ID, String destino, int cantKm) {
		// TODO Auto-generated method stub
		
	}



}
