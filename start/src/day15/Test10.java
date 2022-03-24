package day15;

import java.util.*;

public class Test10 {

	public Test10() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 25 + 1));
		}
			System.out.println("1. 정렬 전 : ");
			for(int i = 0; i < list.size(); i++) {
				System.out.print((int)list.get(i) +" | ");
		}
			System.out.println();
			
			Collections.sort(list, new DownSort());
			System.out.println("2. 내림차순 정렬 후 : ");
			for(int i = 0; i < list.size(); i++) {
				System.out.print((int)(list.get(i)) + " | ");
			}
	}

	public static void main(String[] args) {
		new Test10();
	}
	
class DownSort implements Comparator{
	/*
	 	정렬 방식을 변경하기 위해서는 Comparator를 상속 받은 클래스를 만들어야 한다.
	 	
	 */
	public int compare(Object o1, Object o2) {
		int result = 0;
		
		int no1 = (int) o1;
		int no2 = (int) o2;
		result = no1 - no2;
		return -result;
	}
}
}
