package Encapulation;

public class mainclass {

	public static void main(String[] args) {
		atm atm = new atm();
		
		
		System.out.println(atm.getpin());
		atm.setpin(4567);
		System.out.println(atm.getpin());
		
	}
}
