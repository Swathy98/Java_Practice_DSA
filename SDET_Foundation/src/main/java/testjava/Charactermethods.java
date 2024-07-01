package testjava;

public class Charactermethods {

	public static void main(String[] args) {
		
		String str = "swathy123LAKSHMI@@@!!lakshmi";
		int acount = 0, ncount = 0,ucount=0,lcount=0,scount=0;
		String s1="",s2="",s3="",s4="",s5="";

		// char[] chararr=str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			// Character c=chararr[i];
			if (Character.isAlphabetic(str.charAt(i))) {
				acount++;
				s1+=str.charAt(i);
			}
			if (Character.isDigit(str.charAt(i))) {
				ncount++;
				s2+=str.charAt(i);
			}
			if(Character.isUpperCase(str.charAt(i))) {
				ucount++;
				s3+=str.charAt(i);
			}
			if(Character.isLowerCase(str.charAt(i))) {
				lcount++;
				s4+=str.charAt(i);
			}
			
			if(!Character.isLetterOrDigit(str.charAt(i))) {
				scount++;
				s5+=str.charAt(i);
			}
			
		}
		
		System.out.println("The count of alphabets are : " +acount);
		System.out.println("The count of digits are : " +ncount);
		System.out.println("Upper count: " +ucount);
		System.out.println("Lower count : " +lcount);
		System.out.println("special characters count : " +scount);
		System.out.println("String s1 " +s1);
		System.out.println("String s2 " +s2);
		System.out.println("String s3 " +s3);
		System.out.println("String s4 " +s4);
		System.out.println("String s5 " +s5);
	
		
	}

}
