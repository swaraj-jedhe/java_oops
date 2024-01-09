package polymorphism;

public class mainclass {
	
	public static void main(String[] args) {
	
		animalsimulator animalsimulator =new animalsimulator();
		animalsimulator.makeanimal(new dog());
		System.out.println("__________________");
		animalsimulator.makeanimal(new cat());
		System.out.println("__________________");
		animalsimulator.makeanimal(new snake());
		
	
}
}
