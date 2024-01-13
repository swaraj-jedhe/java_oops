package abstraction;

public class main {

	public static void main(String[] args) {
		
		System.out.println("prgram started");
		manager m1= new manager();
		account a1 =m1.getaccountinstance('l');
		a1.deposite(3000);
		
		a1.withdrawn(2000);
		a1.checkbal();
		
	}
}
