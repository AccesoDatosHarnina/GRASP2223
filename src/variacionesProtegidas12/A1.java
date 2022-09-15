package variacionesProtegidas12;

//El elemento que cambia mucho
public class A1 {

	//Si hacemos esto no respetamos el principio open/closed
	public int getAlgo(String cosa) {
		return cosa.length();
	}
	//Abierto para add
	public int getAlgo(String cosa,int nada) {
		return cosa.length();
	}
	
//	public int getAlgo(String cosa,int nada) {
//		return cosa.length();
//	}
}
