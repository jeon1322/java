package day15;

import java.util.*;

public class Test15 {
/*
	삼각형의 정보를 기억하는 Semo 클래스를 만들고
	15개의 삼각형을 높이가 큰 삼각형부터 정렬되어서 저장되도록
	TreeSet을 만들고
	내용을 출력하세요.
	
 */
	public Test15() {
		TreeSet set = new TreeSet();
		
		while(true) {
			Semo s = new Semo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5) );
			
			set.add(s);
			
			if(set.size() == 15) {
				break;
			}
		}
		ArrayList list = new ArrayList(set);
		for(Object s : list) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		new Test15();
	}

}
