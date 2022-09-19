package expertoEnInformacion;

public class InformePresenter3 {
	InformeDos informe = new InformeDos();
	TitulitusDos dos=new TitulitusDos();
}
class InformeDos {
	TitulitusDos titulitus = new TitulitusDos();
	public int[] parciales = { 4, 5, 6, 3, 8, 4, 5, 6, 2, 2, 7, 8, 8, 8, 8, 8, 9, 9, 0 };
	
	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : parciales) {
			total = total + parcial;
			int i = total%2;
			System.out.println(titulitus.valores[i]);
		}
	}

}
class TitulitusDos {
	public String valores[] = { "a", "b" };
}
