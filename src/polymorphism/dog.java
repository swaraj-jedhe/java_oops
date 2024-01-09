package polymorphism;

public class dog  extends animal{

	@Override
	void sleep() {
		System.out.println("dog acn sleep ");
	}

	@Override
	void eat() {
		System.out.println("dog can eat");
	}

	@Override
	void noice() {
		System.out.println("dog can bho bho");
	}

	
}
