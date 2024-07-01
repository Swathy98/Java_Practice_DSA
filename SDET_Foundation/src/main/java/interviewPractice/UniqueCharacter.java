package interviewPractice;
import java.util.Map;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {

	public static void main(String[] args) {
String str ="qqqwaass";
		
		Map<Character,Integer> uniquecharacterMap =new HashMap();
		
		char[] charArr = str.toCharArray(); 
		
		for(int i=0; i<charArr.length; i++) {
			if(!uniquecharacterMap.containsKey(charArr[i])) {
				uniquecharacterMap.put(charArr[i],1);
			}
			else {
				uniquecharacterMap.put(charArr[i], uniquecharacterMap.get(charArr[i])+1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> each: uniquecharacterMap.entrySet()) {
		
			if(each.getValue()==1) {
				System.out.println("Character "+each.getKey()+" is a unique value ");
			}
			
		}
		System.out.println(uniquecharacterMap);
	}

}
