package Encapulation;

public class mains {

	public static void main(String[] args) {
		
		gmail gmail=new gmail();
		gmail.getusername();
		System.out.println(gmail.getusername());
		gmail.setpassword("sjedhe@123");
		System.out.println(gmail.getpassword());
	}
}
