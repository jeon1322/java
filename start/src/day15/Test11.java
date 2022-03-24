package day15;
/*
 	5 ~ 25 사이의 랜덤한 정수를 반지름ㅇ로 하는 원을 기억할 클래스를 만들고
 	원 10개를 리스트에 채워서
 	넓이 넓은 원부터 내림차순으로 정렬해서
 	내용을  출력하세요.
 	
 */
import java.util.*;

import javax.xml.bind.annotation.W3CDomHandler;

public class Test11 {

	public Test11() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Won w = new Won((int) (Math.random() * 25 + 5));
			list.add(w);
		}
		System.out.println("1. 내림차순 정렬 전");
		for(Object o : list) {
			Won w = (Won)o;
			System.out.println(w);
		}
		System.out.println();
		
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				int result = 0;
				
				Won w1 = (Won) o1;
				Won w2 = (Won) o2;
				
				double area1 = w1.getArea();
				double area2 = w2.getArea();
				// 반환값은 크기가 중요하지 않고 부호가 중요하므로
				result = ((area1 - area2 <= 0)) ? -1 : 1;
				
				return -result;
			}
		});
		System.out.println("2. 내림차순 정렬 후");
		for(Object o : list) {
			Won w = (Won)o;
			System.out.println(w);
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
