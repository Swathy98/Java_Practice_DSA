package interviewPractice;

public class Swapvalues {

	public static void main(String[] args) {
		String s1="Tamil";
		String s2="Elavenil";
		System.out.println("String before swapping : " +s1 +s2);
		
		s1=s1+s2;
		
		System.out.println(s1);
		
		s2=s1.substring(0,(s1.length()-s2.length()));
		
		System.out.println(s2);
		
		s1=s1.substring(s2.length());
		
		System.out.println(s1);
		System.out.println("String after swapping : " +s1 +s2);
	}

}
