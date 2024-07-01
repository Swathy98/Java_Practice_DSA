package interviewPractice;

public class Replace {

	public static void main(String[] args) {
		String str="TamilElavenil";
		
		String output="";
		for(char a: str.toCharArray()) {
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
				output+="@";
			}
			else {
				output+=a;
			}
		}
		//String a = "12abc  %";
		
		//String b= a.replaceAll("[a-zA-Z^a-zA-Z%]","");
		//System.out.println(b);
		System.out.println(output);
	}
	
}
