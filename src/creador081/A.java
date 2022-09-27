package creador081;

public class A {
//	En este caso b es un compoenente de la clase
	// por el principio de creador puede crear el objeto
	B b = new B();

	//es una varaible local
	public void hazAlgo() {
		B bLocal=new B();
	}
}
