package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class PrintkeysMap {

	public static void main(String[] args) {
		
	Map<Integer,String> printkeyMap=new HashMap();
	printkeyMap.put(1,"tamil");
	printkeyMap.put(2,"elavenil");
	printkeyMap.put(3,"swathy");
	printkeyMap.put(4,"lakshmi");
	System.out.println(printkeyMap);
	
	for(Map.Entry<Integer,String> each:printkeyMap.entrySet()) {
		System.out.println("the keys are: " +each.getKey());
	System.out.println("the values are : "+each.getValue());
	}
	
}
}