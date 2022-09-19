package ejemploeei1;

import java.util.ArrayList;

public class Factura {
	ArrayList<Linea> lineas;
	
	public void calculaTotal() {
		float total=0;
		for (Linea linea : lineas) {
			total+=linea.calculaItem();
		}
	}

	
}
