package invencionpura07;


public class PajaroEnfadadoViewConsola implements PajaroEnfadadoView {

	@Override
	public void Mostrar(PajaroEnfadado pajaroEnfadado) {
		System.out.println(pajaroEnfadado.nombre);
	}

}
