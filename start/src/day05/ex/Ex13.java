package day05.ex;
/*
문제 13 ]
	랜덤한 두 수를 입력한 후
	두 수의 최대 공약수를 구하는 프로그램을 작성하세요.
	
	최대 공약수 :
		두 수의 약수중 제일 큰 수.
		두 수를 나눌 수 있는 수중 제일 큰 수
		
	extra ]
		위 문제가 해결되면 최소공배수를 구하는 문제로 풀어보세요.
*/

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int no1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int no2 = sc.nextInt();
		
		int min = (no1 < no2) ? no1 : no2;
		int result = 1;
		
		for(int i = min; i > 1; i--) {
			if(no1 % i == 0 && no2 % i == 0) {
				result = i;
				
				break;
			}
		} System.out.println("입력받은 두 수 " + no1 + " | " +no2+ "의 최대 공약수는 " + result + " 입니다.");
	}

}
