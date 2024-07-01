package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Character {

	public static void main(String[] args) {
		String str = "Automationtesting";
		char[] chararr = str.toCharArray();
		Map<Character, Integer> characterMap = new HashMap<>();
		for (int i = 0; i < chararr.length; i++) {
		    if (!characterMap.containsKey(chararr[i])) {
		        characterMap.put(chararr[i], 1); // Issue here
		    } else {
		        characterMap.put(chararr[i], characterMap.get(chararr[i]) + 1);
		    }
		}
		for (Map.Entry<Character, Integer>each : characterMap.entrySet()) {
		    if (each.getValue()>3) {
		        System.out.println("The character is: " + each.getKey() + " with count: " + each.getValue());
		    }
		}
		System.out.println(characterMap);
}
}