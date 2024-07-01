package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {

	public static void main(String[] args) {
		
String str ="success";
		
		Map<Character,Integer> DuplicateMap = new HashMap();
		
		char[] charArr = str.toCharArray(); 
		
		for(int i=0; i<charArr.length; i++) {
			if(!DuplicateMap.containsKey(charArr[i])) {
				DuplicateMap.put(charArr[i],1);
			}
			else {
				DuplicateMap.put(charArr[i], DuplicateMap.get(charArr[i])+1);
			}
		}
		
		for(Map.Entry<Character, Integer> each: DuplicateMap.entrySet()) {
		
			if(each.getValue()>1) {
				System.out.println("Character "+each.getKey()+" is a Duplicate value ");
			}
			
		}
		System.out.println(DuplicateMap);
	}



	}


