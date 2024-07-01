package oops_Concept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNumbers {
	
	//public static
	
	//public static Set<Integer> setVar = new HashSet();
	
	public static void main(String[] args) {
		 int[] inp = {1,4,3,4,2,4,5,5,6,6};
		 
		 Set<Integer> setVar = new HashSet();
			
		for(int eachNum: inp) {
			Integer a = eachNum;
			setVar.add(a);
			//System.out.println(setVar);
		}
		
		inp = new int[setVar.size()];
		int j =0;
		for(Integer each: setVar) {
			inp[j++] = each;
		}
		
		System.out.println(Arrays.toString(inp));
		
	}
	
	

}
