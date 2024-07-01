package interviewPractice;

public class Primenumber {

	public static void main(String[] args) {
		int i,m=0,temp=0;      
		  int n=17;
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  
		 else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {     
		    	
		     System.out.println(n+" is not prime number"); 
		     
		     temp=1;      
		     break;      
		    }      
		   }      
		   if(temp==0)  { 
			   
			   System.out.println(n+" is prime number"); 
			   
		   }  
		  }
		}    
		}   
