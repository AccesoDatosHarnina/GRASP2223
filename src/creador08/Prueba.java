package creador08;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Prueba {

	@Test
	void test() {
		A a=new A();
		C c=new C();
		D d=new D();
		//el objeto b dentro de e se crea en ese momento
		E e=new E();
		B b = c.getB();
		//es un ingrediente porque a y d comparten el mismo 
		//objeto b
		a.setB(b);
		d.setB(b);
	}

}
