package sec31.exam04;

import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/jsp");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String elememt = iterator.next();
			System.out.println("\t" + elememt);
			
			
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " +set.size());
		
		iterator = set.iterator();
		for(String elememt : set) {
			System.out.println("\t" + elememt);
		}
		set.clear();
			if(set.isEmpty()) {System.out.println("비어있음");}
			
		}
		
	}


