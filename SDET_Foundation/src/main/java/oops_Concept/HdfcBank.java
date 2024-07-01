package oops_Concept;

import javax.management.remote.SubjectDelegationPermission;

public class HdfcBank extends ReserveBank {
	@Override 
	public void printBankName()
    {
        //super.printBankName();
        System.out.println("HDFC Bank pvt.ltd");
    }
	
	public void useSuperKeyWord() {
		super.printBankName();
	}
	
	public static void main(String[] args) {
		ReserveBank rb = new ReserveBank();
		
		rb.customerId = "123456";
		if (rb.customerIdCheck()) {
			System.out.println("The customer Id is numberic: "+rb.customerId);
		}
		
		rb.customerName="Swathy";
		if (rb.customerNameCheck()) {
			System.out.println("The customer name is Alphabetic: "+rb.customerName);
		}
		
		//System.out.println(ReserveBank.minimumBalance);
		if (ReserveBank.minimumBalance>=5000) {
			System.out.println("Account minimum balance is: "+ ReserveBank.minimumBalance);
		}
		
		ReserveBank.accountType = "Savings";
		
		System.out.println("The account type is :"+ReserveBank.accountType);
		
		//ReserveBank.minimumBalance = 3000;
		
		System.out.println("Combined balance for savings and current:  "+ReserveBank.add(5000,10000));
		
		System.out.println("Combined balance for savings, current and share account:  "+ReserveBank.add(5000,10000,100000));
		
		
		HdfcBank hb = new HdfcBank();
		//Calling overridden method
		hb.printBankName();
		
		ReserveBank ab = new HdfcBank();
		ab.printBankName();
		
		//calling original parent method
		
		rb.printBankName();
		
		//calling original parent method by super keyword method
		
		hb.useSuperKeyWord();
		
		

		
		
		
	}

}
