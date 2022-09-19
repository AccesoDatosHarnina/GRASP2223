package cohefun012;

//Cohesion coincidental
public class FooBarMalIII {
	 private OtherObject otherObject=new OtherObject();

	 
	  public void oneMethod() {
		otherObject.oneCall();
	}
	  public void twoMethod() {
		otherObject.twoCall();
	}
}
