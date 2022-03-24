package day07;
/*
 * 
 * 	정수 10개 랜덤하게 만들어서 기억하는 배열을 만들고
 * 	기억된 정수를 내림차순 정렬해서 다시 기억 시키고
 *  배열의 데이터를 출력
 *  
 */

import java.util.Arrays;

public class Test08 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int max = 0;
	loop:
		for(int i=0; i < num.length; i++) {
			int no = (int)(Math.random() * 99 + 1);
			
			for(int j = 0; j < i; j++) {
				if(num[j] == no) {
					--i;
					continue loop;
				}
			}
			num[i] = no;
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num.length; j++) {
			if(num[i] >= num[j]) {
				int re = num[i];
				num[i] = num[j];
				num[j] = re;
			}
			}
		}
		
		System.out.println(Arrays.toString(num));
		
	}	
}
