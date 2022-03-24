package day15;


import java.util.*;

public class Test08 {

	public Test08() {
		LinkedList member = new LinkedList();
		
		member.add("제니");
		member.add("리사");
		member.add("로제");
		member.add("지수");
		
		int len = member.size();
		for(int i = 0; i < len; i++) {
			String name = (String) member.get(i);
			
			System.out.println(name);
		}
		System.out.println(member);
	}

	public static void main(String[] args) {
		new Test08();
	}

}
