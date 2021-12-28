package sets;

import java.util.*;

public class Intro {

	public static void main(String[] args) {
		//retainAll() helps find the intersection of two sets
		//Constant time operations are what makes Sets different and fast
		Set<String> s1 = new HashSet<>();
		
		s1.add("Mango");
		s1.add("Apple");
		s1.add("Banana");
		System.out.println(s1);
		
		//LinkedHashSet has the same underlying rules but displays
		//the element in the order you add them sequentially
		//They execute with Linked Lists operations and have the same time complexity as 
		//Linked Lists.
		Set<String> s2 = new LinkedHashSet<>();
		s2.add("Mango");
		s2.add("Apple");
		s2.add("Banana");
		System.out.println(s2);
		
		//TreeSet gives you a sorted Set
		
		Set<String> s3 = new TreeSet<>();
		s3.add("Mango");
		s3.add("Apple");
		s3.add("Banana");
		System.out.println(s3);
		
		
		//addAll() --> Union of two sets
		//retailAll() --> Intersection of two sets
		//
		Set<Integer> one = new HashSet<>();
		Set<Integer> two = new HashSet<>();
		
	//	one.add(1);
		one.add(2);
		one.add(3);
		two.add(2);
		two.add(11);
		two.add(3);
		two.add(5);
		//one.addAll(two);
		//one.retainAll(two);
		System.out.println(two.containsAll(one));
		System.out.println(one);
	}

}
