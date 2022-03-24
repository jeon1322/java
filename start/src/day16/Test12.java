package day16;

import java.util.*;
public class Test12 {

	public Test12() {
		HashMap<String, Integer> student = new HashMap<String, Integer>();
		
		student.put("제니", 95);
		student.put("리사", 80);
		student.put("로제", 90);
		student.put("지수", 85);
		
		Set<String> set = student.keySet();
		
		Set<Map.Entry<String, Integer>> entry = student.entrySet();
		
		Iterator<Map.Entry<String, Integer>> itor = entry.iterator();
		while(itor.hasNext()) {
			Map.Entry<String, Integer> stud = itor.next();
			String key = stud.getKey();
			int value = stud.getValue();
			
			System.out.println(key + " : " + value);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
