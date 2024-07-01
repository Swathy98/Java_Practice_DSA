package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Dataprovider {

	public static void main(String[] args) {
		
Map<String,Integer> dataMap=new HashMap<>();
dataMap.put("swathy",25 );
dataMap.put("Lakshmi",25 );
dataMap.put("Tamil",27);
dataMap.put("Elavenil",27);

System.out.println("Name \t Age");
for(Map.Entry<String,Integer> entry:dataMap.entrySet()) {
	String name=entry.getKey();
	int age=entry.getValue();
	System.out.println(name + "\t" +age);
}
	}

}
