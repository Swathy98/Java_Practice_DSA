package interviewPractice;

import java.util.Arrays;

public class CapgeIntw {
	public static String splitNum(String inpu) {	
		String[] arr = inpu.split("");
		int a = Integer.parseInt(arr[0])+1, b = Integer.parseInt(arr[1])+1, c = Integer.parseInt(arr[2])+1;
		
		String d = Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
		
		return d;
	}
	
	public static void main(String[] args) {
		String inp = "756/234";
		
		String[] splitArr = inp.split("/");
		
		System.out.println(Arrays.toString(splitArr));
		String nume = splitNum(splitArr[0]);
		String deno = splitNum(splitArr[1]);
		
		System.out.println(nume+"/"+deno);
}

	
}