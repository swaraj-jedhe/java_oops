package interface1;

public class bankofmaharastra implements phonepay {

	@Override
	public void transfer(int amt) {

 System.out.println("transfer money to phonepay wallet  "+amt);
  
 
		
	}

	@Override
	public void checkbal() {
		 System.out.println("wallet balence "+wallet);
		
	}

	
}
