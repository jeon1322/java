package day16;

import java.util.*;


public class Test11 {

	public Test11() {
		HashSet<String> set = new HashSet<String>();
		
		set.add("리사");
		set.add("로제");
		set.add("제니");
		set.add("지수");
		
		// 향상된 for문으로
		for(String name : set) {
			System.out.println(name);
		}
		
		ArrayList<String> blackpink = new ArrayList<String>(set);
		
		for(int i = 0; i < blackpink.size(); i++) {
			System.out.println(blackpink.get(i));
		}
		for(String names : blackpink) {
			System.out.println(names);
		}
		
		Iterator<String> itor = set.iterator();
		while(itor.hasNext()) {
			String name = itor.next();
			System.out.println(name);
		}
		
	}

	public static void main(String[] args) {
		new Test11();
	}

}
