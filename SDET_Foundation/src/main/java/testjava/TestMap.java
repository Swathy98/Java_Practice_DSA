package testjava;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap();
		
		//adding Values to map
		
		map.put("swathy",15);
		map.put("lakshmi",45);
		map.put("tamil",35);
		map.put("elavenil",55);
		
		System.out.println(map);
		
		//updating values
		
		map.put("swathy", 20);
		System.out.println(map);
		
		//remove values
		
		map.remove("elavenil");
		System.out.println(map);
		
		// get method
		
		int values=map.get("swathy");
		System.out.println(values);
		
		//contains method in map
		
		Boolean value1=map.containsKey("tamil");
		System.out.println(value1);
		
		boolean val=map.containsValue(45);
		System.out.println(val);
		
	}

}
