
public class seperateDigits {

	public static void main(String[] args) {
		String inp = "rabjkbwwdc@33443edejdwqb";
		int charCount = 0;
		int numCount = 0;
		
		for(int i =0; i<inp.length(); i++) {
			Character each = inp.charAt(i);
			if(Character.isDigit(each)) {
				numCount++;
			}
			else {
				charCount++;
			}
		}
		System.out.println("The number count in input is "+numCount);
		System.out.println("The character count in input is "+charCount);

	}

}
