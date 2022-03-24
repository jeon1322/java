package ex;

import java.util.Scanner;

/*
문제 2 ]
	문자를 임의로 랜덤하게 입력한 후
	그 문자가 대문자이면 소문자로
	소문자이면 대문자로 변환하고 
	만약 특수문자이면 그문자 그대로 
	출력하는 프로그램을 작성하세요.
	
	참고 ]
		아스키 코드는
		
		특수문자 - 숫자( 0 - 9 ) - 
				특수문자 - 영문대문자( A ~ Z ) - 
				특수문자 - 소문자( a ~ z ) - 특수문자
	
	참고 ]
		문자열에서 문자를 추출하는 방법
			
			 문자열.charAt(위치값)
			 
		이때 위치값은 0 부터 시작한다.
		
		예 ]
			"abcd" 에서 두번째 문자를 추출하려면
			
			"abcd".charAt(1) ==> 'b'
*/
public class Ex02 {
	public static void main(String[] args) {
		//할일
		//알파벳 문자를 랜덤하게 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하시오 : ");
		//문자열 저장
		String str = sc.nextLine();
		//문자열에서 문자 추출
		char ch = str.charAt(0);
		char result =((ch >='A') && (ch <= 'Z')) ? ((char)(ch + ('a' - 'A'))) : ((ch >= 'a') && (ch <='z')) ? ((char)(ch + ('A' - 'a'))) : ch; 
		System.out.println("문자 : " +result);
		
		//받은 문자가 소문자인지 대문자인지 구분
		
		//소문자 -> 대문자, 대문자 ->소문자로 변환, 특수문자는 패스하고 변수에 저장한다.
		//저장한 변수 출력.
	}
}
