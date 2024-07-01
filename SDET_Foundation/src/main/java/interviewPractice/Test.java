package interviewPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
	String str="swathylakshmi";
	Map<Character,Integer> countMap= new HashMap();
	char[] chararr=str.toCharArray();
for(int i=0;i<str.length();i++) {
	if(!countMap.containsKey(chararr[i])) {
	
		countMap.put(chararr[i],1);
	}
	else
	{
		countMap.put(chararr[i],countMap.get(chararr[i])+1);
		
	}
	for(Map.Entry<Character,Integer> each:countMap.entrySet()) {
		
		System.out.println("character "+each.getKey()+ " is present "+each.getValue()+ " times" );
	}
	System.out.println(countMap);
}
	}
}
