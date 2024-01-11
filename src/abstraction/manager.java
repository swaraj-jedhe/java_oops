package abstraction;

public class manager {

public account getaccountinstance(char typeofaccount)
{
	account a1=null;
	if(typeofaccount == 's')
	{
		a1 =new savingAccount(4420,250,"fsomkar");
				return a1;
	}
	else if(typeofaccount=='l') {
					
		a1 =new savingAccount(4620,260,"mayuresh");
				return a1;
	 				
				}
		
	 return a1;
}

}
