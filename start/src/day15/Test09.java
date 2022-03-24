package day15;

import java.util.*;

public class Test09 {

	public Test09() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random() * 25 + 1));
		}
		System.out.println("1. 정렬 전 : ");
		for(int i = 0; i < list.size(); i++) {
			System.out.print((int)list.get(i) +" | ");
		}
			System.out.println();	
		Collections.sort(list);
		System.out.println("2. 오름차순 정렬 후 : ");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print((int)list.get(i) +" | ");
		}
		System.out.println();
		Collections.reverse(list);
		System.out.println("3. 내림차순 정렬 후 : ");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print((int)list.get(i) +" | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test09();
	}

}
