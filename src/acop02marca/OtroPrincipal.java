package acop02marca;

public class OtroPrincipal {

	public static void main(String[] args) {
		Cliente2 cliente2=new Cliente2("3", "Barbara",new DatosFiscales("1", "1"));
		Pedido2 pedido2=new Pedido2(cliente2, "hoy");
				
		
	}

}
