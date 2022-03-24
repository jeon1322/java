package day05.ex;
/*
	문제 8 ]
		숫자형식의 다섯자리 정수형태 문자열을 입력받아서
		각자리 수의 합을 구하는 프로그램을 작성하세요.
		
		문자열로 입력받아서 문자로 변환후 처리하세요.
*/
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("다섯자리 숫자 입력 : ");
		String sno = sc.nextLine();
		
		int len = sno.length();
		
		int sum = 0;
		
		for(int i = 0; i < len; i++) {
			//각 자릿수 문자로 꺼낸다.
			char ch = sno.charAt(i);
			//문자를 숫자로 변환한다.
			int num = ch - '0';
			//합계변수에 누적시킨다.
			sum += num;
		}
			
		//출력한다.
		System.out.println("입력한 숫자 ["+sno+"] 의 각자리의 합은 "+sum+" 입니다.");
	}

}
