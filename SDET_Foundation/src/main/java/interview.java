import java.util.HashMap;
import java.util.Map;

public class interview {

	public static void main(String[] args) {
		Map<Integer,String> names = new HashMap();
		
		names.put(1,"Tamil");
		names.put(2,"ELavenil");
		names.put(3,"Swathy");
		names.put(4,"lakshmi");
		names.put(5,"Srinivasalu");
		
		for(Map.Entry<Integer, String> each: names.entrySet()) {
			if(each.getValue().length()>5) {
				System.out.println(each.getValue()+" "+"Is length greater than 5");
			}
		}


	}

}
