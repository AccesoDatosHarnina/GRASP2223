package ejemploeei1;

public class Linea {
	public String nombre;
	public float precio;
	public float descuento=0;
	
	public float calculaItem() {
		return precio*descuento;
	}
}
