package trabajo;

public interface IEmpresa {

	public void agregarTransporte (String ID, int pesoMax, int volumenMax, boolean refrigeracion);

	public void asignarDestino (String ID, String destino, int cantKm);
}
