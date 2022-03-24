package day15;

import java.util.*;


public class Test06 {

	public Test06() {
		Vector vec = new Vector();
		
		vec.add("제니");
		vec.add('F');
		vec.add(27);
		vec.add(168.5);
		vec.add(false);
		
		String name = (String) vec.get(0);
		char gen = (Character) vec.get(1);
		int age = (Integer) vec.get(2);
		double height = (Double) vec.get(3);
		boolean bool = (boolean) vec.get(4);
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gen);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("학원 : " + bool);
		
		for(Object o : vec) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
