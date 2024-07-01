package interviewMain;

import java.util.Arrays;

public class Capgemini_Java {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1,5};
		Arrays.sort(arr);
		String alpha = "a";
		for(int each:arr) {
			System.out.print(alpha+each+"_");
		}
		

	}

}
