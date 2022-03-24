package day07.ex;
/*
 * 문제1]
 * 	'A' ~ 'J' 까지의 문자를 랜덤하게 100개 만들고
 * 	각문자의 출현횟수를 기억할 배열을 만들어서
 * 	횟수만큼 '*'로 출력해주는 프로그램 만들기
 * 
 */

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		char[] ch = new char[10];
		int[] count = new int[10];
		int sum = 0;
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)('A' + i);
		}
		System.out.println(Arrays.toString(ch));
		for(int i = 0; i < 100; i++) {
			char c = (char)(Math.random() * ('J' - 'A' + 1) + 'A');
			for(int j = 0; j < ch.length; j++) {
				if(c == ch[j]) {
					count[j] += 1;
				}
			}
		}
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]+"은 ");
			for(int j = 0; j < count[i]; j++)
			System.out.print("*");
			sum += (int)count[i];
			System.out.println();
		}
		System.out.println(sum+"번 실행 했습니다.");
	}
}
