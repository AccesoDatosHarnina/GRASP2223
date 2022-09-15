package creador08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba {

	@Test
	void test() {
		A a=new A();
		C c=new C();
		a.setB(c.getB());
	}

}
