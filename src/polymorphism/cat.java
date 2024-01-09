package polymorphism;

public class cat extends animal {

	@Override
	void sleep() {
		System.out.println("cat can sleep");
	}

	@Override
	void eat() {
		System.out.println("cat can eat");
	}

	@Override
	void noice() {
		System.out.println("cat can mao mao ");
	}

}
