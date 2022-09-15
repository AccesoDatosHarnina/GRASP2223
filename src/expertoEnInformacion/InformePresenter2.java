package expertoEnInformacion;

public class InformePresenter2 {
	Informe informe = new Informe();
	Titulitus titulitus = new Titulitus();

	//cumple porque usa informacion de dos objetos distintos
	//que le pertenecen a el
	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : informe.parciales) {
			total = total + parcial;
			int i = total%2;
			System.out.println(titulitus.valores[i]);
		}
	}
	public static void main(String[] args) {
		new InformePresenter2().calcultaeTotal();
	}
}

class Titulitus {
	public String valores[] = { "a", "b" };
}
