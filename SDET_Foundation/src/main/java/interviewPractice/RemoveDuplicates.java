package interviewPractice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String str="success";
		StringBuilder sb=new StringBuilder();
		Set<Character> duplicateChar=new HashSet();
		char[] chararr=str.toCharArray();
		for(int i=0;i<chararr.length;i++) {
			duplicateChar.add(chararr[i]);
			
			
		}
		for(Character add: duplicateChar) {
			sb.append(add);
		}
		System.out.println(sb);
	}

}
