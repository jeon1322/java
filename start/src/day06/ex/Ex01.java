package day06.ex;
/*
 * 문제 1]
 * 		3 ~ 100 사이의 정수를 입력 받아서
 * 		이 정수가 소수인지 판단하는 프로그램을 작성하세요.
 * 		
 * 		참고]
 * 			소수
 * 				1과 자신으로만 나누어지는 수
 * 
 * 보너스]
 * 		3 ~ 100 사이의 숫자 중에서 소수만 모두 출력하세요.
 * 
 */

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 100 사이 정수를 입력 : ");
		int no = sc.nextInt();*/
		String div;
		for(int j = 3; j < 100; j++) {
			int count = 0;
		for(int i = 1; i < 100; i++) {
			if(j % i != 0) continue;
			count++;
		}
		if(count == 2) {
			div = "true";
		}else{
			div = "flase";
		}
		if(div == "true")
		System.out.println(j+"는 소수 ["+div+ "] 입니다." + count);
		}
	}

}
