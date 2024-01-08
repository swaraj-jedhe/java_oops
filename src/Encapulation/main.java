package Encapulation;

public class main {

	public static void main(String[] args) {
		
		upi upi =new upi();
		upi.getpin();
		System.out.println(upi.getpin());
		upi.setpin(6789);
		System.out.println(upi.getpin());
		
		
	}
}
