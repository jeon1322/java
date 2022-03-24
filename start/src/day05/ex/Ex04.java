package day05.ex;

import java.util.Scanner;

/*
 * 문제 4]
 * 		전기요금을 계산해주는 프로그램을 작성하세요.
 * 
 * 		전기요금표
 * 					코드		기본요금		사용요금
 * 		가정용		1			3800			245
 * 		산업용		2			2400			157
 * 		교육용		3			2900			169
 * 		상업용		4			3200			174
 * 
 * 	전기요금은
 * 		기본요금 + 사용량	* 사용요금
 * 
 * 	사용자 코드와 사용량을 입력하면
 * 	전기요금을 계산해서 출력해주는 프로그램을 작성하세요.
 */
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; ; i++) {
		System.out.println("1. 가정용 \t2. 산업용 \t3. 교육용 \t4.상업용\t5. 종료");
		System.out.print("사용처를 입력 : ");
		int user = sc.nextInt();
		/*
		 * 블럭킹 함수(Blocking Method)
		 *   : 특정상황이 될때까지 그 함수에서 실행을 멈추고 기다리는 함수
		 */
		if(user == 5) {System.out.println("종료합니다."); break;}
		System.out.print("전기 사용량을 입력 : ");
		int amount = sc.nextInt();
		int fee = 0;
		if(user == 1) {
			fee = 3800 + amount * 245;
			System.out.println("가정용 사용량 : "+amount+"만큼 사용하여 "+fee+"원 입니다.\n");
		}else if(user == 2) {
			fee = 2400 + amount * 157;
			System.out.println("산업용 사용량 : "+amount+"만큼 사용하여 "+fee+"원 입니다.\n");
		}else if(user == 3) {
			fee = 2900 + amount * 169;
			System.out.println("교육용 사용량 : "+amount+"만큼 사용하여 "+fee+"원 입니다.\n");
		}else if(user == 4) {
			fee = 3200 + amount * 174;
			System.out.println("상업용 사용량 : "+amount+"만큼 사용하여 "+fee+"원 입니다.\n");
		}else {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("종료하였습니다.");
			break;
		}
		
		}
		
	}

}
