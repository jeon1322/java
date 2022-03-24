package day07;

import java.util.Arrays;


/*
 *  5개의 메모리를 배열로 만들고
 *  그안에 랜덤한 숫자(정수)를 입력한 후 출력하세요.
 * 
 */

public class Test02 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		loop:
		for(int i = 0; i < 6; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			//중복 검사
			for(int j = 0; j < i; j++) {
				int tmp = lotto[j];
				if(lotto[i] == tmp) {
					i--;
				}
			}
		}
		for(int i = 0; i < lotto.length; i++) {
		System.out.print(lotto[i]+" | ");
		}
	}
}
