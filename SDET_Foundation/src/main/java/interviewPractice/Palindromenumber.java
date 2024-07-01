package interviewPractice;

public class Palindromenumber {

	public static void main(String[] args) {
		int inp=348,sum=0,rem=0;
		 int input=inp;
		while(inp>0) {
			rem=inp%10;
			sum=sum*10+rem;
			inp=inp/10;
		}
	System.out.println(sum==input);	
	}

}
  	