package day08;

import java.util.Arrays;
import java.util.Scanner;

/*
		+, -, *, / 연산식으로 
 */

public class Test09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 입력하세요 : ");
		String str = sc.nextLine();
		
		String[] sik = new String[3];
		int idx = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch < '0' ||  ch > '9') {
				// 숫자 형태가 아닌 문자형태 찾기
				idx = i;
				break;
			}
		}
		sik[0] = str.substring(0, idx);
		sik[1] = str.substring(idx, idx + 1);
		sik[2] = str.substring(idx + 1);
		
		int no1 = Integer.parseInt(sik[0]);
		int no2 = Integer.parseInt(sik[2]);
		
		double result = 0.0;
		
		switch(sik[1]){
		case "+":
			result = no1 + no2;
			break;
		case "-":
			result = no1 - no2;
			break;
		case "*":
			result = no1 * no2;
			break;
		case "/":
			result = no1 / (double)no2;
			break;
		}
		
		System.out.println("입력한 계산식\n\t" + str + "\n의 결과는 \n\t"+ result);
		int[] n = new int[5];
		System.out.println(Arrays.toString(n));
	}
}
