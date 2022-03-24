package day08;
/*
	문자와 출현수를 기억한 배열들 10개를 관리하는 배열을 만들고
	'A'- 'J'를 랜덤하게 100번 반복해서 만들고
	배열에 카운트를 기억을 시켜서
	결과를 출력하세요.
	
 */

import java.util.Arrays;

public class Test12 {

	public static void main(String[] args) {
		int[][] munja = new int[10][2];
		for(int i = 0; i < munja.length; i++) {
			munja[i][0] = 'A' + i;
		}
		
		for(int i = 0; i < 100; i++) {
			int ch = (int)(Math.random() * ('J' - 'A' + 1) + 'A');
			for(int j = 0; j < munja.length; j++) {
				if((munja[j][0] - ch) == 0) {
					munja[j][1] = munja[j][1] + 1;
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < munja.length; i++) {
		System.out.println("["+(char)munja[i][0]+"] ["+munja[i][1]+"]");
		sum += munja[i][1];
		}
		System.out.println(sum+"번 실행 했습니다.");
	}

}
