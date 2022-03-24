package day07;

import java.util.Arrays;

/*
 *  10개의 문자를 기억할 배열을 만들고
 *  'A' - 'J' 까지 차례로 입력하고 출력하세요.
 */

public class Test03 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		for(int i = 0; i < ch.length; i++) {
			// 문자 만들기
			char munja = (char)('A' + i);
			ch[i] = munja;
		}
		System.out.println(Arrays.toString(ch));
		
		for(char c : ch) {
			System.out.print(c+ " | ");
		}

	}

}
