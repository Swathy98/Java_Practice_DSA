package interviewPractice;

import java.util.ArrayList;
import java.util.List;

public class AddingValues {

	public static void main(String[] args) {
	
		
		List<String> list1 =new ArrayList<String>();
		list1.add("Java");
		list1.add("Python");
		list1.add("Ruby");
		list1.add("c");
		List<String> list2 =new ArrayList<String>();
		list2.add("Python");
		list2.add("Ruby");
		List<String> list3=new ArrayList<String>();
		for(int i=0;i<list1.size();i++) {
			if(!list2.contains(list1.get(i))) {
				list3.add(list1.get(i));
			}
		}

System.out.println(list3);

	}

}
