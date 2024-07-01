package interviewPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] a= {23,98,0,84,0,54,0,32,46,0,79};
		List<Integer> c = new ArrayList();
		int[] b= new int[a.length];
		int ind = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>0) {
				c.add(a[i]);
			}
			else {
				ind++;
			}	
		}
		//System.out.println(ind);
		for(int j=0; j<ind; j++) {
			c.add(0);
		}
		System.out.println(c);
		//System.out.println(Arrays.toString(b));
		

	}

}
