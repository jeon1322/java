package day16.ex;

import java.util.*;

public class Ex02 {
/*
 	 학생들의 과목점수를 기억하는 HashMap을 만들고 
 	 다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
 	 과목은 [국어, 영어, 수확, 과학, 국사]의 점수를 기억하도록 하세요.
 	 
 */
	public Ex02() {
		String[] names = {"리사", "로제", "제니", "지수", "둘리"};
		String[] subject =  {"국어", "영어", "수학", "과학", "국사"};
		
		HashMap student;
		List list = new ArrayList();
		for(int i = 0; i < names.length; i++) {
			student = new HashMap();
			student.put("name", names[i]);
			
			for(int j = 0; j < subject.length; j++) {
				student.put(subject[j], ((int)(Math.random() * 41 + 60)));
			}
			list.add(student);
			
		}
		for(Object o : list) {
			HashMap m = (HashMap) o;
			System.out.println(m);
		}
		
		
	}

	public static void main(String[] args) {
		 new Ex02();
	}

}
