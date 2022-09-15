package creador10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba {

	@Test
	void test() {
		//Si el objeto B es un componente de A
		//no tiene sentido C.getB()
		A a=new A();
		D d=new D();
		C c=new C();
		//a y d comparten el mismo objeto b
		//Quien debe ser el creador
		a.setB(c.getB());
		d.setB(c.getB());
		
	}

}
