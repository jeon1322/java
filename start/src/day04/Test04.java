package day04;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		//할일
		//입력도구 준비하고
		Scanner sc = new Scanner(System.in);
		//입력메세지 출력하고
		System.out.println("정수 입력 : ");
		// 입력받아서 변수에 기억하고
		int num = sc.nextInt();
		//짝수인지 홀수인지 판별하고
		String result = (num % 2 == 0) ? ("짝수") : ("홀수");
		
		//출력하고
		System.out.println("입력받은 숫자 ["+num+"]은 '"+result+"' 입니다.");
		
		
					
	}
}
