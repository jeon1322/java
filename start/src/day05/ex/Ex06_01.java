package day05.ex;
/*
문제 6 ]
	랜덤하게 정수를 컴퓨터가 만들어 내면
	그 수를 알아맞추는 게임을 만드세요.
	
	예 ]
		
		발생숫자 : 54
		
		사용자입력숫자 : 45
		
		==> "입력한 수가 더 작습니다."
		로 메세지 를 출력해서 사용자가 숫자를 알아맞추는 게임...
		
	단, 입력횟수가 5번을 초과하는 순간 컴퓨터의 승리로 처리하고
	프로그램이 종료되게 하세요.
*/

import java.util.Scanner;

public class Ex06_01 {
	public static void main(String[] args) {
		int com = (int)(Math.random() * (100 - 1 + 1) + 1);
		int count=0;
		for(int i = 0; i < 5 ; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.print("컴퓨터 숫자 맞추세요 user : ");
		int user = sc.nextInt();
		if(com == user) {
			System.out.println("com : "+com+ "\nuser : "+user);
			System.out.println("승리하셨습니다.");
			break;
		}else if(com > user) {
			System.out.println((i+1)+"번째 입니다.");
			System.out.println("컴퓨터 숫자가 더 높습니다.");
			System.out.println("====================================");
		}else if(com < user) {
			System.out.println((i+1)+"번째 입니다.");
			System.out.println("컴퓨터 숫자가 더 낮습니다.");
			System.out.println("====================================");
		}
		count = i+1;
	}
		System.out.println(count+"번째가 넘어 컴퓨터가 승리하였습니다.");
		System.out.println("게임이 종료되었습니다.");

}
}