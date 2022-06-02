package trabajo;

public class PruebaTest {
	public static void main(String[] args) {
		//double volumen;
		Empresa e = new Empresa("39122333456","Empresa Prueba", 10500);
		System.out.println(e.toString());
		e.agregarDestino("San Miguel", 30);
		e.agregarDestino("Entre Rios", 300);
		e.agregarDestino("Mar del Plata", 800);
		e.agregarTrailer("AA123BB", 1000, 60, true, 2, 100);
		e.agregarMegaTrailer("AA321PR", 15000, 100, true, 3, 150, 200, 50);
		e.agregarFlete("AB936MN", 500, 20, 4, 2, 300);
		
		//Si el trailer necesita distancias de menos de 500km no puedo agregar destino: Mar del Plata
		e.asignarDestino("AA123BB", "Mar del Plata");
//		e.asignarDestino("AB555MN", "Rosario");
//		// paquetes que necesitan frio
//		e.incorporarPaquete("Buenos Aires", 100, 2, true);
//		e.incorporarPaquete("Buenos Aires", 150, 1, true);
//		e.incorporarPaquete("Mar del Plata", 100, 2, true);
//		e.incorporarPaquete("Mar del Plata", 150, 1, true);
//		e.incorporarPaquete("Rosario", 100, 2, true);
//		e.incorporarPaquete("Rosario", 150, 1, true);
//		// paquetes que NO necesitan frio
//		e.incorporarPaquete("Buenos Aires", 200, 3, false);
//		e.incorporarPaquete("Buenos Aires", 400, 4, false);
//		e.incorporarPaquete("Mar del Plata", 200, 3, false);
//		e.incorporarPaquete("Rosario", 80, 2, false);
//		e.incorporarPaquete("Rosario", 250, 2, false);
//		volumen = e.cargarTransporte("AA333XQ");
//		System.out.println("Se cargaron " + volumen
//		+" metros cubicos en el transp AA333XQ");
//		e.iniciarViaje("AA333XQ");
//		System.out.println("Costo del viaje:"
//		+e.obtenerCostoViaje("AA333XQ"));
//		System.out.println(e.toString());
//		e.finalizarViaje("AA333XQ");
//		System.out.println(e.toString());
		}
}
