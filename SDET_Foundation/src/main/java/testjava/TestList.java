package testjava;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		// Add Elements to the List
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// Accessing Elements to the List
		
		System.out.println("Elements of an List are : ");
		for (Integer a : list) {
		System.out.println(a);

		}
		
List<Integer> list1 = new ArrayList<>();
		
		// Add Elements to the List
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		
		//Update Elements
		
		list1.set(2, 50); // (index, newValue)

		System.out.println("Elements of an List are : ");
		for (Integer b : list1) {
			System.out.println(b);

	}
List<Integer> list3 = new ArrayList<>();
		
		// Add Elements to the List
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		
		// Delete Elements
		
		list3.remove(2);//index
		
		System.out.println("Elements of an List are : ");
		for (Integer c : list3) {
			System.out.println(c);
		
}
List<Integer> list4 = new ArrayList<>();
		
		// Add Elements to the List
		
		list4.add(10);
		list4.add(20);
		list4.add(30);
		list4.add(null);
		list4.add(30);
		list4.add(null);
		System.out.println();
		for(int i=0;i<list4.size();i++) {
			
			//list4.get(i);
			
			System.out.println(list4.get(i));
		}
			System.out.println();
			List<Integer> list5 = new ArrayList<>();
			
			// Add Elements to the List
			
			list5.add(10);
			list5.add(20);
			list5.add(30);
			list5.add(40);
			
			// contains method 
			
			boolean val=list5.contains(60); //false
			System.out.println(val);
			
			//is empty method 
			
			List<Integer> list6= new ArrayList<>();
			boolean emp=list6.isEmpty();
			System.out.println(emp);
}
}
