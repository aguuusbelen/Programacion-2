package trabajo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PruebaTest {
	public static void main(String[] args) {
		double volumen;
		Empresa e = new Empresa("39122333456","Empresa Prueba", 10500);
		System.out.println(e.toString());
		e.agregarDestino("San Miguel", 30);
		e.agregarDestino("Entre Rios", 300);
		e.agregarDestino("Mar del Plata", 800);
		e.agregarDestino("Santa Fe", 1000);
		e.agregarTrailer("AA123BB", 1000, 60, true, 2, 100);
		e.agregarMegaTrailer("AA321PR", 15000, 100, true, 3, 150, 200, 50);
		e.agregarFlete("AB936MN", 500, 20, 4, 2, 300);
		
		
		//Si el trailer necesita distancias de menos de 500km no puedo agregar destino: Mar del Plata
		//e.asignarDestino("AA123BB", "Mar del Plata"); ---> devuelve la excepcion
		e.asignarDestino("AA321PR", "Mar del Plata"); //MegaTrailer
		e.asignarDestino("AA123BB", "San Miguel");    //Trailer
		e.asignarDestino("AB936MN", "Santa Fe");      //Flete
		
		// paquetes que necesitan frio
		System.out.println(e.incorporarPaquete("Santa Fe", 300, 10501, true));  //devuelve falso porque supera la capacidad del deposito
		System.out.println(e.incorporarPaquete("Santa Fe", 100, 2, true));   //devuelve verdadero porque lo puso incorporar
		e.incorporarPaquete("Santa Fe", 159, 3, true);
		e.incorporarPaquete("Entre Rios", 150, 1, true);
		e.incorporarPaquete("Entre Rios", 200, 22, true);
		e.incorporarPaquete("Mar del Plata", 100, 2, true);
		e.incorporarPaquete("Mar del Plata", 150, 1, true);
		e.incorporarPaquete("San Miguel", 800, 2, true);
		e.incorporarPaquete("San Miguel", 150, 1, true);
		// paquetes que NO necesitan frio
		e.incorporarPaquete("Santa Fe", 100, 2, false);
		e.incorporarPaquete("Santa Fe", 159, 3, false);
		e.incorporarPaquete("Entre Rios", 150, 1, false);
		e.incorporarPaquete("Entre Rios", 200, 22, false);
		e.incorporarPaquete("Mar del Plata", 100, 2, false);
		e.incorporarPaquete("Mar del Plata", 150, 1, false);
		e.incorporarPaquete("San Miguel", 800, 2, false);
		e.incorporarPaquete("San Miguel", 150, 1, false);
		volumen = e.cargarTransporte("AA321PR");
		System.out.println("Se cargaron " + volumen
		+" metros cubicos en el transp AA321PR");
		e.iniciarViaje("AA321PR");
		System.out.println("Costo del viaje:"
		+e.obtenerCostoViaje("AA321PR"));
		e.finalizarViaje("AA321PR");
		System.out.println(e.toString());
		}
}
