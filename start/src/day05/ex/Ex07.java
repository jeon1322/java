package day05.ex;

import java.util.Scanner;

/*
 * 문제 7]
 * 		5자리의 숫자를 입력한 후
 * 		각자리의 수의 합을 구하는 프로그램을 작성하세요.
 * 		
 * 		
 */

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력 : ");
		int no = sc.nextInt();
		int sum = 0;
		int tmp = no;
		
		for(int i = 0; i < 5; i++) {
			sum += tmp % 10;
			tmp = tmp/10;
			
		}
		System.out.println("입력한 수 "+no+"의 각 자리수의 합은 "+sum+" 입니다.");
	}

}
