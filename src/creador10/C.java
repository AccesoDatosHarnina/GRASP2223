package creador10;

public class C {
	B b;

	public B getB() {
		if (b == null)
			b=new B();
		return b;
	}
}
