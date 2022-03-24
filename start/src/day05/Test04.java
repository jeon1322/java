package day05;
/*
 * 나이를 입력 받아서
 * 		유년층
 *  	10대
 *  	20대
 *  	30대
 *  	40대
 *  	장년층
 *  으로 구분해서 출력하세요.
 */

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 조건이 여러가지인 경우는 if ~ else if문으로 처리하는 것이 편하다.
		//할일
		// 입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		// 메시지 출력
		System.out.print("나이를 입력 : ");
		//입력 받아 변수에 기억시키기
		int age = sc.nextInt();
		//결과 변수
		String sage="장년층";
		//판별해서 결과 기억하고
		if(age < 10) {
			sage = "유년기";
		}else if(age < 20) {
			sage = "10대";
		}else if(age < 30) {
			sage = "20대";
		}else if(age < 40) {
			sage = "30대";
		}else if(age < 50) {
			sage = "40대";
		} 
		//결과 출력
		System.out.println("입력 나이 " +age+"는 " +sage+"입니다.");
	}
}
