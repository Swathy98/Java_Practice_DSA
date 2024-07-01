package testjava;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet();
		// adding elements to Set

		set.add(0);
		set.add(1);
		set.add(2);
		set.add(3);

		// printing Elements

		for (int a : set) {
			System.out.println(a);
		}
		System.out.println();
		
		Set<Integer> set1 = new HashSet();
		
		// adding elements to Set

		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.remove(1);
		set1.add(null);
		set1.add(2); //doesn't allow duplicate
		System.out.println(set1);

		//contains method in set
		Set<Integer> set2 = new HashSet();
		
		set2.add(0);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		
		boolean val=set2.contains(6); // false
		System.out.println(val);
		
		//isempty method in set
		
		boolean val1=set2.isEmpty(); // false
		System.out.println(val1);

	}

}
