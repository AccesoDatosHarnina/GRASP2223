package cohes013funcional;

//Cohesion coincidental
public class FooBarMal {
	 private SomeObject _bla = new SomeObject();
//	 private OtherObject otherObject=new OtherObject();

	  public void FirstMethod(OtherObject otherObject) {
	    _bla.FirstCall();
	    otherObject.oneCall();
	  }

	  public void SecondMethod() {
	    _bla.SecondCall();
	  }

	    _bla.ThirdCall();
	  }
	  
//	  public void oneMethod() {
//		otherObject.oneCall();
//	}
//	  public void twoMethod() {
//		otherObject.twoCall();
//	}
}
