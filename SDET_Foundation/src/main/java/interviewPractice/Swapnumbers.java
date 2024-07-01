package interviewPractice;

public class Swapnumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		
		System.out.println("Values before swapping: " +a+" "+b);
		a=a+b;
		System.out.println(a);
		b=a-b;
		System.out.println(b);
		a=a-b;
		System.out.println(a);
		System.out.println("Values after swapping: "+a+" "+b);

	}

}
