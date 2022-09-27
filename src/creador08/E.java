package creador08;

public class E {
	//este objeto b no se comparte con otros objetos
	//es propiedad de E. Esto es un componente
	B b=new B();

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
