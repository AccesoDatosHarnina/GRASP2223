package cohefun012;

//Cohesion coincidental
public class FooBarMalI {
	 private SomeObject _bla = new SomeObject();

	  public void FirstMethod() {
	    _bla.FirstCall();
	  }

	  public void SecondMethod() {
	    _bla.SecondCall();
	  }

	  public void ThirdMethod() {
	    _bla.ThirdCall();
	  }
	  
	
}
