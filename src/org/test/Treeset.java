package org.test;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<>();
		s.add("java");
		s.add("selenium");
		s.add("test");
		s.add("treeset");
		s.add("array");
		System.out.println(s);
		
		int size =s.size();
		System.out.println(size);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains("test");
		System.out.println(contains);
		
		s.remove("array");
		System.out.println(s);
		System.out.println("Enhanced for loop");
		for (String x : s) {
			System.out.println(x);
		}
		}
		
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
	


