package trabajo;

public interface IEmpresa {
	
	public boolean agregarPaquete (String destino, int volumen, int peso, boolean refrigeracion);

	public void agregarTransporte (int id, int pesoMax, int volumenMax, boolean refrigeracion);

	public void asignarDestino (int id, String destino, int cantKm);
	
	public int cargarMercaderia(int id);
	
	public void iniciarViaje(int id);
	
	public void finalizarViaje(int id);
	
	public int costoViaje(int id);
}
