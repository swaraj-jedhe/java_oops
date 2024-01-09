package polymorphism;

public class snake extends animal {

	@Override
	void sleep() {
		System.out.println("snake can sleep");
	}

	@Override
	void eat() {
		System.out.println("snake can eat");
	}

	@Override
	void noice() {
		System.out.println("snake can hiss hiss");
	}

}
