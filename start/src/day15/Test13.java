package day15;

import java.util.*;


public class Test13 {
	/*
	 	HashSet에 랜덤하게 숫자 6개를 채워보자.
	 	
	 	set 계열 특징
	 		1. 입력순서 보장하지 않는다.
	 		2. 중복데이터 입력을 허락하지 않는다.
	 		
	 */
	
	public Test13() {
		HashSet set = new HashSet();
		int count = 0;
		while(true) {
			int no = (int)(Math.random()*10+1);
			
			set.add(no);
			
			int len = set.size();
			if(len == 6)break;
			count++;
		}
		System.out.println("1. 반복횟수 : "+count);
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			System.out.print((int) itor.next()+ " , "	);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		new Test13();
	}

}
