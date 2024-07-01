package interviewPractice;

import java.util.Arrays;

public class larsmallestnum {

	public static void main(String[] args) {
		int[] arr= {15,86,74,16,23,97};
Arrays.sort(arr);
int  thirdlargest=arr[arr.length-3];
int secondlowest=arr[1];
System.out.println("3rd largest element: " +thirdlargest);
System.out.println("2nd smallest element: " +secondlowest);
	}

}
