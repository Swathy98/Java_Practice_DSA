package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		String str="swathylakshmi";
		Map<Character,Integer> occuranceMap=new HashMap();
		char[] charArr = str.toCharArray(); 
		for(int i=0; i<charArr.length; i++) {
			if(!occuranceMap.containsKey(charArr[i])) {
				occuranceMap.put(charArr[i],1);
			}
				else {
					occuranceMap.put(charArr[i],occuranceMap.get(charArr[i])+1);
					
				}
				for(Map.Entry<Character,Integer> each:occuranceMap.entrySet()) {
					
					System.out.println("Character "+each.getKey()+" is present "+each.getValue()+" times ");
					
				}
				
				System.out.println(occuranceMap);
			}
}
		


	}

