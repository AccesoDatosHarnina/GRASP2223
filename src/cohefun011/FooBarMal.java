package cohefun011;

//Cohesion coincidental
public class FooBarMal {
	 private SomeObject _bla = new SomeObject();
	 private OtherObject otherObject=new OtherObject();

	  public void FirstMethod() {
	    _bla.FirstCall();
	  }

	  public void SecondMethod() {
	    _bla.SecondCall();
	  }

	  public void ThirdMethod() {
	    _bla.ThirdCall();
	  }
	  
	  public void oneMethod() {
		otherObject.oneCall();
	}
	  public void twoMethod() {
		otherObject.twoCall();
	}
}
