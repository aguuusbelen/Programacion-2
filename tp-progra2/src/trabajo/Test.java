package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main (String[] args) {
		List<Transporte> transportes = new ArrayList<>();
		Transporte transporte = new Transporte(1, 20, 20, false, 3);
		transportes.add(transporte);
		System.out.println(transportes.get(0).toString());
	}
}
