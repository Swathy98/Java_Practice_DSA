package interviewPractice;

public class Palindromestring {

	public static void main(String[] args) {
		String str = "madam";
		String out = "";
		for (int i = str.length()-1; i >= 0; i--) {
			out += str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		if (str.equals(out)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("the given string is not a palindrome");
		}

	}

}
