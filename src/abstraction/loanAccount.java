package abstraction;

public class loanAccount implements account{

	int accNo;
	double accBal;
	String name;
	

	public loanAccount(int accNo,int accBal, String name) {
		this.accNo=accNo;
		this.accBal=accBal;
		this.name =name;	
		
	}
	
	
	public void deposite(int amt) {
		
		System.out.println("depositing ");
		accBal=accBal-amt;
		System.out.println("depositing successfully "+accBal);
		
	}

	@Override
	public void withdrawn(int amt) {
		System.out.println("withdrawing ");
		accBal=accBal+amt;
		System.out.println("withdrawing successfully "+accBal);
	}

	@Override
	public void checkbal() {
		System.out.println("balance"+accBal);
		
	}
	
}
