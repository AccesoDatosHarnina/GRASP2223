package designSotfware;

public class Contract {
	public int contador(String cadena) {
		assert cadena!=null&&cadena.length()<10;
		return 6;
	}
}
