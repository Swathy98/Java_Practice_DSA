package testjava;

public class Counts {

	public static void main(String[] args) {
		String str = "swathy123098LAKSHMI@@@!!lakshmi";
		int alphacount = 0, ncount = 0, spcount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' || str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				alphacount++;
			}
			if (str.charAt(i)-'0' >= 0 && str.charAt(i)-'0'<= 9) {
				ncount++;
			}
		}
		System.out.println("The count of alphabets are : " + alphacount);
		System.out.println("The count of digits are : " + ncount);

	}
}
