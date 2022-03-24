package day07;
/*
 * 1 ~ 10까지의 정수를 순서대로 배열에 저장 시키고
 * 이 숫자를 랜덤하게 섞어서 출력되도록 하세요.
 * 
 */

import java.util.Arrays;

public class Test06 {

	public static void main(String[] args) {
		int[] no = new int[10];
		
		for(int i = 0; i < no.length; i++) {
			no[i] = i+1;
		}
		for(int i = 0; i < 100; i++) {
			int rnd1 = (int)(Math.random() * (9 - 0 + 1) + 0);
			int rnd2 = (int)(Math.random() * (9 - 0 + 1) + 0);
			if(rnd1 == rnd2) {
				--i;
				continue;
			}
			int re = 0;
			re = no[rnd1];
			no[rnd1] = no[rnd2];
			no[rnd2] = re;
		}
		System.out.println(Arrays.toString(no));
	}
}
