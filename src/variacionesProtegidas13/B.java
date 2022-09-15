package variacionesProtegidas13;

public class B {
	A a;
	
	
	public B(A a) {
		super();
		this.a = a;
	}


	public int useA(String something) {
		return a.getAlgo(something);
	}
}
