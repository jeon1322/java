package day05;
/*
 * 정수를 입력 받아서
 * 그 숫자가 짝수인지 홀수인지를 판별해서 출력하세요
 */

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);	
		//입력메세지 출력하고
		System.out.print("정수 입력 : ");
		//입력받아서 변수에 기억시키고
		int no = sc.nextInt();
		String result = "잘못 입력하셨습니다.";
		if(no == 0) {
		result = "0";
		}else {
			if(no != 0) {
				if(no % 2 == 0) {
					result = "짝수";
				}else{
					result = "홀수";
				}
			}
		}
		//결과 출력하고
		System.out.println("입력한 정수 " +no+ " 는 " +result+ " 입니다.");
	

	}

}
