package day05.ex;
/*
 * 문제 5]
 * 		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
 * 		
 * 		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
 * 		가위, 바위, 보로 가정하고
 * 		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
 * 
 * 		누가 이겼는지를 확인하는 프로그램을 작성하세요.
 *	완료
 */

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int win=0, lose=0, tie=0;
		for(int start = 0; ; start++) {
		String s = "가위", r = "바위", p = "보";
		System.out.println("컴퓨터와 가위, 바위, 보");
		int com = (int)(Math.random()*(3 - 1 + 1) + 1);
		String gcom = (com == 1) ? s : ((com == 2) ? r : ((com == 3) ? p : "잘못 입력하셨습니다."));
		System.out.print("종료는 다른 키를 입력하세요.\n"+"1. 가위\t2.바위\t3.보\t4. 종료\n숫자로 선택하세요 : ");
		int user = sc.nextInt();
		String guser = (user == 1) ? s : ((user == 2) ? r : ((user == 3) ? p : "게임을 종료합니다."));
		System.out.println("컴퓨터 : "+gcom+"\n유저 : "+guser);
		int game = com - user;
		if(user == 4){
			System.out.println("=======================================================================================");
			System.out.println("승리 : "+win+"\t패배 : "+lose+"\t무승부 : "+tie);
			System.out.println("게임을 종료합니다.");
			System.out.println("=======================================================================================");
			break;
		}else if(game == -1 || game == 2) {
			win++;
			System.out.println("승리하셨습니다.");
			System.out.println("=======================================================================================");
		}else if(game == -2 || game == 1) {
			lose++;
			System.out.println("패배하셨습니다.");
			System.out.println("=======================================================================================");
		}else if(user == com) {
			tie++;
			System.out.println("무승부입니다.");
			System.out.println("=======================================================================================");
		}else{
			System.out.println("오류로 게임을 종료합니다.");
			System.out.println("=======================================================================================");
			break;
		}
		
		}
	}
}
