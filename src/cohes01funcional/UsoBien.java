package cohes01funcional;

public class UsoBien {

	public static void main(String[] args) {
		FooBar fooBar = new FooBar();
		OtherFooBar otherFooBar = new OtherFooBar();
		fooBar.FirstMethod(otherFooBar);
		fooBar.SecondMethod();
		fooBar.ThirdMethod();
		otherFooBar.oneMethod();
		otherFooBar.twoMethod();
	}

}
