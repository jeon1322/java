package day16.ex;

import java.util.*;

public class Ex01 {
	/*
	 	5 ~ 10 사이의 정수를 랜덤하게 발생시켜서
	 	그 수만큼의 학생의 점수를 기억하는 
	 	HashMap을 만들어서 데이터를 기억시키고
	 	꺼내서 출력하세요.
	 	데이터를 꺼낼때 키를 모두 추출해서 꺼내는 방식으로 출력하세요.
	 */

	public Ex01() {
		int rad = (int)(Math.random() * 6 + 5);
		String[] subject = {"영어", "수학", "과학", "자바", "db", "web", "jsp", "도덕", "c언어", "파이썬"};
		HashMap student = new HashMap();
		for(int i = 0; i < rad; i++) {
			int score = (int)(Math.random() * 41 + 60);
			student.put(subject[i], score);
		}
		Set set = student.entrySet();
		
		Iterator itor = set.iterator(); 
		while(itor.hasNext()) {
			Object obj = itor.next();
			Object key = ((Map.Entry) obj).getKey();
			Object value = ((Map.Entry)obj).getValue();
			
			String sj = (String) key;
			int sco = (int) value;
			
			System.out.println(sj + " : " + sco);
		}
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
