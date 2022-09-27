package downandup15;

public class Prueba {

	public String hazCosas(A a) {
		// downcasting
		return ((AB) a).dimeCosasDeAB();
	}

	public static void main(String[] args) {
		// upcasting
		A a = new AB();
		System.out.println(a.dimeAlgo());
		System.out.println(new Prueba().hazCosas(new AA()));
	}
}
