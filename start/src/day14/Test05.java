package day14;
/*
 	문자열 데이터
 	
 	"둘리", "희동이", "도우너", "고길동"
 	를 , 를 기준으로 분리해서 출력해보자.
 */

import java.util.*;

public class Test05 {

	public Test05() {
		String member = " 둘리, 희동이, 도우너, 고길동";
		
		StringTokenizer token = new StringTokenizer(member, ",");
		//하나씩 꺼내서 출력한다.
		
		int len = token.countTokens();
		
		String[] pink = new String[len];
		
		int idx = 0;
		
		while(token.hasMoreTokens()) {
			String black = token.nextToken();
			
			pink[idx] = black;
			idx++;
			
			System.out.println(black);
			
		}
		System.out.println("======================");
		for(String name : pink) {
			System.out.print(name+ " | ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		new Test05();
	}

}
