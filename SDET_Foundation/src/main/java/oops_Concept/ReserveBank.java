package oops_Concept;

public class ReserveBank {

	public String customerId;
	public String customerName;
	public static final int minimumBalance = 5000;
	public static String accountType;

	public boolean customerIdCheck() {
		boolean check = true;
		for(char each: customerId.toCharArray()) {
			if(!Character.isDigit(each)) {
				check = false;
			}
		}
		return check;
	}
	
	public boolean customerNameCheck() {
		boolean check1 = true;
		for(char each: customerName.toCharArray()) {
			if(!Character.isAlphabetic(each)) {
				check1 = false;
			}
		}
		return check1;
	}
	
	// example1 for method overloading
	public static int add(int savings, int currentAccount) {
		return savings + currentAccount;
		}
	
	//example2
    public static int add(int savings, int currentAccount, int shareBalance)
    {
        return savings + currentAccount + shareBalance;
    }
    
    //example for overriding
    public void printBankName() {
    	System.out.println("RBI");
    }
    
    

}


