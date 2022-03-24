package day08;
/*
 
 		문자열 다섯개를 기억할 배열을 만들고
 		보기를 입력해 놓고
 		문제와 같이 화면에 출력하고
 		
 		사용자가 정답을 입력하도록 해서
 		답안이 맞앗는지 확인하는 프로그램을 작성하세요.
 		
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		String quest = "다음중 블랙핑크의 멤버가 아닌 사람은?";
		
		String[] ans = new String[5];
		ans[0] = "제니";
		ans[1] = "둘리";
		ans[2] = "리사";
		ans[3] = "로제";
		ans[4] = "지수";
		
		int  dap = 1;
		
		System.out.println(quest);
		
		for(int i = 0; i < ans.length; i++) {
			System.out.println("\t"+(i+1)+"번 "+ans[i]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.print("선택번호 : ");
		int no = sc.nextInt();
		String result = no-1 == dap ? "정답" : "오답";
		System.out.println("선택한 멤버는 "+ans[no-1]+" 이므로, "+result+"입니다.");
		
	}
}
