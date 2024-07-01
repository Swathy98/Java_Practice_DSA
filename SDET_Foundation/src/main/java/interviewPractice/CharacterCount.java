package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String input ="swathylakshmi";
		
		Map<Character,Integer> countMap = new HashMap();
		
		char[] charArr = input.toCharArray();
		
		for(int i=0; i<charArr.length; i++) {
			if(!countMap.containsKey(charArr[i])) {
				countMap.put(charArr[i],1);
			}
			else {
				countMap.put(charArr[i], countMap.get(charArr[i])+1);
			}
		}
		
		for(Map.Entry<Character, Integer> each: countMap.entrySet()) {
			System.out.println("Character "+each.getKey()+" is present "+each.getValue()+" times ");
		}
		System.out.println(countMap);
		
		

	}

}
