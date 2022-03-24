package day15;

import java.util.*;

public class Test12 {

	public Test12() {
		HashSet set = new HashSet();
		
		set.add("제니");
		set.add("리사");
		set.add("로제");
		set.add("지수");
		
		int len = set.size();
		System.out.println("채워진 멤버 수 : " +len);
		
		/*
		 	set계열 컬렉션은 데이터를 꺼내는 함수가 존재하지 않는다.
		 	따라서 꺼내서 사용해야 할 경우에는
		 		1. Iterator로 변환후 꺼내서 사용
		 		2. List 계열로 변환후 하나씩 꺼내서 사용하거나
		 */
		
		System.out.println("1. Iterator를 이용하는 방법");
		//1. Iterator로 변환해서 사용하는 방법
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			String name = (String) itor.next();
			
			System.out.println("blackpink member : "+name);
		}
		System.out.println("2. List 계열로 변환해서 사용하는 방법");
		Vector vec = new Vector(set);
		for(int i = 0; i < vec.size(); i++) {
			String name = (String)vec.get(i);
			
			System.out.println("blackpink member : "+name);
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
