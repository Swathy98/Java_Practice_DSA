package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class split {

	private static int length;

	public static void main(String[] args) {
		String str="Education is more important";
	String[] splitted=str.split(" ");
	//int chararr=splitted.length;
	Map<String,Integer> occuranceMap=new HashMap();
	
	for (int i = 0; i < splitted.length; i++) {
		if (!occuranceMap.containsKey(splitted[i])) {
			occuranceMap.put(splitted[i], 1);
		} else {
			occuranceMap.put(splitted[i], occuranceMap.get(splitted[i]) + 1);

		}
	}
	
			for(Map.Entry<String,Integer> each:occuranceMap.entrySet()) {
				
				System.out.println("word "+each.getKey()+" is present "+each.getValue()+" times ");
				
			}
			
			System.out.println(occuranceMap);
		}
}
