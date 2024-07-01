import java.util.HashMap;
import java.util.Map;

public class getMaxAge {

	public static void main(String[] args) {
		HashMap<String, Integer> ageList = new HashMap();
		
		ageList.put("ruby", 29);
		ageList.put("vedha", 11);
		ageList.put("kavya", 50);
		ageList.put("swathy", 50);
		
		int tempAge =0;
		//int maxAge=0;
		for(Map.Entry<String,Integer> each: ageList.entrySet()) {
			if(each.getValue()>tempAge) {
				tempAge=each.getValue();	
			}
		}
		
		for(Map.Entry<String,Integer> eachName: ageList.entrySet()) {
			if(eachName.getValue()==tempAge) {
				System.out.println(eachName.getKey()+"Is the name with highest age");
				//break;
			}
		}
	}

}
