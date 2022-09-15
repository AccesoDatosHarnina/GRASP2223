package designSotfware;

public class Defensive {
	public int contador(String cadena) {
		if (cadena == null) {
			return -1;
		} else if (cadena.length() < 10) {
			return 6;
		} else
		{
			return -1;
		}
	}
}
