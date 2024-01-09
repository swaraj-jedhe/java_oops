package Encapulation;

public class mains {

	public static void main(String[] args) {
		
		gmail gmail=new gmail();
		gmail.getusername();
		System.out.println("usernme is :"+gmail.getusername());
		System.out.println("old password "+gmail.getpassword() );
		gmail.setpassword("sjedhe@123");
		System.out.println(" new password is : "+gmail.getpassword());
	}
}
