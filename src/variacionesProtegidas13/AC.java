package variacionesProtegidas13;

//El elemento que cambia mucho
public class AC implements A {

	//Si hacemos esto no respetamos el principio open/closed
	public int getAlgo(String cosa) {
		return cosa.length();
	}
}
